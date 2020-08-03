<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/login.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<img class="wave" src="${pageContext.request.contextPath}/resources/page/img/wave.png">
	<div class="container">
		<div class="img">
			<img src="${pageContext.request.contextPath}/resources/page/img/img.svg">
		</div>
		<div class="login-content">
			<form:form action="${pageContext.request.contextPath}/manages/login" modelAttribute="account" method="POST">
				<img src="${pageContext.request.contextPath}/resources/page/img/logo.png">
				<h3 class="title">CLB SÁCH VÀ HÀNH ĐỘNG HUMG</h3>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-user"></i>
           		   </div>
           		   <div class="div">
           		   		<h5>Tài khoản</h5>
           		   		<form:input type="text" class="input" path="accountName"/>
           		   </div>
           		</div>
           		<div class="input-div pass">
           		   <div class="i"> 
           		    	<i class="fas fa-lock"></i>
           		   </div>
           		   <div class="div">
           		    	<h5>Mật khẩu</h5>
           		    	<form:password class="input" path="accountPass"/>
            	   </div>
            	</div>
            	<a href="#">Quên mật khẩu!</a>
            	<input type="submit" class="btn" value="Đăng nhập">
            </form:form>
        </div>
        <c:if test="${status == 1}">
        	<script type="text/javascript">
	    	alert('Tài khoản và mật khẩu không chính xác!!!');
    	</script>
        </c:if>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/page/js/login.js"></script>
</body>
</html>
