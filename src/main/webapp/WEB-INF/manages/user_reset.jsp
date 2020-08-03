<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Reset tài khoản độc giả</title>
</head>
<body>

	<div id="wrapper">

		<jsp:include page="menu.jsp"></jsp:include>
		
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">Forms</h1>
					</div>

				</div>

				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-default">
							<div class="panel-heading">Reset mật khẩu</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<!-- Form tạo danh mục -->
										<form action="${pageContext.request.contextPath}/manages/user/reset" method="GET">
											<div class="form-group">
												<label>Tên tài khoản</label>
												 <input class="form-control" type="text" name="username"/>
											</div>
											<div class="form-group">
												<input type="reset" class="btn btn-default"	value="Hủy"> 
												<input type="submit" class="btn btn-primary" value="Reset">
											</div>
										</form>
									</div>
									<c:if test="${status == 1}">
										<script type="text/javascript">
											alert("Rest mật khẩu thành công!!!");
									        window.open('${pageContext.request.contextPath}/manages/user/list','_self', 1);
										</script>
									</c:if>
									<c:if test="${status == 0}">
										<script type="text/javascript">
											alert('Reset không thành công');
										</script>
									</c:if>
								</div>

							</div>

						</div>

					</div>

				</div>

			</div>

		</div>

	</div>

	<script src="${pageContext.request.contextPath}/resources/manages/js/jquery.min.js"></script>

	<script src="${pageContext.request.contextPath}/resources/manages/js/bootstrap.min.js"></script>

	<script src="${pageContext.request.contextPath}/resources/manages/js/metisMenu.min.js"></script>

	<script src="${pageContext.request.contextPath}/resources/manages/js/startmin.js"></script>

</body>
</html>
