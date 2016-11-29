<%--
  Created by IntelliJ IDEA.
  User: simple
  Date: 2016/11/16
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script src="scripts/jquery-1.8.2.js"></script>
  <script type="text/javascript">

    $(document).ready(function(){
      $("#btn1").click(function(){
        $.ajax({
          type:"post",
          url: "/account/login",
          contentType:"application/json;charset=utf-8",
          success: function (data) {
            console.log(data);
            /*console.log(JSON.parse(data));*/

            /*alert(data[0].password);*/
          }
        });
      });
      $("#btn2").click(function(){
        $.ajax({
          type:"post",
          url: "/test/login2",
          contentType:"application/json;charset=utf-8",
          success: function (data) {
            alert(data);
          }
        });
      });

    });

  </script>
</head>
<body>
index2
<input type="button" id="btn1" value="Ajax请求login1">
<input type="button" id="btn2" value="Ajax请求login2">
</body>
</html>
