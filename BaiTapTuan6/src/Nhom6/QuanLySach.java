package Nhom6;
 NguyenThanhNguyen
import java.util.ArrayList;
public class QuanLySach extends Book{
	private ArrayList<Book> danhSachSach;
	public QuanLySach()
	{
		danhSachSach = new ArrayList<Book>();
	}
    public void themSach(Book book)
    {
    	    danhSachSach.add(book);
    }
    public boolean xoaSach(String maSach)
    {
    	   for(int i=0; i<danhSachSach.size(); i++)
    	   {
    		   Book book =danhSachSach.get(i);
    		   if(book.getmaSach().equals(maSach))
    		   {
    			   danhSachSach.remove(i);
    			   return true;
    		   }
    	   }
    	   return false;
    }
    public boolean capNhat(String maSach, Book bookNew)
    {
    	 for(int i=0; i<danhSachSach.size(); i++)
    	 {
    		 if(danhSachSach.get(i).getmaSach().equalsIgnoreCase(maSach))
    		 {
    			 danhSachSach.set(i, bookNew);
    			 return true;
    		 }
    		 
    	 }
    return false;
   }
    public Book timKiemTheoMa(String maSach) 
    	{
    		for(int i=0; i<danhSachSach.size(); i++)
    		{
    			Book book = danhSachSach.get(i);
    			if(book.getmaSach().equalsIgnoreCase(maSach))   				
    				return book;
    		}
    		return null;
    	}
    	public void hienThiDanhSachSach()
    	{
    		  if (danhSachSach.isEmpty()) 
    	            System.out.println("Danh sách sách trống!");
    	      else 
    	      {
    	    	   for(int i=0; i<danhSachSach.size(); i++)   	    	
    	    		   for (Book b : danhSachSach) 
    	    	            System.out.println(b);    	    	    	    	   
    	      }
    	}

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;
    
    public QuanLySach() {
        this.danhSachSach = new ArrayList<>();
    }
    
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }
    
    public boolean xoaSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.remove(sach);
                System.out.println("Đã xóa sách: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + maSach);
        return false;
    }
    
    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            if (danhSachSach.get(i).getMaSach().equals(maSach)) {
                danhSachSach.set(i, sachMoi);
                System.out.println("Đã cập nhật sách: " + maSach);
                return true;
            }
        }
        System.out.println("Không tìm thấy sách với mã: " + maSach);
        return false;
    }
    
    public Sach timKiemTheoMa(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null;
    }
    
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống!");
            return;
        }
        
        System.out.println("\n=== DANH SÁCH SÁCH ===");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSachSach.get(i).toString());
        }
        System.out.println("======================\n");
    }
    
    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }
 BaiTapTuan8
}
