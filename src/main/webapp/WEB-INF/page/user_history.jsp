<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/history.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Trang chủ</title>
</head>
<body>
    <!-- Start Header -->
    <jsp:include page="header.jsp"/>
    <!-- End Header -->

    <!-- Start Menu -->
    <div class="container-history">
        <h3>Lịch sử mượn</h3>
        <div class="item-history">
            <div class="item1-history">
                <div class="img-history">
                    <a href="">
                        <img src="img/product3.jpg" alt="">
                    </a>
                </div>
                <div class="content-history">
                    <a href="">
                        <h3>Đắc nhân tâm <span>(1)</span></h3>
                    </a>
                    <p>Tác giả: Nguyễn Hiền Lê</p>
                </div>
            </div>
            <div class="item1-history">
                <div class="img-history">
                    <a href="">
                        <img src="img/product3.jpg" alt="">
                    </a>
                </div>
                <div class="content-history">
                    <a href="">
                        <h3>Đắc nhân tâm <span>(1)</span></h3>
                    </a>
                    <p>Tác giả: Nguyễn Hiền Lê</p>
                </div>
            </div>
            <div class="item1-history">
                <div class="img-history">
                    <a href="">
                        <img src="img/product3.jpg" alt="">
                    </a>
                </div>
                <div class="content-history">
                    <a href="">
                        <h3>Đắc nhân tâm <span>(1)</span></h3>
                    </a>
                    <p>Tác giả: Nguyễn Hiền Lê</p>
                </div>
            </div>
        </div>
    </div>
    <!-- End Menu -->

    <!-- Start Footer -->
    <jsp:include page="footer.jsp"/>
    <!-- End Footer -->
</body>
</html>