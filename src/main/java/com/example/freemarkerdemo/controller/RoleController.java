package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.entity.Role;
import com.example.freemarkerdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService RoleService;
    @RequestMapping("selectrole")
    public ModelAndView selectrole(){
        List<Role> selectrole = RoleService.selectrole();
      ModelAndView mav = new ModelAndView();
      mav.addObject("selectrole",selectrole);
      mav.setViewName("add_user");
      return mav;

    }
}
