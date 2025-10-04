package Nhom6;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
   {
  Book sinhVien1 = new Book("001", "Java", "ThanhNguyen", 2024, 10);
  Book sinhVien2 = new Book();
  sinhVien2.setmaSach("002");
  sinhVien2.settieuDe("C#");
  sinhVien2.settacGia("NguyenNguyen");
  sinhVien2.setnamXuatBan(2022);
  sinhVien2.setsoLuong(10);
  sinhVien1.hienThiThongtin();
  sinhVien2.hienThiThongtin();
  
  
  
  
   }
}