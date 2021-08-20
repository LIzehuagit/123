package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.entity.Role;
import com.example.freemarkerdemo.entity.User;
import com.example.freemarkerdemo.service.RoleService;
import com.example.freemarkerdemo.service.UserService;
import com.example.freemarkerdemo.uitl.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService UserService;
    @Autowired
    private com.example.freemarkerdemo.service.RoleService RoleService;
    @RequestMapping("/adduser")
    public String adduser(User record){
        UserService.insert(record);
        return  "redirect:/selectuser";

    }



    @RequestMapping("/deleteuser")
    public String deleteuser(int uid){
        UserService.deleteByPrimaryKey(uid);
        return  "redirect:/selectuser";

    }
    @RequestMapping("/updateuser")
    public String updateuser(User record){
        UserService.updateByPrimaryKey(record);
        return  "redirect:/selectuser";

    }
    @RequestMapping("/selectuser")
    public ModelAndView selectuser(Page page,User user){

      Integer count = UserService.count(user);
        page.setZts(count);
        page.jisuan();
user.setQs(page.getQs());
        List<User> selectall = UserService.selectall(user);
        ModelAndView mav = new ModelAndView();
        if(page.getFlag()==1){
            mav.addObject("selectall",selectall);
            mav.setViewName("select_user(1)");
        }else{
            mav.addObject("selectall",selectall);
            mav.setViewName("select_user");
        }
        return mav;
    }
    @RequestMapping("/selectone")
    public ModelAndView selectone(int uid){
        User selectone = UserService.selectone(uid);
        List<Role> selectrole = RoleService.selectrole();
        ModelAndView mav = new ModelAndView();
        mav.addObject("selectone",selectone);
        mav.addObject("selectrole",selectrole);
        mav.setViewName("update_user");
        return mav;

    }


    @RequestMapping("deleteall")
    public void deleteall(String ids , HttpServletResponse req) throws IOException {
        req.setCharacterEncoding("utf-8");
        UserService.deleteall(ids);
        req.getWriter().write("删除了");

    }

}
