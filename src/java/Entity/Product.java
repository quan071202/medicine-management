/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author trinh
 */
public class Product {
    private int mathuoc;
    private String name;
    private String img;
    private int soluong;
    private double price;
    private String ngayHethan;
    private int maCuaHang;
  
    public Product() {
    }

    public Product(int mathuoc, String name, String img, int soluong, int maCuaHang) {
        this.mathuoc = mathuoc;
        this.name = name;
        this.img = img;
        this.soluong = soluong;
        this.maCuaHang = maCuaHang;
    }

    public Product(int mathuoc, String name, String img, int soluong, String ngayHethan, int maCuaHang) {
        this.mathuoc = mathuoc;
        this.name = name;
        this.img = img;
        this.soluong = soluong;
        this.ngayHethan = ngayHethan;
        this.maCuaHang = maCuaHang;
    }
    
    public Product(int mathuoc, String name, String img, int soluong, double price, int maCuaHang) {
        this.mathuoc = mathuoc;
        this.name = name;
        this.img = img;
        this.soluong = soluong;
        this.price = price;
        this.maCuaHang = maCuaHang;
    }

    public int getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(int maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

   

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   

    public int getMathuoc() {
        return mathuoc;
    }

    public void setMathuoc(int mathuoc) {
        this.mathuoc = mathuoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNgayHethan() {
        return ngayHethan;
    }

    public void setNgayHethan(String ngayHethan) {
        this.ngayHethan = ngayHethan;
    }

    @Override
    public String toString() {
        return "Product{" + "mathuoc=" + mathuoc + ", name=" + name + ", img=" + img + ", soluong=" + soluong + ", price=" + price + ", maCuaHang=" + maCuaHang + '}';
    }

   

  
    
    
}
