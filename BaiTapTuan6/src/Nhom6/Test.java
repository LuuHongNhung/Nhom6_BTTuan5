package Nhom6;
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