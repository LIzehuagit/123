<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<form action="/adduser" method="post">
    ID<input type="text" name="uid">
用户名:<input type="text" name="uname"><br>
角色:<select name="rid">
    <#list selectrole as r>
    <option value="${r.rid}">${r.name}</option>
    </#list>
</select>
    <input type="submit" value="添加">
</form>
</body>
</html>
