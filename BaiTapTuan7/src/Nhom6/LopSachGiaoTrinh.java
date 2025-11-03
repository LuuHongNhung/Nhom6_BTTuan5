package Nhom6;
public class LopSachGiaoTrinh extends Book 
{
		private String monHoc;
		private String capDo;
//	    public LopSachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo)
//	    {
//	    	  super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
//	    	  this.monHoc=monHoc;
//	    	  this.capDo=capDo;
//	    }
	    public LopSachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo, double giaCoBan)
	    {
	    	  super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
	    	  this.monHoc=monHoc;
	    	  this.capDo=capDo;
	    }
		@Override
		public double tinhGiaBan()
		{
			return giaCoBan + (2025-namXuatBan)*5000;
		}  
	    public String toString()
	    {
	      return super.toString()
	    		  +"\nMôn học : " + monHoc 
	    		  + "\nCấp độ : " + capDo 
	    		  + "\nGiá Bán : " + this.tinhGiaBan();
	    }
}