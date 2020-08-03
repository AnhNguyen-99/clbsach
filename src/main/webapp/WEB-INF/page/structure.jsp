<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/structure.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Trang chủ</title>
</head>
<body>

    <jsp:include page="header.jsp"></jsp:include>

    <!-- Start Menu -->
    <div class="container-structure">
        <div class="item-structure">
            <img src="${pageContext.request.contextPath}/resources/page/img/cocau.PNG" alt="">
        </div>
        <div class="item-structure">
            <div class="news-structure">
                <div class="title-news-structure">
                    <i class="far fa-newspaper"></i>
                    <span>Tin tức</span>
                </div>
                <div class="content-news-structure">
                    <ul>
                        <li><a href="">Ra mắt 'Harry Potter' có tranh minh họa</a></li>
                        <li><a href="">Nguyễn Phi Vân ra sách về trí tuệ nhân tạo</a></li>
                        <li><a href="">Bác sĩ viết sách về làm bạn với con</a></li>
                        <li><a href="">Cuộc sống miền Bắc hơn 100 năm trước qua trang sách</a></li>
                        <li><a href="">Xem thêm...</a></li>
                    </ul>
                </div>
            </div>
            <div class="video-structure">
                <div class="title-video-structure">
                    <i class="fas fa-video"></i>
                    <span>Video</span>
                </div>
                <div class="content-video-structure">
                    <div class="item-video item1-video">
                        <iframe width="100%" src="https://www.youtube.com/embed/VGBoHSlv5Ys" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <div class="item-video item2-video">
                        <iframe width="100%" src="https://www.youtube.com/embed/VGBoHSlv5Ys" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <div class="item-video item3-video">
                        <iframe width="100%" src="https://www.youtube.com/embed/VGBoHSlv5Ys" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Menu -->

    <jsp:include page="footer.jsp"></jsp:include>
    
</body>
</html>