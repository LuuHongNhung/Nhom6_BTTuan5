package Nhom6;

public class Test {
    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        
        // Tạo các đối tượng sách
        SachGiaoTrinh giaoTrinh1 = new SachGiaoTrinh(
            "GT001", "Lập trình Java", "Nguyễn Văn A", 
            2023, 10, "Lập trình", "Đại học"
        );
        
        SachTieuThuyet tieuThuyet1 = new SachTieuThuyet(
            "TT001", "Harry Potter", "J.K. Rowling", 
            1997, 5, "Fantasy", true
        );
        
        SachGiaoTrinh giaoTrinh2 = new SachGiaoTrinh(
            "GT002", "Cấu trúc dữ liệu", "Trần Thị B", 
            2022, 8, "Khoa học máy tính", "Đại học"
        );
        
        // Thêm sách vào quản lý
        quanLy.themSach(giaoTrinh1);
        quanLy.themSach(tieuThuyet1);
        quanLy.themSach(giaoTrinh2);
        
        // Hiển thị danh sách
        quanLy.hienThiDanhSach();
        
        // Tìm kiếm sách
        System.out.println("=== TÌM KIẾM SÁCH ===");
        Sach sachTimThay = quanLy.timKiemTheoMa("TT001");
        if (sachTimThay != null) {
            sachTimThay.hienThiThongTin();
        }
        
        // Cập nhật sách
        SachTieuThuyet tieuThuyetMoi = new SachTieuThuyet(
            "TT001", "Harry Potter và Hòn đá Phù thủy", "J.K. Rowling", 
            1997, 3, "Fantasy", true
        );
        quanLy.capNhatSach("TT001", tieuThuyetMoi);
        
        // Hiển thị lại danh sách sau cập nhật
        quanLy.hienThiDanhSach();
        
        // Xóa sách
        quanLy.xoaSach("GT002");
        
        // Hiển thị danh sách cuối cùng
        System.out.println("=== DANH SÁCH CUỐI CÙNG ===");
        quanLy.hienThiDanhSach();
    }
}
