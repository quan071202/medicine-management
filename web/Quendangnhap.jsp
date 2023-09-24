<%-- 
    Document   : Quendangnhap
    Created on : May 7, 2022, 9:18:44 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <style>
        .a1{
            color: red;
        }
        .a2{
            color: green;
        }
    </style>
    <body>
        <div class="col-md-9 m-auto">
  <div class="card">
   <div class="card-header bg-info"> QUÊN MẬT KHẨU</div>
   <div class="card-body">
       <form class="form-horizontal" method="post" action="pass" >
           <div class="a1">${alert1}</div>
             <div class="a2">${alert2}</div>
             <p>  <label class="control-label">Username:</label>            
              <input class="form-control" name="user">     
         </p>    
         <p>  <label class="control-label">Email:</label>            
              <input class="form-control" name="email">     
         </p>       
         <p><button type="submit" class="btn btn-warning">Gửi mail</button></p>
         <a href="home" style="text-decoration: none"> Đăng nhập</a>
     </form>
   </div>
 </div>
 </div>       
    </body>
</html>
