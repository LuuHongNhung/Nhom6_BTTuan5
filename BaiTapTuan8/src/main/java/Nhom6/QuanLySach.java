/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nhom6;

/**
 *
 * @author Tran
 */
import java.util.ArrayList;

public class QuanLySach 
{
    private final ArrayList<Sach> danhSachSach;

    public QuanLySach() 
    {
        danhSachSach = new ArrayList<>();
    }
 
    public void themSach(Sach sach) 
    {
        danhSachSach.add(sach);
    }
 
    public boolean xoaSach(String maSach) 
    {
        for (Sach s : danhSachSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                danhSachSach.remove(s);
                return true;
            }
        }
        return false;
    }
 
    public boolean capNhatSach(String maSach, Sach sachMoi) 
    {
        for (int i = 0; i < danhSachSach.size(); i++) 
        {
            if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maSach)) 
            {
                danhSachSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }
 
    public Sach timKiemSach(String maSach) 
    {
        for (Sach s : danhSachSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                return s;
            }
        }
        return null;
    }
 
    public void hienThiDanhSach() 
    {
        if (danhSachSach.isEmpty()) 
        {
            System.out.println("Danh sách sách trống.");
        } 
        else 
        {
            for (Sach s : danhSachSach) 
            {
                System.out.println(s.toString());
            }
        }
    }
}
