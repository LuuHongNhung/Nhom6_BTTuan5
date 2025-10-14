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

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         String monHoc, String capDo) 
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public String toString() 
    {
        return "SachGiaoTrinh{" +
                "maSach='"+getMaSach()+'\''+
                ", tieuDe='"+getTieuDe()+'\''+
                ", tacGia='"+getTacGia()+'\''+
                ", namXuatBan="+getNamXuatBan()+
                ", soLuong="+getSoLuong()+
                ", monHoc='"+monHoc+ '\''+
                ", capDo='"+capDo +'\''+
                '}';
    }
}
