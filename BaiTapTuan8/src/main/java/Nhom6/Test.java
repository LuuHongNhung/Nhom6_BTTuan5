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
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        quanLy.themSach(new SachGiaoTrinh("GT01", "Lập trình Java", "NXB Giáo dục", 2020, 100000, 15, "A1", "Công nghệ thông tin", "Cơ bản"));
        quanLy.themSach(new SachTieuThuyet("TT01", "Harry Potter", "NXB Trẻ", 2022, 250000, 500, "B2", "Fantasy", true));

        boolean running = true;
        while (running) {
            System.out.println("\n=== QUẢN LÝ SÁCH ===");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm sách theo tiêu đề");
            System.out.println("3. Xóa sách theo tiêu đề");
            System.out.println("4. Hiển thị danh sách sách");
            System.out.println("5. Kiểm tra tồn kho");
            System.out.println("6. Cập nhật vị trí sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine().trim();


            switch (choice) 
            {
                case "1":
                    System.out.print("Loại (1-Giáo trình, 2-Tiểu thuyết): ");
                    String loai = sc.nextLine().trim();
                    System.out.print("Mã sách: ");
                    String maSach = sc.nextLine();
                    System.out.print("Tiêu đề: ");
                    String tieuDe = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    String namXuatBan = sc.nextLine();
                    System.out.print("Giá cơ bản: ");
                    double gia = Double.parseDouble(sc.nextLine());
                    System.out.print("Số lượng: ");
                    int sl = Integer.parseInt(sc.nextLine());
                    System.out.print("Vị trí: ");
                    String viTri = sc.nextLine();
            
                    if (loai.equals("1")) 
                    {
                        System.out.print("Môn học: ");
                        String mon = sc.nextLine();
                        System.out.print("Cấp độ: ");
                        String cap = sc.nextLine();
                        quanLy.themSach(new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, gia, sl, viTri, mon, cap));
                    } 
                    else 
                    {
                        System.out.print("Thể loại: ");
                        String theLoai = sc.nextLine();
                        System.out.print("Series (hoặc Enter nếu không có): ");
                        String series = sc.nextLine();
                        quanLy.themSach(new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, gia, sl, viTri, theLoai, series));
                    }
                    System.out.println("Đã thêm sách.");
                break;
            
                case "2":
                    System.out.print("Nhập tiêu đề cần tìm: ");
                    String td = sc.nextLine();
                    Sach found = quanLy.timKiemSach(td);
                    if (found != null) System.out.println(found);
                    else System.out.println("Không tìm thấy sách.");
                break;

                case "3":
                    System.out.print("Nhập tiêu đề cần xóa: ");
                    String xoa = sc.nextLine();
                    boolean ok = quanLy.xoaSach(xoa);
                    System.out.println(ok ? "Xóa thành công." : "Xóa thất bại - không tìm thấy.");
                break;

                case "4":
                    List<Sach> all = quanLy.hienThiDanhSach();
                    if (all.isEmpty()) System.out.println("Danh sách rỗng.");
                    else for (Sach s : all) System.out.println(s);
                break;
            
                case "5":
                    System.out.print("Nhập tiêu đề cần kiểm tra tồn kho: ");
                    String tk = sc.nextLine();
                    Sach sTk = quanLy.timKiemSach(tk);
                    if (sTk == null) 
                    {
                        System.out.println("Không tìm thấy sách.");
                    }
                    else 
                    {
                        System.out.print("Nhập số lượng tối thiểu cần kiểm tra: ");
                        int min = Integer.parseInt(sc.nextLine());
                        System.out.println(sTk.kiemTraTonKho(min) ? "Tồn kho đủ." : "Tồn kho không đủ.");
                    }
                break;
                
                case "6":
                    System.out.print("Nhập tiêu đề cần chuyển vị trí: ");
                    String ct = sc.nextLine();
                    Sach sCt = quanLy.timKiemSach(ct);
                    if (sCt == null) System.out.println("Không tìm thấy sách.");
                    else {
                        System.out.print("Nhập vị trí mới: ");
                        String vMoi = sc.nextLine();
                        sCt.capNhatViTri(vMoi);
                    }
                    break;

                case "0":
                    running = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        sc.close();
        System.out.println("Thoát chương trình.");
    }
}