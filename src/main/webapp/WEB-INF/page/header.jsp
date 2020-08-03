<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/page/css/index.css">
</head>
<body>
	<div class="container-head">
        <div class="img">
            <img src="${pageContext.request.contextPath}/resources/page/img/head.png" alt="">
        </div>
        <div class="login">
            <h3>Cho mượn sách thứ 3, 6 hàng tuần tại sảnh C12</h3>
            <c:if test="${user == null}">
	            <a href="${pageContext.request.contextPath}/login"><button class="btn-login">Đăng nhập</button></a>
            </c:if>
        </div>
        <div class="hr"></div>
        <nav class="navbar">
            <ul>
                <a href="${pageContext.request.contextPath}/trangchu"><li>TRANG CHỦ</li></a>
                <a href="${pageContext.request.contextPath}/book"><li>SÁCH</li></a>
                <a href="${pageContext.request.contextPath}/gioithieu"><li>GIỚI THIỆU</li></a>
                <a href="${pageContext.request.contextPath}/co-cau-to-chuc"><li>CƠ CẤU TỔ CHỨC</li></a>
                <c:if test="${user != null}">
	                <a href="${pageContext.request.contextPath}/extension"><li>XIN GIA HẠN</li></a>
	                <a href="${pageContext.request.contextPath}/lich-su-muon"><li>XEM LỊCH SỬ MƯỢN</li></a>
	                <a href="${pageContext.request.contextPath}/thaydoithongtin"><li>SỬA THÔNG TIN CÁ NHÂN</li></a>
                </c:if>
                <a href="${pageContext.request.contextPath}/phan-hoi"><li>GÓP Ý</li></a>
            </ul>
        </nav>
    </div> 
</body>
</html>