<%-- 
    Document   : account
    Created on : May 7, 2022, 9:25:31 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account</title>
       
  <link rel="stylesheet" href="base.css">
  <link rel="stylesheet" href="main.css">
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
              <li class="nav_item">Trang chủ</li>

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
        <a href="home" class="w3-bar-item w3-button">Trang chủ</a>
        <div class="w3-dropdown-hover">
          <!-- CHI NHÁNH -->
          <button class="w3-button">Các chi nhánh
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="w3-dropdown-content w3-bar-block">
            <a href="manager" class="w3-bar-item w3-button" ">Cửa hàng 1</a>
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 2</a>
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 3</a>
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 4</a>
            <a href="manager" class="w3-bar-item w3-button ">Cửa hàng 5</a>
            <a href="# " class="w3-bar-item w3-button ">Cửa hàng 6</a>
            <a href="# " class="w3-bar-item w3-button ">Cửa hàng 7</a>
            <a href="# " class="w3-bar-item w3-button ">Cửa hàng 8</a>
            <a href="# " class="w3-bar-item w3-button ">Cửa hàng 9</a>
            <a href="# " class="w3-bar-item w3-button ">Cửa hàng 10</a>
          </div>
        </div>
        <a href="product" class="w3-bar-item w3-button ">Sản phẩm</a>
        <a href="# " class="w3-bar-item w3-button ">Nhập kho</a>
        <a href="# " class="w3-bar-item w3-button ">Tồn kho</a>
        <a href="# " class="w3-bar-item w3-button ">Nhà cung cấp</a>
        <a href="# " class="w3-bar-item w3-button ">Doanh thu</a>
        <a href="nhanvien.jsp " class="w3-bar-item w3-button ">Nhân viên</a>
      </div>


              <nav class="nav_content ">
                <h3 class="heading_content ">Thông Tin Tài Khoản</h3>
              </nav>
        </div>

      </div>
    </body>
</html>
