package NhaSach_NhaNam;
// Task 1
public class DoChoiTreEm extends SanPham{
    // Private properties of DoChoiTreEm
    private String dcXuatXu;
    private String dcThuongHieu;
    private String dcNhaCungCap;
    private String dcHuongDanSuDung;

    // Create Parameterized Constructor
    public DoChoiTreEm(String maSanPham, String tenSanPham, int soLuong, double donGia,
                       String thuocDanhMuc, String dcXuatXu, String dcThuongHieu,
                       String dcNhaCungCap, String dcHuongDanSuDung) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        this.dcXuatXu = dcXuatXu;
        this.dcThuongHieu = dcThuongHieu;
        this.dcNhaCungCap = dcNhaCungCap;
        this.dcHuongDanSuDung = dcHuongDanSuDung;
    }
    // Create getter
    public String getDcXuatXu() {
        return dcXuatXu;
    }

    public String getDcThuongHieu() {
        return dcThuongHieu;
    }

    public String getDcNhaCungCap() {
        return dcNhaCungCap;
    }

    public String getDcHuongDanSuDung() {
        return dcHuongDanSuDung;
    }
    // Override methods
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nXuất sứ: " + getDcXuatXu()
                + "\nThương hiệu: " + getDcThuongHieu() + "\nNhà cung cấp: " + getDcNhaCungCap()
                + "\nHướng dẫn sử dụng: " + getDcHuongDanSuDung());
    }
    @Override
    public void PhanTramGiamGia() {
    }

    @Override
    public String toString() {
        return "Thông tin đồ chơi trẻ em:"
                + "\nMã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nXuất sứ: " + getDcXuatXu()
                + "\nThương hiệu: " + getDcThuongHieu() + "\nNhà cung cấp: " + getDcNhaCungCap()
                + "\nHướng dẫn sử dụng: " + getDcHuongDanSuDung();
    }
}
