<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/page/css/index.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/page/css/info.css">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/a81368914c.js"></script>
<title>Trang chủ</title>
</head>
<body>
	<!-- Start Header -->
	<jsp:include page="header.jsp" />
	<!-- End Header -->

	<!-- Start Menu -->
	<div class="container-info">
		<div class="item-info">
			<img
				src="${pageContext.request.contextPath}/resources/page/img/book2.jpg"
				alt="">
		</div>
		<div class="item-info">
			<div class="info1">
				<div class="title-info">
					<h3>Thông tin cá nhân</h3>
				</div>
				<div class="content-info">
					<div class="item-content-info">
						<h3>Tài khoản</h3>
						<input type="text" value="${user.username}" disabled="disabled">
					</div>
					<div class="item-content-info">
						<h3>Họ và tên</h3>
						<input type="text" value="${user.fullName}" disabled="disabled">
					</div>
					<!-- <div class="item-content-info">
                        <h3></h3>
                        <a href=""><button>Thay đổi mật khẩu</button></a>
                    </div> -->
				</div>
			</div>
			<div class="info2">
				<div class="title-info">
					<h3>Email</h3>
				</div>
				<div class="content-info">
					<div class="item-content-info">
						<h3>Email</h3>
						<input type="text" value="${user.mail}" disabled="disabled">
					</div>
				</div>
			</div>
			<div class="info3">
				<div class="title-info">
					<h3>Thay đổi mật khẩu</h3>
				</div>
				<div class="content-info">
					<form:form action="${pageContext.request.contextPath}/thaydoimatkhau" modelAttribute="user" method="POST">
						<div class="item-content-info">
							<h3>Mật khẩu hiện tại</h3>
							<input type="password" name="password">
						</div>
						<div class="item-content-info">
							<h3>Nhập mật khẩu mới</h3>
							<input type="password" name="password_1">
						</div>
						<div class="item-content-info">
							<h3>Nhập lại mật khẩu</h3>
							<input type="password" name="password_2">
						</div>
						<div class="item-content-info">
							<h3></h3>
							<div>
								<button type="submit">Lưu</button>
								<button type="reset">Hủy</button>
							</div>
						</div>
					</form:form>
				</div>
				<c:if test="${status == 1}">
					<script type="text/javascript">
						alert('Tài khoản và mật khẩu không chính xác!!!');
					</script>
				</c:if>
				<c:if test="${status == 2}">
					<script type="text/javascript">
						alert('Tài khoản và mật khẩu không chính xác!!!');
					</script>
				</c:if>
				 <c:if test="${status == 3}">
        	<script type="text/javascript">
	    	alert('Tài khoản và mật khẩu không chính xác!!!');
    	</script>
        </c:if>
			</div>
		</div>
	</div>
	<!-- End Menu -->

	<!-- Start Footer -->
	<jsp:include page="footer.jsp" />
	<!-- End Footer -->
</body>
</html>