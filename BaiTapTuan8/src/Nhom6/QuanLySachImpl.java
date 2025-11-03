package Nhom6;

import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
	private final List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) 
    {
        danhSach.add(sach);
    }

    @Override
    public Sach timKiemSach(String tieuDe) 
    {
        for (Sach s : danhSach) 
        {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) 
            {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) 
    {
        Sach found = timKiemSach(tieuDe);
        if (found != null) 
        {
            danhSach.remove(found);
            return true;
        }
        return false;
    }

    @Override
    public List<Sach> hienThiDanhSach() 
    {
        return new ArrayList<>(danhSach);
    }
}
