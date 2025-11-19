/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() 
    {
        return monHoc;
    }

    public void setMonHoc(String monHoc) 
    {
        this.monHoc = monHoc;
    }

    public String getCapDo() 
    {
        return capDo;
    }

    public void setCapDo(String capDo) 
    {
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() 
    {
         return giaCoBan + (2025 - namXuatBan) * 5000;
    }

    @Override
    public String toString() {
        return  "Sách Giáo Trình{" +
                "Mã sách='"+ getMaSach() + '\'' +
                ", Tiêu đề='" + getTieuDe() + '\'' +
                ", Tác giả='" + getTacGia() + '\'' +
                ", Năm xuất bản="+getNamXuatBan() +
                ", Số lượng=" + getSoLuong() +
                ", Giá cơ bản= " + giaCoBan +
                ", Môn học='" + monHoc+ '\'' +
                ", Cấp độ='" + capDo +'\'' +
                ", Thành tiền='" + tinhGiaBan() + '\'' +
                '}';
    }
}
