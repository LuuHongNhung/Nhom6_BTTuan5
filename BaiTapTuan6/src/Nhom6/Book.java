package Nhom6;
public class Book {
	protected String maSach;
	protected String tieuDe;
	protected String tacGia;
	protected int namXuatBan;
	protected int soLuong;
	public Book() {
		
	}
	public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
	{
		this.maSach=maSach;
		this.tieuDe=tieuDe;
		this.tacGia=tacGia;
		this.namXuatBan=namXuatBan;
		this.soLuong=soLuong;
    }
	public String getmaSach() {
		return maSach;
	}
	public String gettieuDe() {
		return tieuDe;
	}
	public String gettacGia() {
		return tacGia;
	}
	public int getnamXuatBan() {
		return namXuatBan;
	}
	public int getsoLuong() {
		return soLuong;
	}
	public void setmaSach(String maSach) {
		this.maSach=maSach;
	}
	public void settieuDe(String tieuDe) {
		this.tieuDe=tieuDe;
	}
	public void settacGia(String tacGia) {
		this.tacGia=tacGia;
	}
	public void setnamXuatBan(int namXuatBan) {
		this.namXuatBan=namXuatBan;
	}
	public void setsoLuong(int soLuong) {
		this.soLuong=soLuong;
	}
    public void hienThiThongTin() 
    {
		System.out.println("Mã sách : "+ maSach +
				           "\nTiêu đề : " + tieuDe + 
				           "\nTác giả : " + tacGia + 
				           "\nNăm xuất bản : " + namXuatBan + 
				           "\nSố lượng : " + soLuong);
    }
    public String toString()
    {
    	   return "Mã sách : "+ maSach +
    	           "\nTiêu đề : " + tieuDe + 
    	           "\nTác giả : " + tacGia + 
    	           "\nNăm xuất bản : " + namXuatBan + 
    	           "\nSố lượng : " + soLuong; 
    }
	

}
