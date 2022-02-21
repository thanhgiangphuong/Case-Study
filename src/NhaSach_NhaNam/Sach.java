package NhaSach_NhaNam;
// Task 1
public class Sach extends SanPham{
    // Private properties of Sach
    private String NhaXuatBan;
    private int NamXuatBan;
    private String TacGia;
    private String NgayXuatBan;
    private int LanTaiBan;

    // Create Parameterized Constructor
    public Sach(String maSanPham, String tenSanPham, int soLuong, double donGia,
                String thuocDanhMuc, String nhaXuatBan, int namXuatBan, String tacGia,
                String ngayXuatBan, int lanTaiBan) {
        super(maSanPham, tenSanPham, soLuong, donGia, thuocDanhMuc);
        NhaXuatBan = nhaXuatBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
        NgayXuatBan = ngayXuatBan;
        LanTaiBan = lanTaiBan;
    }
    // Create getters
    public String getNhaXuatBan() {
        return NhaXuatBan;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public String getNgayXuatBan() {
        return NgayXuatBan;
    }

    public int getLanTaiBan() {
        return LanTaiBan;
    }
    // Create setters

    public void setNamXuatBan(int namXuatBan) {
            NamXuatBan = namXuatBan;
        }

    public void setLanTaiBan(int lanTaiBan) {
        LanTaiBan = lanTaiBan;
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

    @Override
    public String toString() {
        return "Thông tin Sách: "
                + "\nMã sản phẩm: " + getMaSanPham() + "\nTên sản phẩm: "+ getTenSanPham()
                + "\nSố lượng: " + getSoLuong() + "\nĐơn giá: "+ getDonGia()
                + "\nThuộc danh mục: " + getThuocDanhMuc()+ "\nNhà xuất bản: " + getNhaXuatBan()
                + "\nNăm xuất bản: " + getNamXuatBan()+ "\nTác giả: " + getTacGia()
                + "\nNgày xuất bản: " + getNgayXuatBan()+ "\nLần tái bản: " + getLanTaiBan();
    }
}
