package Task1_Task2_OOP;

public abstract class SanPham {
    // Create general properties
    private String MaSanPham;
    private String TenSanPham;
    private String SoLuong;
    private String DonGia;
    private String ThuocDanhMuc;

    // Create Parameterized Constructor
    public SanPham(String maSanPham, String tenSanPham, String soLuong, String donGia, String thuocDanhMuc) {
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

    public String getSoLuong() {
        return SoLuong;
    }

    public String getDonGia() {
        return DonGia;
    }

    public String getThuocDanhMuc() {
        return ThuocDanhMuc;
    }

    // Create abstract methods
    public abstract void HienThiThongTin();
    public abstract void PhanTramGiamGia();
}
