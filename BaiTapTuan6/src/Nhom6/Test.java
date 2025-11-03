package Nhom6;
 NguyenThanhNguyen
public class Test {
	public static void main(String[] args) 
   {
	        QuanLySach ql = new QuanLySach();
	        LopSachGiaoTrinh lsgt1 = new LopSachGiaoTrinh("SGT01", "Lập trình Java", "Nguyễn Văn A", 2024, 10, "Lập trình", "Đại học");
	        LopSachGiaoTrinh lsgt2 = new LopSachGiaoTrinh("SGT02", "Toán cao cấp", "Trần Văn B", 2025, 10, "Toán học", "Đại học");


	        LopSachTieuThuyet lstt1 = new LopSachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", 2023, 10, "Kỳ ảo", true);
	        LopSachTieuThuyet lstt2 = new LopSachTieuThuyet("STT02", "Nhà giả kim", "Paulo Coelho", 2020, 15, "Triết lý", false);

	        ql.themSach(lsgt1);
	        ql.themSach(lsgt2);
	        ql.themSach(lstt1);
	        ql.themSach(lstt2);
	        System.out.println(" DANH SÁCH SÁCH BAN ĐẦU");
	        ql.hienThiDanhSachSach();

	        System.out.println("\nTÌM KIẾM MÃ SÁCH STT01");
	        System.out.println(ql.timKiemTheoMa("STT01"));

	        System.out.println("\nCẬP NHẬT SÁCH STT02");
	        LopSachTieuThuyet st2Moi = new LopSachTieuThuyet("STT02", "Nhà giả kim (Tái bản)", "Paulo Coelho", 2025, 20, "Triết lý", false);
	        ql.capNhat("STT02", st2Moi);
	        ql.hienThiDanhSachSach();

	        System.out.println("\nXÓA SÁCH SGT01");
	        ql.xoaSach("SGT01");
	        ql.hienThiDanhSachSach();
	    }

   }


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
 BaiTapTuan8
