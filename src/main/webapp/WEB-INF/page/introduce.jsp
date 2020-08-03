<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/introduce.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
	<script src="https://kit.fontawesome.com/a81368914c.js"></script>
    <title>Trang chủ</title>
</head>
<body>
    <!-- Start Header -->
    <jsp:include page="header.jsp"/>
    <!-- End Header -->

    <!-- Start Banner -->
    <div class="banner" id="banner-slide">
        <figure>
            <img src="img/book1.jpg" alt="">
            <!-- <img src="img/book2.jpg" alt="">
            <img src="img/book1.jpg" alt="">
            <img src="img/book3.jpg" alt="">
            <img src="img/book1.jpg" alt=""> -->
        </figure>
    </div>
    <!-- End Banner -->

    <!-- Start Menu -->
    <div class="container-menu-introduce">
        <div class="grid-introduce">
            <div class="item-introduce item1-introduce">
                <div class="title-menu-introduce">
                    <i class="fas fa-book"></i>
                    <span>Nguồn gốc</span>
                </div>
                <div class="content-menu-introduce">
                    <ul>
                        <li>Là CLB SVHĐ thứ 2 được thành lập trong khối SVHĐ Đại học.</li>
                        <li>Thuộc dự án sách và hành động (tiền thân là chạy xuyên Việt).</li>
                        <li><a href="">Xem thêm...</a></li>
                    </ul>
                </div>
            </div>
            <div class="item-introduce item2-introduce">
                <div class="title-menu-introduce">
                    <i class="fas fa-home"></i>
                    <span>Thành lập</span>
                </div>
                <div class="content-menu-introduce">
                    <ul>
                        <li>CLB được thành lập và điều hành bởi 1 nhóm sinh vien trường Đại học Mỏ - Địa chất.</li>
                        <li>Là CLB trực thuộc Đoàn trường và Hội sinh viên.</li>
                        <li><a href="">Xem thêm...</a></li>
                    </ul>
                </div>
            </div>
            <div class="item-introduce item3-introduce">
                <div class="title-menu-introduce">
                    <i class="fas fa-clipboard-list"></i>
                    <span>Nhiệm vụ</span>
                </div>
                <div class="content-menu-introduce">
                    <ul>
                        <li>Phát triển văn hóa đọc tại trường Đại học.</li>
                        <li>Đọc sách đi đôi với hành động thiết thực, có ý nghĩa.</li>
                        <li>Tạo sân chơi, kỹ năng, training...</li>
                        <li><a href="">Xem thêm...</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <!-- Start lịch sử hình thành -->
        <div class="container-history">
            <div class="title-history">
                <h3>LỊCH SỬ HÌNH THÀNH</h3>
            </div>
            <div class="content-history">
                <p>Thành lập ngày 08/04/2014, dưới sự đồng ý của Đoàn trường,
                    Hội sinh viên, thư viện Trường Đại học Mỏ - Địa chất.
                    Được ban giám hiệu nhà trường công nhận chính thức vào tháng 8 năm 2016.
                    Trực thuộc dự án Sách và Hành động, là CLB thứ 2 được thành lập trong khối CLB SVHĐ.
                </p>
            </div>
        </div>
        <div class="img-tamnhin">
            <img src="${pageContext.request.contextPath}/resources/page/img/tamnhin.jpg" alt="">
        </div>
        <div class="giaithuong">
            <h3>Giải thưởng và thành tựu</h3>
            <ul>
                <li>7/2015: Giải thưởng câu lạc bộ đi đầu của trường Đại học Mỏ - Địa chất.</li>
                <li>7/2016: Giải thưởng câu lạc bộ đi đầu của trường Đại học Mỏ - Địa chất.</li>
                <li>7/2017: Giải thưởng câu lạc bộ đi đầu của trường Đại học Mỏ - Địa chất.</li>
                <li>7/2018: Giải thưởng câu lạc bộ đi đầu của trường Đại học Mỏ - Địa chất.</li>
                <li>7/2019: Giải thưởng câu lạc bộ đi đầu của trường Đại học Mỏ - Địa chất.</li>
            </ul>
        </div>
        <div class="title-chunhiem">
            <h3>CÁC TẤM GƯƠNG TIÊU BIỂU CỦA CLB SÁCH HUMG</h3>
        </div>
        <div class="chunhiem">
            <div class="item-chunhiem">
                <div class="item1-chunhiem">
                    <div class="img-chunhiem">
                        <img src="${pageContext.request.contextPath}/resources/page/img/cm2.jpeg" alt="">
                    </div>
                    <div class="content-chunhiem">
                        <h3>Nguyễn Văn A</h3>
                        <p>Chủ nhiệm clb Sách và Hành động HUMG nhiệm kỳ 1</p>
                    </div>
                </div>
                <div class="item1-chunhiem">
                    <div class="img-chunhiem">
                        <img src="${pageContext.request.contextPath}/resources/page/img/cm2.jpeg" alt="">
                    </div>
                    <div class="content-chunhiem">
                        <h3>Nguyễn Văn A</h3>
                        <p>Chủ nhiệm clb Sách và Hành động HUMG nhiệm kỳ 1</p>
                    </div>
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