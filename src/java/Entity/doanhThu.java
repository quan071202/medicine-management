/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ASUS
 */
public class doanhThu {
    private int id;
    private int maCH;
    private String ngay;
    private String doanhThu;
    private String trangThai;

    public doanhThu() {
    }

    public doanhThu(int id, int maCH, String ngay, String doanhThu, String trangThai) {
        this.id = id;
        this.maCH = maCH;
        this.ngay = ngay;
        this.doanhThu = doanhThu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public int getMaCH() {
        return maCH;
    }

    public void setMaCH(int maCH) {
        this.maCH = maCH;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(String doanhThu) {
        this.doanhThu = doanhThu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "doanhThu{" + "id=" + id + ", maCH=" + maCH + ", ngay=" + ngay + ", doanhThu=" + doanhThu + ", trangThai=" + trangThai + '}';
    }

   
    
}
