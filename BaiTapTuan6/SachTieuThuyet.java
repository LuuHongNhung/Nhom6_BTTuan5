package Nhom6;

public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;
    
    public SachTieuThuyet() {
        super();
    }
    
    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, 
                         int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    
    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }
    
    public boolean isLaSachSeries() { return laSachSeries; }
    public void setLaSachSeries(boolean laSachSeries) { this.laSachSeries = laSachSeries; }
    
    @Override
    public String toString() {
        return super.toString() + 
               " SachTieuThuyet{" +
               "theLoai='" + theLoai + '\'' +
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