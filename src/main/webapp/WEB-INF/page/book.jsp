<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/book.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Sách</title>
</head>
<body>

    <jsp:include page="header.jsp"></jsp:include>

    <!-- Start Menu -->
    <div class="container-book">
        <div class="main-left">
            <div class="item-main-left">
                <div class="title-main-left">
                    <h3>THỂ LOẠI</h3>
                </div>
                <div class="content-main-left">
                    <ul>
                        <!-- <li><a href="">Văn học nước ngoài (120)</a></li>
                        <li><a href="">Kỹ năng (120)</a></li>
                        <li><a href="">Văn học Việt Nam (120)</a></li>
                        <li><a href="">Truyện tranh (120)</a></li> -->
                        <c:forEach items="${listCategory}" var="item">
                        	<li><a>${item.categoryName}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="item-main-left">
                <div class="title-main-left">
                    <h3>TÁC GIẢ</h3>
                </div>
                <div class="content-main-left">
                    <ul>
                        <!-- <li><a href="">Nguyễn Nhật Ánh <span>(120 quyển)</span></a></li>
                        <li><a href="">Phạm Ngọc Quân <span>(120 quyển)</span></a></li>
                        <li><a href="">Nguyễn Lê Anh <span>(120 quyển)</span></a></li>
                        <li><a href="">Trương Trung Hiếu <span>(120 quyển)</span></a></li>
                        <li><a href="">Trần Công Minh <span>(120 quyển)</span></a></li> -->
                        <c:forEach items="${listAuthor}" var="item">
                        	<li><a>${item.authorName}</a></li>
                        </c:forEach>	
                    </ul>
                </div>
            </div>
        </div>
        <div class="main-right">
            <div class="btn-search">
                <div class="prioritize">
                    <h3>Sắp xếp theo:</h3>
                    <ul>
                        <li><a href="">Sách mới</a></li>
                        <li><a href="">Lượt xem</a></li>
                        <li><a href="">Nổi bật</a></li>
                    </ul>
                </div>
                <div class="search">
                    <input type="text" placeholder="Sách bạn cần tìm...">
                    <button type="submit">Tìm kiếm</button>
                </div>
            </div>
            <div class="product-book">
                <div class="row">
                	<c:forEach items="${listBook}" var="item">
	                    <div class="col">
	                        <div class="img-book">
	                            <a href="">
	                                <img src="${pageContext.request.contextPath}/resources/page/img/book/${item.image}" alt="">
	                            </a>
	                        </div>
	                        <div class="content-book">
	                            <div class="title">
	                                <p><a href="">${item.bookName}</a></p>
	                            </div>
	                            <div class="author">
	                                <h3><a href="">${item.author.authorName}</a></h3>
	                            </div>
	                        </div>
	                    </div>
                	</c:forEach>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="img-book">
                            <a href="">
                                <img src="${pageContext.request.contextPath}/resources/page/img/product3.jpg" alt="">
                            </a>
                        </div>
                        <div class="content-book">
                            <div class="title">
                                <p><a href="">Biến bất kỳ ai thành khách hàng</a></p>
                            </div>
                            <div class="author">
                                <h3><a href="">C.J. Hayden</a></h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Menu -->

    <jsp:include page="footer.jsp"/>
    
</body>
</html>