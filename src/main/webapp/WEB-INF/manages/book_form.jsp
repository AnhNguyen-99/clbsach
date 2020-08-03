<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Tạo mới book</title>
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
							<div class="panel-heading">Tạo danh book</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-12">
										<!-- Form tạo book -->
										<form:form action="${pageContext.request.contextPath}/manages/book/save" method="POST" modelAttribute="book" enctype="multipart/form-data">
											<!-- Danh mục -->
											<form:input type="hidden" path="bookId"/>
											<div class="form-group">
												<label>Danh mục</label>
												 <form:select path="category.categoryId" class="form-control">    
	                                                <option value="-1">Chọn một loại</option>
	                                                <c:forEach var="c" items="${listCategory}">
	                                                    <option value="${c.categoryId}">${c.categoryName}</option>
	                                                </c:forEach>
	                                            </form:select>
											</div>
											
											<!-- Tác giả -->
											<div class="form-group">
												<label>Tác giả</label>
												<form:select path="author.authorId" class="form-control">    
	                                                <option value="-1">Chọn một tác giả</option>
	                                                <c:forEach var="author" items="${listAuthor}">
	                                                    <option value="${author.authorId}">${author.authorName}</option>
	                                                </c:forEach>
	                                            </form:select>
											</div>
											
											<!-- NXB -->
											<div class="form-group">
												<label>NXB</label>
												<form:select path="publishing.publishingId" class="form-control">    
	                                                <option value="-1">Chọn một NXB</option>
	                                                <c:forEach var="publishing" items="${listPublishing}">
	                                                    <option value="${publishing.publishingId}">${publishing.publishingName}</option>
	                                                </c:forEach>
	                                            </form:select>
											</div>
											
											<!-- Tên sách -->
											<div class="form-group">
												<label>Tên sách</label>
												<form:input class="form-control" path="bookName"/>
											</div>
											
											<!-- Số lượng -->
											<div class="form-group">
												<label>Số lượng</label>
												<form:input type="number" class="form-control" path="quantity" min="1" max="100"/>
											</div>
											
											<!-- Năm XB -->
											<div class="form-group">
												<label>Năm xuất bản</label>
												<form:input type="number" class="form-control" path="yearPublishing"/>
											</div>
											
											<!-- Ảnh bìa -->
											<div class="form-group">
												<label>Ảnh bìa sách</label>
												<form:input type="file" class="form-control" path="image"/>
											</div>
											<div class="form-group">
												<input type="reset" class="btn btn-default"	value="Hủy"> 
												<input type="submit" class="btn btn-primary" value="Lưu">
											</div>
										</form:form>
									</div>

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
