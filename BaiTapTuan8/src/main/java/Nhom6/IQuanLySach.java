/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
import java.util.List;

public interface IQuanLySach 
{
    void themSach(Sach sach);
    Sach timKiemSach(String tieuDe);
    boolean xoaSach(String tieuDe);
    List<Sach> hienThiDanhSach();
}