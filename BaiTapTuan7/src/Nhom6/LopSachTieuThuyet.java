package Nhom6;
public class LopSachTieuThuyet extends Book 
{
		private String theLoai;
		private boolean laSachSeries;
//		public LopSachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries)
//		{
//	     	super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
//	     	this.theLoai=theLoai;
//	     	this.laSachSeries=laSachSeries;
//		}
		public LopSachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries, double giaCoBan)
		{
	     	super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
	     	this.theLoai=theLoai;
	     	this.laSachSeries=laSachSeries;
		}
		@Override
		public double tinhGiaBan() 
		{
			if(laSachSeries)
				return giaCoBan + 15000;
		    return giaCoBan;
		}
		public String toString()
		{
			return super.toString()
					+"\nThể loại : " + theLoai 
					+ "\nLà sách series : " + laSachSeries
					+ "\nGiá Bán : " + this.tinhGiaBan();
		}				
}
