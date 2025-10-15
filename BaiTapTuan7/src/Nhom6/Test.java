package Nhom6;
public class Test {
	public static void main(String[] args) 
	{
//	        QuanLySach ql = new QuanLySach();
//	        LopSachGiaoTrinh lsgt1 = new LopSachGiaoTrinh("SGT01", "Lập trình Java", "Nguyễn Văn A", 2024, 10, "Lập trình", "Đại học");
//	        LopSachGiaoTrinh lsgt2 = new LopSachGiaoTrinh("SGT02", "Toán cao cấp", "Trần Văn B", 2025, 10, "Toán học", "Đại học");
//
//
//	        LopSachTieuThuyet lstt1 = new LopSachTieuThuyet("STT01", "Harry Potter", "J.K. Rowling", 2023, 10, "Kỳ ảo", true);
//	        LopSachTieuThuyet lstt2 = new LopSachTieuThuyet("STT02", "Nhà giả kim", "Paulo Coelho", 2020, 15, "Triết lý", false);
//
//	        ql.themSach(lsgt1);
//	        ql.themSach(lsgt2);
//	        ql.themSach(lstt1);
//	        ql.themSach(lstt2);
//	        System.out.println(" DANH SÁCH SÁCH BAN ĐẦU");
//	        ql.hienThiDanhSachSach();
//
//	        System.out.println("\nTÌM KIẾM MÃ SÁCH STT01");
//	        System.out.println(ql.timKiemTheoMa("STT01"));
//
//	        System.out.println("\nCẬP NHẬT SÁCH STT02");
//	        LopSachTieuThuyet st2Moi = new LopSachTieuThuyet("STT02", "Nhà giả kim (Tái bản)", "Paulo Coelho", 2025, 20, "Triết lý", false);
//	        ql.capNhat("STT02", st2Moi);
//	        ql.hienThiDanhSachSach();
//
//	        System.out.println("\nXÓA SÁCH SGT01");
//	        ql.xoaSach("SGT01");
//	        ql.hienThiDanhSachSach();
		    QuanLySach qls = new QuanLySach();
	        LopSachGiaoTrinh lsgt3 = new LopSachGiaoTrinh("SGT03", "Lập Trình C#", "Nguyễn Nam", 2024, 10, "Lập Trình", "Đại Học", 50000.0);
	        LopSachGiaoTrinh lsgt4 = new LopSachGiaoTrinh("SGT04", "Lập Trình C++", "Nguyễn Nam Ngọc", 2020, 10, "Lập Trình", "Đại Học", 100000.0);
	        LopSachTieuThuyet lstt3 = new LopSachTieuThuyet("STT03", "Miền Xanh", "Khánh Ngọc", 2023, 10, "Thanh Xuân", true, 150000.0);
	        LopSachTieuThuyet lstt4 = new LopSachTieuThuyet("STT04", "Tôi Thấy Hoa Vàng Trên Cỏ Xanh", "Nguyễn Thành Nguyên", 2023, 10, "Tuổi Thơ", true, 150000.0);
	        qls.themSach(lsgt3);
	        qls.themSach(lsgt4);
	        qls.themSach(lstt3);
	        qls.themSach(lstt4);
	        System.out.println(" DANH SÁCH SÁCH BAN ĐẦU");
	        qls.hienThiDanhSachSach();
	        System.out.println("\nTÌM KIẾM MÃ SÁCH STT01");
	        System.out.println(qls.timKiemTheoMa("STT01"));

	        System.out.println("\nCẬP NHẬT SÁCH STT02");
	        LopSachTieuThuyet lstt5 = new LopSachTieuThuyet("STT04", "Hành Lang Cũ", "Huy Vạc", 2020, 20, "Âm Nhạc", false, 50000);
	        qls.capNhat("STT04", lstt5);
	        qls.hienThiDanhSachSach();

	        System.out.println("\nXÓA SÁCH SGT01");
	        qls.xoaSach("SGT01");
	        qls.hienThiDanhSachSach();
	        
	   
	    }

     }