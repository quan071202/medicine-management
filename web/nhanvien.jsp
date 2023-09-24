<%-- 
    Document   : nhanvien
    Created on : May 7, 2022, 9:25:47 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nhan vien</title>
        <link rel="stylesheet" href="reset.css">
  <link rel="stylesheet" href="base.css">
  <link rel="stylesheet" href="main.css">
  <link rel="stylesheet" href="account.css">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  
    </head>
    <body>
        <div class="container">
    <div class="container_header">
      <header class="header">
        <div class="grid">
          <nav class="header_nav">
            <ul class="header_list">
              <li class="nav_item">Quản Lý Tài khoản</li>

            </ul>

               <ul class="header_list">
                <li class="nav_item font-weight nav_item-line account_hover">Xin chào ${sessionScope.acc.username}!
                <div class="account">
                  <a href="#">Tài khoản</a>
                </div>
              </li>

              <li class="nav_item font-weight"> <a href="logout">Đăng xuất</a> </li>
            </ul>
          </nav>
        </div>
      </header>
    </div>
    <div class="content">
      <div class="sidebar-body w3-bar-block  w3-card " style="width:20%">
        <a href="home" class="w3-bar-item w3-button" >Trang chủ</a>
        <c:if test="${sessionScope.acc.session == 2 || sessionScope.acc.session == 3}">
        <div class="w3-dropdown-hover">
          <!-- CHI NHÁNH -->
          <button class="w3-button">Các chi nhánh
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="w3-dropdown-content w3-bar-block">
             <c:if test="${sessionScope.acc.maCH == 1}">
            <a href="manager" class="w3-bar-item w3-button" ">Cửa hàng 1</a>
            </c:if>
            <c:if test="${sessionScope.acc.maCH == 2}">
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 2</a>
            </c:if>
               <c:if test="${sessionScope.acc.maCH == 3}">
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 3</a>
               </c:if>
               <c:if test="${sessionScope.acc.maCH == 4}">
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 4</a>
               </c:if>
               <c:if test="${sessionScope.acc.maCH == 5}">
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 5</a>
            </c:if>
          </div>
        </div>
        <a href="managerNhapkho" class="w3-bar-item w3-button ">Nhập kho</a>
        </c:if>
      <c:if test="${sessionScope.acc.session == 1 || sessionScope.acc.session == 2}">
        <a href="# " class="w3-bar-item w3-button ">Kế hoạch nhập thuốc</a>        
        <a href="doanhthu" class="w3-bar-item w3-button ">Doanh thu</a>
        <a href="quanlytaikhoan" class="w3-bar-item w3-button " style="color: #0984e3;">Quản lý nhân viên</a>
        </c:if>
      </div>

            <div class="w3-container ">
                <nav class="nav_content ">
                <h3 class="heading_content ">Thông Tin Tài Khoản</h3>             
              </nav>
         <table style="width: 100%" >
      <thead class="thead-dark">
          <tr style="text-align: center;">
            <th>Tài khoản</th>
            <th>Mật khẩu</th>
            <th>Gmail</th>
            <th>Mã cửa hàng</th>
             <th>Chức năng</th>
         </tr>
      </thead>
      <tbody>
          <c:forEach items="${listU}" var="o">
          <tr style="text-align: center;">
            <td>${o.username}</td>
            <td>${o.password}</td>
            <td>${o.gmail}</td>
            <td>${o.maCH}</td>
            <td>
                <a href="deleteU?usn=${o.username}" class="delete">Xóa</a>
               
            </td>
         </tr>
         </c:forEach>
       
         
      </tbody>
   </table>
                <c:if test="${sessionScope.acc.session == 2}">
                <footer style="margin-top: 30px;margin-left: 40%;"> <a href="TaoTK.jsp"   id="add_product">Tạo tài khoản</a></footer>
                </c:if>
                <c:if test="${sessionScope.acc.session == 1}">
                <footer style="margin-top: 30px;margin-left: 40%;"> <a href="TaoTK1.jsp"   id="add_product">Tạo tài khoản</a></footer>
                </c:if>
                </div>
        </div>
      </div>
    </body>
</html>
