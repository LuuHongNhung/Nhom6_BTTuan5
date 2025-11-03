/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
public class Test {
    public static void main(String[] args) 
    {
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2021, 10);
 
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Cấu trúc dữ liệu");
        sach2.setTacGia("Trần Thị B");
        sach2.setNamXuatBan(2020);
        sach2.setSoLuong(5);
 
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
