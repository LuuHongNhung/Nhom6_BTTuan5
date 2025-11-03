package Nhom6;
	public class LopSachTieuThuyet extends Book {
		private String theLoai;
		private boolean laSachSeries;
		public LopSachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries)
		{
	     	super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
	     	this.theLoai=theLoai;
	     	this.laSachSeries=laSachSeries;
		}
		public String toString()
		{
			return super.toString()
					+"Thể loại: " + theLoai 
					+ "Là sách series: " + laSachSeries;
		}
		
	}
