package NhaSach_NhaNam;

public class KhachHang {
    private String MaKhachHang;
    private String HoTen;
    private String SoDienThoai;
    private String Email;
    private String NgaySinh;
    private String LoaiKhachHang;
    private double TongTienMuaHang;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String soDienThoai, String email, String ngaySinh,
                     String loaiKhachHang, double tongTienMuaHang) {
        MaKhachHang = maKhachHang;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        Email = email;
        NgaySinh = ngaySinh;
        LoaiKhachHang = loaiKhachHang;
        TongTienMuaHang = tongTienMuaHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return LoaiKhachHang;
    }

    public boolean setLoaiKhachHang(String loaiKhachHang) {
        if (LoaiKhachHang != null && (LoaiKhachHang.equals("Thường"))
                || (LoaiKhachHang.equals("VIP1")) || (LoaiKhachHang.equals("VIP2"))) {
            LoaiKhachHang = loaiKhachHang;
            return true;
        } else {
            System.err.println("Sai loại khách hàng");
            return false;
        }
    }

    public double getTongTienMuaHang() {
        return TongTienMuaHang;
    }

    public void setTongTienMuaHang(double tongTienMuaHang) {
        TongTienMuaHang = tongTienMuaHang;
    }
}
