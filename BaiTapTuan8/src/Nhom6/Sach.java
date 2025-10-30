package Nhom6;

public abstract class Sach implements IGiaBan, IKiemKe {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;
    private String viTri;
    
    public Sach() {
    }
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    
    // Getter và Setter cho maSach
    public String getMaSach() { 
        return maSach; 
    }
    public void setMaSach(String maSach) { 
        this.maSach = maSach; 
    }
    
    // Getter và Setter cho tieuDe
    public String getTieuDe() { 
        return tieuDe; 
    }
    public void setTieuDe(String tieuDe) { 
        this.tieuDe = tieuDe; 
    }
    
    // Getter và Setter cho tacGia
    public String getTacGia() { 
        return tacGia; 
    }
    public void setTacGia(String tacGia) { 
        this.tacGia = tacGia; 
    }
    
    // Getter và Setter cho namXuatBan
    public int getNamXuatBan() { 
        return namXuatBan; 
    }
    public void setNamXuatBan(int namXuatBan) { 
        this.namXuatBan = namXuatBan; 
    }
    
    // Getter và Setter cho soLuong
    public int getSoLuong() { 
        return soLuong; 
    }
    public void setSoLuong(int soLuong) { 
        this.soLuong = soLuong; 
    }
    
    // Getter và Setter cho giaCoBan
    public double getGiaCoBan() { 
        return giaCoBan; 
    }
    public void setGiaCoBan(double giaCoBan) { 
        this.giaCoBan = giaCoBan; 
    }
    
    // Getter và Setter cho viTri
    public String getViTri() { 
        return viTri; 
    }
    public void setViTri(String viTri) { 
        this.viTri = viTri; 
    }
    
    // Triển khai phương thức từ IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }
    
    // Triển khai phương thức từ IKiemKe
    @Override
    public void capNhatViTri(String viTriMoi) {
        this.viTri = viTriMoi;
        System.out.println("Đã chuyển sách [" + this.tieuDe + "] đến khu vực: [" + viTriMoi + "].");
    }
    
    // Phương thức abstract từ IGiaBan - để các lớp con triển khai
    @Override
    public abstract double tinhGiaBan();
    
    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", giaCoBan=" + giaCoBan +
                ", viTri='" + viTri + '\'' +
                '}';
    }
}
