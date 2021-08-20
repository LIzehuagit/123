<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<form action="/updateuser" method="post">
    <input type="hidden" name="uid" value="${selectone.uid}"><br>
    用户名:<input type="text" name="uname" value="${selectone.uname}"><br>
    <select name="rid">
        <#list selectrole as r>
<option value="${r.rid}">${r.name}</option>
        </#list>

    </select><br>
    <input type="submit" value="修改">

</form>
</body>
</html>