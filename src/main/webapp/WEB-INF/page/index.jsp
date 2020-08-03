<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Trang chủ</title>
</head>
<body>

    <jsp:include page="header.jsp"></jsp:include>

    <!-- Start Banner -->
    <div class="banner" id="banner-slide">
        <figure>
            <img src="${pageContext.request.contextPath}/resources/page/img/book1.jpg" alt="">
            <!-- <img src="img/book2.jpg" alt="">
            <img src="img/book1.jpg" alt="">
            <img src="img/book3.jpg" alt="">
            <img src="img/book1.jpg" alt=""> -->
        </figure>
    </div>
    <!-- End Banner -->

    <!-- Start Menu -->
    <div class="title-menu">
        <h3>Thông tin chung</h3>
    </div>
    <div class="container-menu">
        <div class="item item1">
            <div class="img-item">
                <a href="">
                    <img src="${pageContext.request.contextPath}/resources/page/img/book2.jpg" alt="">
                </a>
            </div>
            <div class="noidung">
                <div class="title-item">
                    <a href="">
                        <h3>Ngày sách 2020</h3>
                    </a>
                </div>
                <div class="time-item">
                    <i class="fas fa-clock"></i>
                    <span>21/07/2020</span>
                </div>
                <div class="content-item">
                    <a href="">
                        <p>Nếu bạn chỉ đọc những cuốn sách mà mọi người đang đọc</p>
                    </a>
                </div>
            </div>
        </div>
        <div class="item item2">
            <div class="img-item">
                <a href="">
                    <img src="${pageContext.request.contextPath}/resources/page/img/book2.jpg" alt="">
                </a>
            </div>
            <div class="noidung">
                <div class="title-item">
                    <a href="">
                        <h3>Ngày sách 2020</h3>
                    </a>
                </div>
                <div class="time-item">
                    <i class="fas fa-clock"></i>
                    <span>21/07/2020</span>
                </div>
                <div class="content-item">
                    <a href="">
                        <p>Nếu bạn chỉ đọc những cuốn sách mà mọi người đang đọc</p>
                    </a>
                </div>
            </div>
        </div>
        <div class="item item3">
            <div class="img-item">
                <a href="">
                    <img src="${pageContext.request.contextPath}/resources/page/img/book2.jpg" alt="">
                </a>
            </div>
            <div class="noidung">
                <div class="title-item">
                    <a href="">
                        <h3>Ngày sách 2020</h3>
                    </a>
                </div>
                <div class="time-item">
                    <i class="fas fa-clock"></i>
                    <span>21/07/2020</span>
                </div>
                <div class="content-item">
                    <a href="">
                        <p>Nếu bạn chỉ đọc những cuốn sách mà mọi người đang đọc</p>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <!-- Start News -->
    <div class="news">
        <div class="title-news">
            <i class="far fa-newspaper"></i>
            <span>Bản tin cũ</span>
        </div>
        <div class="hr-news"></div>
        <div class="content-news">
            <ul>
                <li><a href="">Lịch nghỉ hè của câu lạc bộ</a></li>
                <li><a href="">Sắp ra những đầu sách hay sau đợt nghỉ hè</a></li>
                <li><a href="">Bạn đã từng đọc sách</a></li>
                <li><a href="">Ra mắt 'Harry Potter' có tranh minh họa</a></li>
                <li><a href="">Nguyễn Phi Vân ra sách về trí tuệ nhân tạo</a></li>
                <li><a href="">Bác sĩ viết sách về làm bạn với con</a></li>
                <li><a href="">Ra mắt tiền truyện 'The Great Gastby'</a></li>
                <li><a href="">Kỳ nghỉ tết huyền thoại</a></li>
                <li><a href="">Những câu chuyện có thể bạn chưa biết về HUMG</a></li>
                <li><a href="">Xem thêm...</a></li>
            </ul>
        </div>
    </div>

    <!-- Start event -->
    <div class="container-event">
        <div class="item-event item1-event">
            <div class="title-item-event">
                <h3>Tin tức và sự kiện</h3>
            </div>
            <div class="noidung-event">
                <ul>
                    <li><a href="">Ra mắt 'Harry Potter' có tranh minh họa</a></li>
                    <li><a href="">Nguyễn Phi Vân ra sách về trí tuệ nhân tạo</a></li>
                    <li><a href="">Bác sĩ viết sách về làm bạn với con</a></li>
                    <li><a href="">Cuộc sống miền Bắc hơn 100 năm trước qua trang sách</a></li>
                    <li><a href="">Xem thêm...</a></li>
                </ul>
            </div>
        </div>
        <div class="item-event item2-event">
            <div class="title-item-event">
                <h3>Câu hỏi thường gặp</h3>
            </div>
            <div class="noidung-event">
                <ul>
                    <li><a href="">CLB Sách có những phòng chức năng nào? Ở đâu?</a></li>
                    <li><a href="">Đối tượng nào được sử dụng sách của CLB?</a></li>
                    <li><a href="">Bạn đọc không thuộc đối tượng trong trường, nhưng muốn sử dụng sách thì phải làm thủ tục gì?</a></li>
                    <li><a href="">Tôi có được mang sách ra ngoài  không?</a></li>
                    <li><a href="">Xem thêm...</a></li>
                </ul>
            </div>
        </div>
    </div>

    <!-- Start Video -->
    <div class="video">
        <div class="title-video">
            <i class="fas fa-video"></i>
            <span>Video</span>
        </div>
        <div class="hr-video"></div>
        <div class="content-video">
            <div class="item-video item1-video">
                <iframe width="100%" src="https://www.youtube.com/embed/VGBoHSlv5Ys" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
            <div class="item-video item2-video">
                <iframe width="100%" src="https://www.youtube.com/embed/wEaR9pjX_EM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
            <div class="item-video item3-video">
                <iframe width="100%" src="https://www.youtube.com/embed/Th1WgeLB3GM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
        </div>
    </div>
    <!-- End Menu -->

	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>