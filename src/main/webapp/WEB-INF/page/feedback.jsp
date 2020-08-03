<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/feedback.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Trang chủ</title>
</head>
<body>
    <!-- Start Header -->
    <jsp:include page="header.jsp"/>
    <!-- End Header -->

    <!-- Start Menu -->
    <h3>ĐÓNG GÓP Ý KIẾN, PHẢN HỒI VỚI CLB SÁCH VÀ HÀNH ĐỘNG HUMG</h3>

    <div class="container-feedback">
	    <form:form action="${pageContext.request.contextPath}/save_feedback" method="POST" modelAttribute="feedBack">
	        <label for="fname">Họ và tên</label>
	        <form:input class="txt-feedback" type="text" id="fname" name="firstname" placeholder="Tên của bạn.." path="username"/>
	
	        <label for="lname">Email</label>
	        <form:input class="txt-feedback" type="text" id="lname" name="lastname" placeholder="Email của bạn.." path="mail"/>
	
	        <label for="subject">Phản hồi</label>
	        <form:textarea class="txt-feedback" id="subject" name="subject" placeholder="Viết phản hồi.." style="height:200px" path="content"/>
	
	        <input class="btn-feedback" type="submit" value="Xác nhận">
	        
	    </form:form>
    </div>
    
    <c:if test="${status == 1}">
    	<script type="text/javascript">
	    	alert('Phản hồi thành công');
	        window.open('${pageContext.request.contextPath}/trangchu','_self', 1);
    	</script>
    </c:if>
    
    <c:if test="${status == 0}">
    	<script type="text/javascript">
	    	alert('Phản hồi không thành công');
    	</script>
    </c:if>
    <!-- End Menu -->

    <!-- Start Footer -->
    <jsp:include page="footer.jsp"/>
    <!-- End Footer -->
</body>
</html>