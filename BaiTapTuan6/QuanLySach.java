package Nhom6;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;
    
    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }
    
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }
    
    public boolean xoaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.remove(sach);
                System.out.println("Đã xóa sách: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + maSach);
        return false;
    }
    
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + maSach);
        return false;
    }
    
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null;
    }
    
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH SÁCH ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSach.get(i).toString());
        }
        System.out.println("======================\n");
    }
    
    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }
}