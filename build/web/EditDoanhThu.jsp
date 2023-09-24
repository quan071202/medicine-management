<%-- 
    Document   : Edit
    Created on : May 18, 2022, 10:10:52 PM
    Author     : ASUS
--%>

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
        <title>Edit</title>
        <style> 
input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: cornflowerblue;
  color: white
}
</style>
    </head>
    
    <body>
       <div class="container">
    <div class="container_header">
      <header class="header">
        <div class="grid">
          <nav class="header_nav">
            <ul class="header_list">
              <li class="nav_item">Sửa Doanh Thu</li>

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
        <a href="managerNhapkho" class="w3-bar-item w3-button ">Nhập kho</a>
        </c:if>
       <c:if test="${sessionScope.acc.session == 1 || sessionScope.acc.session == 2}">
        <a href="# " class="w3-bar-item w3-button ">Kế hoạch nhập thuốc</a>        
        <a href="doanhthu" class="w3-bar-item w3-button ">Doanh thu</a>
        <a href="quanlytaikhoan" class="w3-bar-item w3-button ">Quản lý nhân viên</a>
        </c:if>
      </div>
        <form action="editDoanhThu" method="post" style="background-color: #0984e3;height: 550px;margin-top: 50px;">
                   
                      <header>
                          <h2 style="text-align: center;">Sửa thông tin</h2>
                      </header>
                      <input name="id" type="text" placeholder="ID" value="${detail.id}"readonly required>
                    <input name="maCH" type="text" placeholder="Mã cửa hàng" value="${detail.maCH}"readonly required>
                        <input name="ngay" type="text" placeholder="Ngày" value="${detail.ngay}" required>
                        <input name="doanhthu"type="text" placeholder="Doanh Thu" value="${detail.doanhThu}" required>
                        <input name="trangthai" type="text" placeholder="Trạng thái"value="${detail.trangThai}" required>                     
                        <footer style="margin-top: 20px;margin-left: 45%;">
                            <button class="form_edit-button"  type="submit">
                          <h2 class="hide">Cập nhật</h2>
                        </button>                                              
                      </footer>             
                        </form>       
    </body>
</html>
