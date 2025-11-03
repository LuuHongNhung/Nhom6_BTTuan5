package Nhom6;
	public class LopSachGiaoTrinh extends Book {
		private String monHoc;
		private String capDo;
	    public LopSachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo)
	    {
	    	  super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
	    	  this.monHoc=monHoc;
	    	  this.capDo=capDo;
	    }
	    public String toString()
	    {
	      return super.toString()+"Môn học" + monHoc 
	    		  + "Cấp độ" + capDo;
	    }
	    

	}
