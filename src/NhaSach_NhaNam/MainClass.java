package NhaSach_NhaNam;

import java.util.Scanner;

import static NhaSach_NhaNam.MainmenuControll.FileCreating;

public class MainClass {
    public static void main(String[] args) {
    // Task 3 - Create files
//        FileCreating("Sach.csv");
//        FileCreating("Dodunghoctap.csv");
//        FileCreating("Dochoitreem.csv");
//        FileCreating("Khachhang.csv ");
//        FileCreating("Donhang.csv");

    // Task 2
        // Create scanner object to enter value from screen
        Scanner scanner = new Scanner(System.in);
        // Create a new object of MainmenuControll
        MainmenuControll mainmenuControll = new MainmenuControll();
        // Set condition to enter from screen
        while (true){
            System.out.println("------------------------------");
            System.out.println("Application Manager Book Store");
            System.out.println("Enter 1: Thêm sản phẩm");
            System.out.println("Enter 2: Hiển thị thông tin sản phẩm");
            System.out.println("Enter 3: Tìm kiếm sản phẩm");
            System.out.println("Enter 4: Trở về menu chính");
            String line = scanner.nextLine();
            switch (line){
                case "1": {
                    System.out.println("Enter a: Thêm sách");
                    System.out.println("Enter b: Thêm đồ dùng học tập");
                    System.out.println("Enter c: Thêm đồ chơi trẻ em");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Nhập mã sách: ");
                            String maSach = scanner.nextLine();
                            System.out.println("Nhập tên sách: ");
                            String tenSach = scanner.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int slSach = Integer.parseInt(scanner.nextLine());
                            System.out.println("Nhập đơn giá: ");
                            double giaSach = Double.parseDouble(scanner.nextLine());
                            System.out.println("Thuộc danh mục: ");
                            String danhMucsach = scanner.nextLine();
                            System.out.println("Nhà xuất bản: ");
                            String nXB = scanner.nextLine();
                            System.out.println("Năm xuất bản: ");
                            String namXB = scanner.nextLine();
                            System.out.println("Tác giả: ");
                            String tacGia = scanner.nextLine();
                            System.out.println("Ngày xuất bản: ");
                            String ngayXB = scanner.nextLine();
                            System.out.println("Lần tái bản: ");
                            String lanTaiBan = scanner.nextLine();
                            // Create object sach with SanPham type and add parameter for constractor
                            SanPham sach = new Sach(maSach, tenSach, slSach, giaSach, danhMucsach,
                                    nXB, namXB, tacGia, ngayXB, lanTaiBan);
                            // Call method addSanpham and transfer object dodunghoctap into this method
                            mainmenuControll.addSach(sach);
                      //      System.out.println(sach.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Nhập mã đồ dùng: ");
                            String maDodung = scanner.nextLine();
                            System.out.println("Nhập tên đồ dùng: ");
                            String tenDodung = scanner.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int slDodung = Integer.parseInt(scanner.nextLine());
                            System.out.println("Nhập đơn giá: ");
                            double giaDodung = Double.parseDouble(scanner.nextLine());
                            System.out.println("Thuộc danh mục: ");
                            String danhMucdoDung = scanner.nextLine();
                            System.out.println("Xuất xứ: ");
                            String xxDodung = scanner.nextLine();
                            System.out.println("Thương hiệu: ");
                            String thuonghieuDodung = scanner.nextLine();
                            System.out.println("Nhà cung cấp: ");
                            String nccDodung = scanner.nextLine();
                            System.out.println("Hướng dẫn sử dụng: ");
                            String hdsdDodung = scanner.nextLine();
                            System.out.println("Màu sắc: ");
                            String mausacDodung = scanner.nextLine();
                            System.out.println("Chất liệu: ");
                            String chatlieuDodung = scanner.nextLine();
                            System.out.println("Kích thước: ");
                            String kichthuocDodung = scanner.nextLine();
                            // Create object dodunghoctap with SanPham type and add parameter for constractor
                            SanPham dodunghoctap = new DoDungHocTap(maDodung, tenDodung, slDodung,
                                    giaDodung, danhMucdoDung, xxDodung, thuonghieuDodung, nccDodung,
                                    hdsdDodung, mausacDodung, chatlieuDodung, kichthuocDodung);
                            // Call method addSanpham and add to list
                            mainmenuControll.addDodung(dodunghoctap);
                        //    System.out.println(dodunghoctap.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Nhập mã đồ chơi: ");
                            String maDochoi = scanner.nextLine();
                            System.out.println("Nhập tên đồ chơi: ");
                            String tenDochoi = scanner.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int slDochoi = Integer.parseInt(scanner.nextLine());
                            System.out.println("Nhập đơn giá: ");
                            double giaDochoi = Double.parseDouble(scanner.nextLine());
                            System.out.println("Thuộc danh mục: ");
                            String danhMucdochoi = scanner.nextLine();
                            System.out.println("Xuất xứ: ");
                            String xxDochoi = scanner.nextLine();
                            System.out.println("Thương hiệu: ");
                            String thuonghieuDochoi = scanner.nextLine();
                            System.out.println("Nhà cung cấp: ");
                            String nccDochoi = scanner.nextLine();
                            System.out.println("Hướng dẫn sử dụng: ");
                            String hdsdDochoi = scanner.nextLine();
                            SanPham dochoitreem = new DoChoiTreEm(maDochoi, tenDochoi, slDochoi, giaDochoi,
                                    danhMucdochoi, xxDochoi, thuonghieuDochoi, nccDochoi,hdsdDochoi);
                            mainmenuControll.addDochoi(dochoitreem);
                          //  System.out.println(dochoitreem.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid 1");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a1: Hiển thị thông tin sách");
                    System.out.println("Enter b1: Hiển thị thông tin đồ dùng học tập");
                    System.out.println("Enter c1: Hiển thị thông tin đồ chơi trẻ em");
                    String type1 = scanner.nextLine();
                    switch (type1) {
                        case "a1": {
                            mainmenuControll.showListsach();
                            break;
                        }
                        case "b1": {
                            mainmenuControll.showListdodung();
                            break;
                        }
                        case "c1": {
                            mainmenuControll.showListdochoi();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    continue;
                }
                case "3": {
                    System.out.println("Nhập Mã sản phẩm để tìm kiếm: ");
                    String maSP = scanner.nextLine();
                    mainmenuControll.searchSanPhambyMaSanPham(maSP).forEach(sanPham -> {
                        System.out.println(sanPham.toString());
                    });
                    break;
                }
                case "4": {
                    System.out.println("Quay về menu chính");
                    continue;
                }
                default:
                    System.out.println("Invalid 2");
                    continue;
            }
        }
    }
}
