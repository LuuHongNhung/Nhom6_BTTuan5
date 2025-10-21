package Nhom6;

public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh() {
        super();
    }
    
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, 
                         int namXuatBan, int soLuong, double giaCoBan, 
                         String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    
    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
    
    public String getCapDo() { return capDo; }
    public void setCapDo(String capDo) { this.capDo = capDo; }

    @Override
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - getNamXuatBan();
        return getGiaCoBan() + (soNamXuatBan * 5000);
    }
    
    @Override
    public String toString() {
        return super.toString() +
               " SachGiaoTrinh{" +
               "monHoc='" + monHoc + '\'' +
               ", capDo='" + capDo + '\'' +
               ", giaBan=" + tinhGiaBan() +
               '}';
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Môn học: " + monHoc);
        System.out.println("Cấp độ: " + capDo);
        System.out.println("Giá bán: " + tinhGiaBan());
    }
}
