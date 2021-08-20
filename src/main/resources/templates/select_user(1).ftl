<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<table>
    <tr>
        <td><input type="checkbox" id="checkedAll"/></td>
        <td>ID</td>
        <td>姓名</td>
        <td>
            角色
            <a href="/selectrole">添加</a>
        </td>
    </tr>
    <#list selectall as u>
        <tr>
            <td><input type="checkbox" name="checkedOne"  value="${u.uid}"/></td>
            <td>${u.uid}</td>
            <td>${u.uname}</td>
            <td>${u.role.name}</td>
            <td>
                <a href="/deleteuser?uid=${u.uid}">删除</a>
                <a href="/selectone?uid=${u.uid}">修改</a>
            </td>
        </tr>
    </#list>

</table>
<a href="javascript:;" onclick="fenye(1)" >首页</a>
<a href="javascript:;" onclick="fenye(${page.dqy-1}<=1?1:${page.dqy-1})">上一页</a>
<a href="javascript:;" onclick="fenye(${page.dqy+1}>=${page.zys}?${page.zys}:${page.dqy+1})">下一页</a>
<a href="javascript:;" onclick="fenye(${page.zys})">尾页</a>
跳转到:<input type="text" size="1" id="go"> <input type="button" value="Go" onclick="go()">
当前${page.dqy}页共${page.zys}页${page.zts}条

</body>
</html>
