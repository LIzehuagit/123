<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<script src="/js/jquery-1.8.2.min.js"></script>
<script>
  function fenye(dqy){
      $.ajax({
          url:"selectuser",
          type:"post",
          data: {"dqy":dqy,"flag":1},
          dataType:"text",
          success:function (data){
              $('#div1').html(data);
          }

      })
  }


  $(function(){
    $('#checkedAll').click(function(){
      if (this.checked == true) {
        $('[name="checkedOne"]').attr("checked",true);
      } else {
        $('[name="checkedOne"]').attr("checked",false);
      }

    })

  })




  function go(){


    $.ajax({
      url:"selectuser",
      type:"post",
      data: {"dqy":$('#go').val()>${page.zys}?${page.zys}:$('#go').val() && $('#go').val()<1?1:$('#go').val(),"flag":1},
      dataType:"text",
      success:function (data){
        $('#div1').html(data);
      }

    })
  }


  function mohu(dqy) {



    $.ajax({
      url:"selectuser",
      type:"post",
      data: {"uname":$('#uname').val(),"flag":1,"dqy":dqy},
      dataType:"text",
      success:function (data){
        $('#div1').html(data);
      }

    })

  }





  function deleteAll(){
    var check = $('[name="checkedOne"]:checked');

    var ids = "";
    for(var i = 0;i<check.length;i++){
      ids += check[i].value + ",";
    }
    ids = ids.substr(0, ids.length-1)
    $.ajax({
      url:"deleteall",
      type:"post",
      data:{"ids":ids},
      dataType:"text",
      success:function (data){
        alert(data+check.length+"条");
        window.location.href="selectuser";
      }

    })




  }

</script>
<body>
用户名:<input type="text" id="uname"><br>
<input type="button" value="搜索" onclick="mohu()">
<input type="button" onclick="deleteAll()" value="批量删除">
<div id="div1">
<#include "select_user(1).ftl"/>
</div>




</body>
</html>
