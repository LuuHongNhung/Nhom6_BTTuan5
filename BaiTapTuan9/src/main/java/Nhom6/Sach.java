/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Nhom6;

/**
 *
 * @author Tran
 */
public abstract class Sach implements IGiaBan, IKiemKe 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    int namXuatBan;
    private int soLuong;
    double giaCoBan;
    String viTri;
    
    public Sach() {}
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, double giaCoBan, int soLuong, String viTri) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }
    
    public String getMaSach() 
    {
        return maSach;
    }

    public void setMaSach(String maSach) 
    {
        this.maSach = maSach;
    }

    public String getTieuDe() 
    {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) 
    {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() 
    {
        return tacGia;
    }

    public void setTacGia(String tacGia) 
    {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() 
    {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) 
    {
        this.namXuatBan = namXuatBan;
    }
    
    public double getGiaCoBan() 
    {
        return giaCoBan;
    }

    public void setGiaCoBan(double giaCoBan) 
    {
        this.giaCoBan = giaCoBan;
    }

    public int getSoLuong() 
    {
        return soLuong;
    }

    public void setSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }


    public String getViTri() 
    {
        return viTri;
    }

    public void setViTri(String viTri) 
    {
        this.viTri = viTri;
    }
    
    public void hienThiThongTin() 
    {
        System.out.println("----- Thông tin sách -----");
        System.out.println("Mã sách       : " + maSach);
        System.out.println("Tiêu đề       : " + tieuDe);
        System.out.println("Tác giả       : " + tacGia);
        System.out.println("Năm xuất bản  : " + namXuatBan);
        System.out.println("Số lượng      : " + soLuong);
        System.out.println("Giá cơ bản      : " + giaCoBan);
        System.out.println("--------------------------");
    }
    
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] đến khu vực: " + viTriMoi + ".");
    }
    
    @Override
    public abstract double tinhGiaBan();


    @Override
    public String toString() 
    {
        return "Tiêu đề='" + tieuDe + "', Tác giả='" + tacGia + "', Giá cơ bản=" + giaCoBan + ", Số lượng=" + soLuong + ", Vị trí='" + viTri + "'";
    }
}