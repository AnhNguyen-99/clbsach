<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/extension.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Gia hạn thời gian mượn</title>
</head>
<body>
    <!-- Start Header -->
    <jsp:include page="header.jsp"/>
    <!-- End Header -->

    <!-- Start Menu -->
    <div class="container-extension">
        <div class="item-extension item1-extension">
            <div class="title-news-extension">
                <i class="far fa-newspaper"></i>
                <span>Tin tức</span>
            </div>
            <div class="content-news-extension">
                <ul>
                    <li><a href="">Ra mắt 'Harry Potter' có tranh minh họa</a></li>
                    <li><a href="">Nguyễn Phi Vân ra sách về trí tuệ nhân tạo</a></li>
                    <li><a href="">Bác sĩ viết sách về làm bạn với con</a></li>
                    <li><a href="">Cuộc sống miền Bắc hơn 100 năm trước qua trang sách</a></li>
                    <li><a href="">Xem thêm...</a></li>
                </ul>
            </div>
        </div>
        <div class="item-extension item2-extension">
            <form action="">
                <div class="idBook">
                    <h3 class="title-extension">Mã sách</h3>
                    <input class="txt" type="text" placeholder="Mã sách muốn gia hạn">
                </div>
                <div class="nameBook">
                    <h3 class="title-extension">Tên sách</h3>
                    <input class="txt" type="text" placeholder="Tên sách muốn gia hạn">
                </div>
                <div class="datetime">
                    <h3 class="title-extension">Ngày mượn</h3>
                    <input class="txt" type="date" placeholder="Ngày mượn sách">
                </div>
                <div class="btn-extension">
                    <button class="btn-submit" type="submit">Gia hạn</button>
                    <button class="btn-reset" type="reset">Hủy</button>
                </div>
            </form>
        </div>
        <div class="item-extension item3-extension">
            <div class="title-video-extension">
                <i class="fas fa-video"></i>
                <span>Video</span>
            </div>
            <div class="content-video-extension">
                <div class="item-video item1-video">
                    <iframe width="100%" src="https://www.youtube.com/embed/VGBoHSlv5Ys" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
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