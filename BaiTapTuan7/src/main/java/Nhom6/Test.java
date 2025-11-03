/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
public class Test 
{
    public static void main(String[] args)
    {
        QuanLySach qlSach = new QuanLySach();
 
        SachGiaoTrinh giaoTrinh1 = new SachGiaoTrinh("GT001", "Kỹ thuật lập trình", "Lê Văn C", 2019, 15, 100000, "Môn lập trình", "Nhập môn");
        qlSach.themSach(giaoTrinh1);
 
        SachTieuThuyet tieuThuyet1 = new SachTieuThuyet("TT001", "Doraemon", "Fujiko F. Fujio", 1999, 30, true, 50000);
        qlSach.themSach(tieuThuyet1);
 
        System.out.println("=== Danh sách ban đầu ===");
        qlSach.hienThiDanhSach();
 
        SachTieuThuyet tieuThuyetMoi = new SachTieuThuyet("TT001", "Doraemon New", "Fujiko F. Fujio", 2000, 40, true, 50000);
        qlSach.capNhatSach("TT001", tieuThuyetMoi);
 
        qlSach.xoaSach("GT001");
 
        Sach timSach = qlSach.timKiemSach("TT001");
        if (timSach != null) 
        {
            System.out.println("\n=== Kết quả tìm kiếm ===");
            System.out.println(timSach.toString());
        } 
        else 
        {
            System.out.println("Không tìm thấy sách.");
        }
 
        System.out.println("\n=== Danh sách sau cập nhật ===");
        
        Sach s1 = new SachGiaoTrinh("GT01", "Lập trình Java", "NXB Giáo dục", 2020, 15, 100000, "Môn lập trình", "Trung bình");
        Sach s2 = new SachGiaoTrinh("GT02", "Cấu trúc dữ liệu", "NXB Khoa học", 2023, 30, 120000, "Môn cơ sở dữ liệu", "Nhập môn");

        Sach s3 = new SachTieuThuyet("TT01", "Harry Potter", "NXB Trẻ", 2022, 500, true, 250000);
        Sach s4 = new SachTieuThuyet("TT02", "Dế mèn phiêu lưu ký", "NXB Kim Đồng", 2021, 300, false, 100000);

        qlSach.themSach(s1);
        qlSach.themSach(s2);
        qlSach.themSach(s3);
        qlSach.themSach(s4);

        qlSach.hienThiDanhSach();
    }
}
