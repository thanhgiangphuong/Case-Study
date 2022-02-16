package Task1_Task2_OOP;

public class MainClass {
    public static void main(String[] args) {
        // Create an new Sach object and transfer parameter into constractor
        SanPham mySach = new Sach("A001", "Kiếp Sau", "10",
                "50000", "Tiểu Thuyết", "Kim Đồng",
                "2017", "NoName","1/3", "9");
        mySach.HienThiThongTin();
        System.out.println("================================");

        // Create an new DoDungHocTap object and transfer parameter into constractor
        SanPham myDodunghoctap = new DoDungHocTap("B001", "Thước kẻ",
                "50", "5000", "Đồ Dùng", "Việt Nam",
                "Thiên Long", "ACB", "Không có",
                "Trong Trắng", "Nhựa", "20cm");
        myDodunghoctap.HienThiThongTin();
        System.out.println("================================");

        // Create an new DoChoiTreEm object and transfer parameter into constractor
        SanPham myDochoitreem = new DoChoiTreEm("C001", "Búp bê Barber",
                "5", "300000", "Búp bê", "China",
                "XingTon", "ACB","Không có");
        myDochoitreem.HienThiThongTin();


    }
}
