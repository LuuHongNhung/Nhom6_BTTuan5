package Nhom6;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;
    
    public SachTieuThuyet() {
        super();
    }
    
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, 
                         int namXuatBan, int soLuong, double giaCoBan,
                         String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }
    
    @Override
    public double tinhGiaBan() {
        double giaBan = getGiaCoBan();
        if (laSachSeries) {
            giaBan += 15000;
        }
        return giaBan;
    }
    
    @Override
    public String toString() {
        return "SachTieuThuyet{" +
                "maSach='" + getMaSach() + '\'' +
                ", tieuDe='" + getTieuDe() + '\'' +
                ", tacGia='" + getTacGia() + '\'' +
                ", namXuatBan=" + getNamXuatBan() +
                ", soLuong=" + getSoLuong() +
                ", giaCoBan=" + getGiaCoBan() +
                ", giaBan=" + tinhGiaBan() +
                ", theLoai='" + theLoai + '\'' +
                ", laSachSeries=" + laSachSeries +
                '}';
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thể loại: " + theLoai);
        System.out.println("Là sách series: " + (laSachSeries ? "Có" : "Không"));
    }
}
