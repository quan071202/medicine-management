<%-- 
    Document   : sanpham
    Created on : May 7, 2022, 9:25:20 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>San Pham</title>
        <link rel="stylesheet" href="base.css">
  <link rel="stylesheet" href="main.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <style>
      table, th, td {
        border:1px solid black;
      }
      </style>
    <body>
        
        <div class="container">
    <div class="container_header">
      <header class="header">
        <div class="grid">
          <nav class="header_nav">
            <ul class="header_list">
              <li class="nav_item">Sản phẩm</li>

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
        <a href="trangchu.jsp" class="w3-bar-item w3-button" >Trang chu</a>
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
        <a href="sanpham.jsp " class="w3-bar-item w3-button " style="color: #0984e3;">Sản phẩm</a>
        <a href="# " class="w3-bar-item w3-button ">Nhập kho</a>
        <a href="# " class="w3-bar-item w3-button ">Tồn kho</a>
        <a href="# " class="w3-bar-item w3-button ">Nhà cung cấp</a>
        <a href="doanhthu" class="w3-bar-item w3-button ">Doanh thu</a>
        <a href="nhanvien.jsp " class="w3-bar-item w3-button ">Nhân viên</a>
      </div>

     
       
        <div class="w3-container ">
          <!-- SEARCH -->
            <form action=" " class="search ">
            <input type="text " placeholder=" Tìm kiếm " >
            <button ><i class="fas fa-search "></i></button>
          </form>
           <table style="width:100%">
        <tr>
          <th>MÃ THUỐC</th>
          <th>TÊN THUỐC</th>
          <th>ẢNH</th>
          <th>SỐ LƯỢNG</th>
          <th>GIÁ THÀNH</th>
        </tr>
        <c:forEach items="${listP}" var="o">
        <tr>
            <td style="text-align: center">${o.mathuoc}</td>
          <td style="text-align: center" >${o.name}</td>
          <td><img src="${o.img}" alt="product" width="150px" height="150px"></td>
          <td style="text-align: center">${o.soluong}</td>
          <td style="text-align: center">${o.price}</td>
        </tr>
        </c:forEach>
      </table>
        </div>
            
    
       
        
    </div>

  </div>
    </body>
</html>
