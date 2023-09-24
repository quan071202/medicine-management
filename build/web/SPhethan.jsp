<%-- 
    Document   : newjsp
    Created on : May 21, 2022, 12:06:33 AM
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="Entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>report</title>
    </head>
    <body>
       <table>
                <tr>
                  <th> MÃ THUỐC</th>
                  <th>TÊN</th>            
                  <th>SỐ LƯỢNG</th>
                   <th>NGÀY HẾT HẠN</th>                 
                </tr>
                <%
               
                List<Product> list =(List<Product>) request.getAttribute("listP"); 
                for(Product o : list){                                  
                %>            
                <tr>
                    <td><%=o.getMathuoc()%></td>
              <td><%=o.getName()%></td>            
              <td><%=o.getSoluong()%></td>
             <td><%=o.getNgayHethan()%></td>          
                </tr>  
               <% }%>
               <% 
                response.setContentType("application/vnd.ms-excel");
                response.setHeader("Content-Disposition", "inline; filename=sanphamhethan.xls");
             %>
    </body>
</html>
