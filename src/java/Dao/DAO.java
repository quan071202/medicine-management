/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Context.DBContext;
import Entity.User;
import Entity.Product;
import Entity.doanhThu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DAO {
     Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
 
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<doanhThu> getDoanhThu() {
        List<doanhThu> list = new ArrayList<>();
        String query = "select * from `doanh thu`";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new doanhThu(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)                     
                        ));
            }
        } catch (Exception e) {
        }
        return list;
    }
      public List<doanhThu> getDoanhThuByMaCH(int id) {
        List<doanhThu> list = new ArrayList<>();
        String query = "select * from `doanh thu` WHERE `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new doanhThu(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)                     
                        ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Product getProductByID(int id){
        Product pid = new Product();
          String query ="SELECT * FROM `product` WHERE `Ma thuoc` = ?";
          try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
           rs = ps.executeQuery();
          while (rs.next()) {
             return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
          
        } catch (Exception e) {
            
        }
           return null;    
    }
    public doanhThu getDoanhThuBYID(int id){
        doanhThu did = new doanhThu();
          String query ="SELECT * FROM `doanh thu` WHERE `ID` = ?";
          try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
           rs = ps.executeQuery();
          while (rs.next()) {
             return new doanhThu(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),                  
                        rs.getString(5));
            }
          
        } catch (Exception e) {
            
        }
           return null;    
    }
     public Product getProductByIDNhapkho(int id){
        Product pid = new Product();
          String query ="SELECT * FROM `khothuoc` WHERE `Ma thuoc` = ?";
          try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
           rs = ps.executeQuery();
          while (rs.next()) {
             return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)
                       );
            }
          
        } catch (Exception e) {
            
        }
           return null;    
    }
    public List<Product> getProductByDate(String date,int id) {
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `khothuoc` WHERE `Ngay het han` = ? AND `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,date);
            ps.setInt(2, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<Product> getProductBySoluong(int id) {
         int sum = 50;
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `khothuoc` WHERE `So luong` <= ? AND `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1,sum);
            ps.setInt(2, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getProductByname(String name,int id) {
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `product` WHERE `Ten thuoc` LIKE ?  AND `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            ps.setInt(2, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getProductBynameNhapkho(String name,int id) {
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `khothuoc` WHERE `Ten thuoc` LIKE ?  AND `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+name+"%");
            ps.setInt(2, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                       ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getAllProductByID(int id) {
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `product` WHERE `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getAllProductByIDNhapkho(int id) {
        List<Product> list = new ArrayList<>();
        String query ="SELECT * FROM `khothuoc` WHERE `Ma cua hang` = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)
                        ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<User> getAllUserByMaCH(String username,int id) {
        List<User> list = new ArrayList<>();
        String query ="SELECT * FROM `user` WHERE `Ma cua hang` = ? AND `username` != ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                        ));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        String query ="SELECT * FROM `user` WHERE `Ma cua hang` != 0";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);     
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                        ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public User getUser(String username,String password) {
       
        String query = "SELECT * FROM `user`\n" +
             "WHERE username = ? \n" +
            "AND password = ?";
        try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
           return new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                         rs.getInt(5));
            }
        } catch (Exception e) {
        }
      return null;
    }
   public String getPass(String username,String email){
       
        String query = "SELECT * FROM `user`\n" +
             "WHERE username = ? \n" +
            "AND gmail = ?";
         try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            rs = ps.executeQuery();
            while (rs.next()) {
           return rs.getString(2);
            }
        } catch (Exception e) {
        }
            return null;
        }
  
   public void deleteProduct(int id){
       String query = "DELETE FROM `product` WHERE `Ma thuoc` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);         
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
    public void deleteProductNhapkho(int id){
       String query = "DELETE FROM `khothuoc` WHERE `Ma thuoc` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);         
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
      public void deleteU(String id){
       String query = "DELETE FROM `user` WHERE `username` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);         
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public void insertProduct(int mathuoc,String name,String img,int soluong,int price,int maCH){
       String query = "INSERT INTO `product`(`Ma thuoc`, `Ten thuoc`, `image`, `So luong`, `Gia thanh`, `Ma cua hang`) VALUES (?,?,?,?,?,?)";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, mathuoc);
            ps.setString(2, name);
            ps.setString(3, img);
            ps.setInt(4, soluong);
            ps.setInt(5, price);
            ps.setInt(6, maCH);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
    public void insertUser(String name,String pass,String email,int maCH){
       String query = "INSERT INTO `user`(`username`, `password`, `gmail`, `session`, `Ma cua hang`) VALUES (?,?,?,?,?)";
       int s = 3;
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, email);               
            ps.setInt(4, s);
            ps.setInt(5, maCH);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
     public void insertUser1(String name,String pass,String email,int s,int maCH){
       String query = "INSERT INTO `user`(`username`, `password`, `gmail`, `session`, `Ma cua hang`) VALUES (?,?,?,?,?)";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, email);               
            ps.setInt(4, s);
            ps.setInt(5, maCH);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
   public boolean checkaddU(String name){
        String query = "SELECT * FROM `user` WHERE `username` = ?";
         try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);          
            ps.setString(1, name);        
            rs = ps.executeQuery();
            while (rs.next()) {
           return false;
            }
        } catch (Exception e) {
        }
            return true;
    }
    public boolean checkaddG(String gmail){
        String query = "SELECT * FROM `user` WHERE `gmail` = ?";
         try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);          
            ps.setString(1, gmail);        
            rs = ps.executeQuery();
            while (rs.next()) {
           return false;
            }
        } catch (Exception e) {
        }
            return true;
    }   
    public void insertProductNhapkho(int mathuoc,String name,String img,int soluong,String date,int maCH){
       String query = "INSERT INTO `khothuoc`(`Ma thuoc`, `Ten thuoc`, `image`, `So luong`,`Ngay het han`, `Ma cua hang`) VALUES (?,?,?,?,?,?)";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, mathuoc);
            ps.setString(2, name);
            ps.setString(3, img);
            ps.setInt(4, soluong);        
            ps.setString(5, date);
            ps.setInt(6, maCH);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
    public void insertDoanhThu(int maCH,String ngay,String doanhThu,String trangThai){
         String query = "INSERT INTO `doanh thu`(`Ma cua hang`, `Ngay`, `Doanh thu`, `Trang thai`) VALUES (?,?,?,?)";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, maCH);
            ps.setString(2, ngay);
            ps.setString(3, doanhThu);            
            ps.setString(4, trangThai);     
            ps.executeUpdate();
       } catch (Exception e) {
       }
    }
   public boolean checkAdd(int mathuoc){
       String query = "SELECT * FROM `product` WHERE `Ma thuoc` = ?";
         try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);          
            ps.setInt(1, mathuoc);
            rs = ps.executeQuery();
            while (rs.next()) {
           return false;
            }
        } catch (Exception e) {
        }
            return true;
   }
    public boolean checkAddNhapkho(int mathuoc){
       String query = "SELECT * FROM `khothuoc` WHERE `Ma thuoc` = ?";
         try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);          
            ps.setInt(1, mathuoc);
            rs = ps.executeQuery();
            while (rs.next()) {
           return false;
            }
        } catch (Exception e) {
        }
            return true;
   }
     public void edittProduct(int mathuoc,String name,String img,int soluong,int price,int maCH){
       String query = "UPDATE `product` SET `Ma thuoc`=?,`Ten thuoc`=?,`image`=?,`So luong`=?,`Gia thanh`=?,`Ma cua hang`=? WHERE `Ma thuoc` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, mathuoc);
            ps.setString(2, name);
            ps.setString(3, img);
            ps.setInt(4, soluong);
            ps.setInt(5, price);
            ps.setInt(6, maCH);
            ps.setInt(7, mathuoc);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
      public void edittDoanhThu(int id,int maCH,String ngay,String doanhThu,String trangThai){
       String query = "UPDATE `doanh thu` SET `Id`=?,`Ma cua hang`=?,`Ngay`=?,`Doanh thu`=?,`Trang thai`=? WHERE `Id` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id); 
            ps.setInt(2, maCH);
            ps.setString(3, ngay);
            ps.setString(4, doanhThu);
            ps.setString(5, trangThai);
            ps.setInt(6, id);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
     public void edittProductNhapkho(int mathuoc,String name,String img,int soluong,String date,int maCH){
       String query = "UPDATE `khothuoc` SET `Ma thuoc`=?,`Ten thuoc`=?,`image`=?,`So luong`=?,`Ngay het han`=?,`Ma cua hang`=? WHERE `Ma thuoc` = ?";
       try {
            conn = new DBContext().KetNoiCSDl();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, mathuoc);
            ps.setString(2, name);
            ps.setString(3, img);
            ps.setInt(4, soluong);   
            ps.setString(5, date);
            ps.setInt(6, maCH);
            ps.setInt(7, mathuoc);
            ps.executeUpdate();
       } catch (Exception e) {
       }
   }
     
        
}
