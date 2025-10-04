package Nhom6;

public class Test {
    public static void main(String[] args) {
        // Sách 1: Sử dụng constructor mặc định + setter
        Sach sach1 = new Sach();
        sach1.setMaSach("S001");
        sach1.setTieuDe("Lập trình Java");
        sach1.setTacGia("Nguyễn Văn A");
        sach1.setNamXuatBan(2023);
        sach1.setSoLuong(10);
        
        // Sách 2: Sử dụng constructor với tham số
        Sach sach2 = new Sach("S002", "Cấu trúc dữ liệu", "Trần Thị B", 2022, 5);
        
        // Hiển thị thông tin
        System.out.println("THÔNG TIN SÁCH 1:");
        sach1.hienThiThongTin();
        
        System.out.println("\nTHÔNG TIN SÁCH 2:");
        sach2.hienThiThongTin();
        
        // Demo thay đổi thông tin
        sach1.setSoLuong(15);
        System.out.println("\nSAU KHI CẬP NHẬT SỐ LƯỢNG SÁCH 1:");
        sach1.hienThiThongTin();
    }
}
