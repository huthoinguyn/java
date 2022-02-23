/*
HỌ VÀ TÊN: NGUYỄN HỮU PHÁT
MSSV: PC03775
 */
package Phatnh_PC03775;

public class NhanVienHanhChinh extends NhanVien{

    public NhanVienHanhChinh() {
        
    }

    public NhanVienHanhChinh(String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

 
}

