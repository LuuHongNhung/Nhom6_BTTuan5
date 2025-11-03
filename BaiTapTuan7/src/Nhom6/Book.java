package Nhom6;
public abstract class Book 
{
	protected String maSach;
	protected String tieuDe;
	protected String tacGia;
	protected int namXuatBan;
	protected int soLuong;
	protected double giaCoBan;
	public Book() 
	{		
	}
//	public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) 
//	{
//		this.maSach=maSach;
//		this.tieuDe=tieuDe;
//		this.tacGia=tacGia;
//		this.namXuatBan=namXuatBan;
//		this.soLuong=soLuong;
//    }
	public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
	{
		this.maSach=maSach;
		this.tieuDe=tieuDe;
		this.tacGia=tacGia;
		this.namXuatBan=namXuatBan;
		this.soLuong=soLuong;
		this.giaCoBan=giaCoBan;
    }
	public String getmaSach() 
	{
		return maSach;
	}
	public String gettieuDe() 
	{
		return tieuDe;
	}
	public String gettacGia()
	{
		return tacGia;
	}
	public int getnamXuatBan() 
	{
		return namXuatBan;
	}
	public int getsoLuong()
	{
		return soLuong;
	}
	public double getgiaCoBan()
	{
		return giaCoBan;
	}
	public void setmaSach(String maSach) 
	{
		this.maSach=maSach;
	}
	public void settieuDe(String tieuDe)
	{
		this.tieuDe=tieuDe;
	}
	public void settacGia(String tacGia) 
	{
		this.tacGia=tacGia;
	}
	public void setnamXuatBan(int namXuatBan) 
	{
		this.namXuatBan=namXuatBan;
	}
	public void setsoLuong(int soLuong)
	{
		this.soLuong=soLuong;
	}
	public void setgiaCoBan(double giaCoBan)
	{
		this.giaCoBan=giaCoBan;
	}
	public abstract double tinhGiaBan();

    public void hienThiThongTin() 
    {
		System.out.println("\nMã sách : "+ maSach +
				           "\nTiêu đề : " + tieuDe + 
				           "\nTác giả : " + tacGia + 
				           "\nNăm xuất bản : " + namXuatBan + 
				           "\nSố lượng : " + soLuong + 
				           "\n Giá cơ bản : " + giaCoBan);
    }
    public String toString()
    {
    	   return "\nMã sách : "+ maSach +
    	           "\nTiêu đề : " + tieuDe + 
    	           "\nTác giả : " + tacGia + 
    	           "\nNăm xuất bản : " + namXuatBan + 
    	           "\nSố lượng : " + soLuong +
    	           "\nGía cơ bản : " + giaCoBan;
    }
	

}
