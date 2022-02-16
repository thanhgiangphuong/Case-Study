package Task1_Task2_OOP;

public class Sach extends SanPham{
    // Private properties of Sach
    private String NhaXuatBan;
    private String NamXuatBan;
    private String TacGia;
    private String NgayXuatBan;
    private String LanTaiBan;

    // Create Parameterized Constructor
    public Sach(String maSanPham, String tenSanPham, String soLuong, String donGia,
                String thuocDanhMuc, String nhaXuatBan, String namXuatBan, String tacGia,
                String ngayXuatBan, String lanTaiBan) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        LanTaiBan = lanTaiBan;
    }
    // Create getter
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public String getNamXuatBan() {
        return NamXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public String getNgayXuatBan() {
        return NgayXuatBan;
    }

    public String getLanTaiBan() {
        return LanTaiBan;
    }
    // Override methods
    @Override
    public void HienThiThongTin() {
        System.out.println("Mã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nNhà xuất bản: " + getNhaXuatBan()
                + "\nNăm xuất bản: " + getNamXuatBan()+ "\nTác giả: " + getTacGia()
                + "\nNgày xuất bản: " + getNgayXuatBan()+ "\nLần tái bản: " + getLanTaiBan());
    }
    @Override
    public void PhanTramGiamGia() {

    }
}
