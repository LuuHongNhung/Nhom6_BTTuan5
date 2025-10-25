/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;


    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, String namXuatBan1, double gia, int sl, String viTri1, String theLoai1, String series) 
    {
        super();
    }

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, double giaCoBan, int soLuong, String viTri, String theLoai, boolean laSachSeries) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }


    public String getTheLoai() 
    {
        return theLoai;
    }


    public void setTheLoai(String theLoai) 
    {
        this.theLoai = theLoai;
    }

    public boolean islaSachSeries() 
    {
        return laSachSeries;
    }


    public void setLaSachSeries(boolean laSachSeries) 
    {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() 
    {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }
    
    @Override
    public String toString() 
    {
        return "SachTieuThuyet{" +
                "Mã sách='" + getMaSach() + '\'' +
                ", Tiêu đề='" + getTieuDe() + '\'' +
                ", Tác giả='" + getTacGia() + '\'' +
                ", Năm xuất bản=" + getNamXuatBan() + '\'' +
                ", Số lượng=" + getSoLuong() + '\'' +
                ", Vị trí= " + viTri + '\'' +
                ", Giá cơ bản= " + giaCoBan + '\'' +
                ", Thể loại='" + theLoai + '\'' +
                ", Là sách Series=" + laSachSeries + '\'' +
                ", Thành tiền='" + tinhGiaBan()+ '\'' +
                '}';
    }
}