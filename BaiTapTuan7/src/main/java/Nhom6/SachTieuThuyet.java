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

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, boolean laSachSeries, double giaCoBan) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
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

    public boolean isLaSachSeries() 
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
 
    public String toString() 
    {
        return "SachTieuThuyet{" +
                "Mã sách='" + getMaSach() + '\'' +
                ", Tiêu đề='" + getTieuDe() + '\'' +
                ", Tác giả='" + getTacGia() + '\'' +
                ", Năm xuất bản=" + getNamXuatBan() +
                ", Số lượng=" + getSoLuong() +
                ", Giá cơ bản= " + giaCoBan +
                ", Thể loại='" + theLoai + '\'' +
                ", Là sách Series=" + laSachSeries +
                ", Thành tiền='" + tinhGiaBan()+'\'' +
                '}';
    }
}

