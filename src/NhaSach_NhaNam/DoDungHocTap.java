package NhaSach_NhaNam;
// Task 1
public class DoDungHocTap extends SanPham{
    // Private properties of DoDungHocTap
    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private Double KichThuoc;

    // Create Parameterized Constructor
    public DoDungHocTap(String maSanPham, String tenSanPham, int soLuong,
                        double donGia, String thuocDanhMuc, String xuatXu,
                        String thuongHieu, String nhaCungCap, String huongDanSuDung,
                        String mauSac, String chatLieu, Double kichThuoc) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        XuatXu = xuatXu;
        ThuongHieu = thuongHieu;
        NhaCungCap = nhaCungCap;
        HuongDanSuDung = huongDanSuDung;
        MauSac = mauSac;
        ChatLieu = chatLieu;
        KichThuoc = kichThuoc;
    }
    // Create getter
    public String getXuatXu() {
        return XuatXu;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public String getHuongDanSuDung() {
        return HuongDanSuDung;
    }

    public String getMauSac() {
        return MauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public Double getKichThuoc() {
        return KichThuoc;
    }
    // Override methods
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nXuất sứ: " + getXuatXu()
                + "\nThương hiệu: " + getThuongHieu() + "\nNhà cung cấp: " + getNhaCungCap()
                + "\nHướng dẫn sử dụng: " + getHuongDanSuDung() + "\nMàu sắc: " + getMauSac()
                + "\nChất liệu: " + getChatLieu() + "\nKích thước: " + getKichThuoc());
    }
    @Override
    public void PhanTramGiamGia() {
    }

    @Override
    public String toString() {
        return "Thông tin đồ dùng học tập: "
                + "\nMã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nXuất sứ: " + getXuatXu()
                + "\nThương hiệu: " + getThuongHieu() + "\nNhà cung cấp: " + getNhaCungCap()
                + "\nHướng dẫn sử dụng: " + getHuongDanSuDung() + "\nMàu sắc: " + getMauSac()
                + "\nChất liệu: " + getChatLieu() + "\nKích thước: " + getKichThuoc();
    }
}
