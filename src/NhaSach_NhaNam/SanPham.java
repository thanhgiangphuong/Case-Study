package NhaSach_NhaNam;
// Task 1
public abstract class SanPham {
    // Create general properties
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private double DonGia;
    private String ThuocDanhMuc;

    // Create Parameterized Constructor
    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia, String thuocDanhMuc) {
        MaSanPham = maSanPham;
        TenSanPham = tenSanPham;
        SoLuong = soLuong;
        DonGia = donGia;
        ThuocDanhMuc = thuocDanhMuc;
    }
    // Create getter
    public String getMaSanPham() {
        return MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    // Create abstract methods
    public abstract void HienThiThongTin();
    public abstract void PhanTramGiamGia();

    @Override
    public String toString() {
        return "SanPham{" +
                "MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                ", ThuocDanhMuc='" + ThuocDanhMuc + '\'' +
                '}';
    }
}
