<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String param=request.getServletContext().getInitParameter("contextConfigLocation");
	out.print("이 어플리케이션이 가동 될때 심어놓은 값은 : "+param);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=button] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=button]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function(){
	$("input[type='button']").click(function(){
		requestLogin();
	});
});

function requestLogin(){
	$("form").attr({
		method:"post",
		action:"/admin/login"
	});
	$("form").submit();
}

</script>
</head>
<body>

<h3>관리자 로그인 </h3>

<div class="container">
  <form>
    <input type="text" name="id" placeholder="Your admin id..">
    <input type="text" name="pass" placeholder="Your password..">
    <input type="button" value="로그인">
  </form>
</div>

</body>
</html>
