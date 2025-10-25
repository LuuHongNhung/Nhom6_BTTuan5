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

        // Thêm sách giáo trình
        SachGiaoTrinh giaoTrinh1 = new SachGiaoTrinh("GT001", "Kỹ thuật lập trình", "Lê Văn C", 2019, 15, "CNTT", "Đại học");
        qlSach.themSach(giaoTrinh1);

        // Thêm sách tiểu thuyết
        SachTieuThuyet tieuThuyet1 = new SachTieuThuyet("TT001", "Doraemon", "Fujiko F. Fujio", 1999, 30, "Truyện tranh", true);
        qlSach.themSach(tieuThuyet1);

        // Hiển thị danh sách sách
        System.out.println("=== Danh sách ban đầu ===");
        qlSach.hienThiDanhSach();

        // Cập nhật sách
        SachTieuThuyet tieuThuyetMoi = new SachTieuThuyet("TT001", "Doraemon New", "Fujiko F. Fujio", 2000, 40, "Truyện tranh", true);
        qlSach.capNhatSach("TT001", tieuThuyetMoi);

        // Xoá sách
        qlSach.xoaSach("GT001");

        // Tìm kiếm sách
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

        // Hiển thị danh sách sau cập nhật
        System.out.println("\n=== Danh sách sau cập nhật ===");
        qlSach.hienThiDanhSach();
    }
}
