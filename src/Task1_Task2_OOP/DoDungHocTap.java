package Task1_Task2_OOP;

public class DoDungHocTap extends SanPham{
    // Private properties of DoDungHocTap
    private String XuatXu;
    private String ThuongHieu;
    private String NhaCungCap;
    private String HuongDanSuDung;
    private String MauSac;
    private String ChatLieu;
    private String KichThuoc;

    // Create Parameterized Constructor
    public DoDungHocTap(String maSanPham, String tenSanPham, String soLuong,
                        String donGia, String thuocDanhMuc, String xuatXu,
                        String thuongHieu, String nhaCungCap, String huongDanSuDung,
                        String mauSac, String chatLieu, String kichThuoc) {
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

    public String getKichThuoc() {
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
}
