<%-- 
    Document   : nhapkho
    Created on : May 19, 2022, 3:55:57 PM
    Author     : ASUS
--%>
<%@page import="java.util.List"%>
<%@page import="Entity.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="reset.css">
  <link rel="stylesheet" href="base.css">
  <link rel="stylesheet" href="main.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <title>Nhap kho</title>
    </head>
    <body>
        <c:if test="${sessionScope.acc != null}">
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
        <a href="home" class="w3-bar-item w3-button" >Trang chủ</a>
        <c:if test="${sessionScope.acc.session == 3 || sessionScope.acc.session == 2}">
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
        <a href="nhapkho.jsp" class="w3-bar-item w3-button " style="color: #0984e3;">Nhập kho</a>
        </c:if>
         <c:if test="${sessionScope.acc.session == 1 || sessionScope.acc.session == 2}">
        <a href="# " class="w3-bar-item w3-button ">Kế hoạch nhập thuốc</a>        
        <a href="doanhthu" class="w3-bar-item w3-button ">Doanh thu</a>
        <a href="quanlytaikhoan" class="w3-bar-item w3-button ">Quản lý nhân viên</a>
        </c:if>
      </div>

     

    

  
        <div class="product" style="width: 130%;">
              <nav class=" nav_content ">
                  <h3 class=" heading_content ">Cửa hàng ${sessionScope.acc.maCH}</h3>
              </nav>
              <!-- Thêm sản phẩm-->
              <button id="add_product" onclick="myFunction()">Thêm sản phẩm</button>
               <form action="in" >
                   <input type="text"  name="txtDate"placeholder="Nhập date muốn in">
                  <button id="add_product" type="submit">Xuất excel theo date</button>             
               </form>
              <form action="export" >
                   <input type="text"  name="txtDate1"placeholder="Nhập date muốn lọc">
                  <button id="add_product" type="submit">Lọc sản phẩm sắp hết hạn</button>             
               </form>
              <button id="add_product"><a href="hethang">Lọc sản phẩm sắp hết hàng</a></button> 
             <form action="nhapkho" method="post">
              <div id="form_add">
                <header>
                  <h2>Thêm sản phẩm</h2>
                </header>
                <input name="id" type="text" placeholder="Mã thuốc" required>
               <input name="name" type="text" placeholder="Tên" required>
               <input name="img"type="text" placeholder="Ảnh" required>
               <input name="soluong" type="text" placeholder="Số lượng" required>
                <input name="date" type="text" placeholder="Ngày hết hạn" required>      
                <footer>
                    <button class="form_edit-button" type="submit">
                      <H2 class="hide"  onclick="myFunction()">Thêm</h2>
                  </button>
                    <button class="form_edit-button" type="button" >
                         <H2 class="hide"  onclick="myFunction()">Hủy</h2>
                    </button>
                    <button class="form_edit-button" type="reset">
                         <H2 class="hide" >Reset</h2>
                    </button>
                </footer>
              </div>
                  </form>
              <!-- SEARCH -->
              <form action="searchNhapkho" class=" search ">
                  <input type=" text "  name="txt"placeholder=" Tìm kiếm ">
                  <button type="submit"><i class=" fas fa-search "></i></button>
              </form>
              <!-- TABLE -->
              <table>
                <tr>
                  <th> MÃ THUỐC</th>
                  <th>TÊN</th>
                  <th>ẢNH</th>
                  <th>SỐ LƯỢNG</th>
                   <th>NGÀY HẾT HẠN</th>      
                  <th>CHỨC NĂNG</th>
                </tr>
                <c:forEach items="${listP}" var="o">
                <tr>
                  <td>${o.mathuoc}</td>
              <td>${o.name}</td>
              <td ><img src="${o.img}" alt="ảnh"  style="width: 200px;height: 150px;" ></td>
              <td>${o.soluong}</td>
             <td>${o.ngayHethan}</td>
              <td><a href="deleteNhapkho?pid=${o.mathuoc}" class="delete" >Xóa</a>
                    <!-- form sửa -->                
                  <a  href="loadProductNhapkho?pid=${o.mathuoc}" class="hide show" id="update" >Sửa</a>               
               </td>
                </tr>
                </c:forEach>
                
              </table>
          </div>
    </div>
  </div>    
       </c:if>
        <c:if test="${sessionScope.acc == null}">
            <h1 style="text-align: center;">Bạn chưa đăng nhập hãy đăng nhập để sử dụng !</h1>
            <a href="Login.jsp" style="margin-left: 45%;text-decoration: none;font-size: 30px;color: red;">Đăng nhập</a>
        </c:if>
             <script>$(document).ready(function () {
          $(".hide").click(function () {
            $(".form_edit").hide();
          });
          $(".show").click(function () {
            $(".form_edit").show();
          });
        });
        function myFunction() {
          var x = document.getElementById("form_add");
          if (x.style.display === "none") {
            x.style.display = "block";
          } else {
            x.style.display = "none";
          }
        }
      </script>
    </body>
</html>
