package Nhom6;
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
}
