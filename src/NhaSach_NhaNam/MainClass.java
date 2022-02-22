package NhaSach_NhaNam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
        // Set main menu
        while (true) {
            System.out.println("------------------------------");
            System.out.println("Application Manager Book Store");
            System.out.println("Enter 1: Thêm sản phẩm");
            System.out.println("Enter 2: Hiển thị thông tin sản phẩm");
            System.out.println("Enter 3: Tìm kiếm sản phẩm");
            System.out.println("Enter 4: Trở về menu chính");
            String line = scanner.nextLine();
            switch (line) {
                // Set sub menu - add product
                case "1": {
                    System.out.println("Enter a: Thêm sách");
                    System.out.println("Enter b: Thêm đồ dùng học tập");
                    System.out.println("Enter c: Thêm đồ chơi trẻ em");
                    String type = scanner.nextLine();
                    switch (type) {
                        // Enter data for Sach
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

                            // Validate "Năm xuất bản"
                            int namXB;
                            do {
                                System.out.println("Năm xuất bản (Vui lòng điền số nằm trong khoảng 1000 -> 2021): ");
                                while (!scanner.hasNextInt()) {
                                    System.out.println("Vui lòng nhập số");
                                    scanner.next();
                                }
                                namXB = scanner.nextInt();
                                scanner.nextLine();
                            } while (namXB < 1000 || namXB > 2021);

                            // Enter tác giả
                            System.out.println("Tác giả: ");
                            String tacGia = scanner.nextLine();

                            //  Validate for Ngày Xuất Bản
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            sdf.setLenient(false);
                            Date ngayXB = null;
                            boolean valid;
                            do {
                                valid = true;
                                try {
                                    System.out.println("Nhập ngày xuất bản theo định dạng dd/MM/yyyy");
                                    ngayXB = sdf.parse(scanner.nextLine());
                                } catch (ParseException e) {
                                    System.out.println("Không hợp lệ!");
                                    valid = false;
                                }
                            } while (!valid);

                            // Validate Lần tái bản
                            int lanTaiBan;
                            do {
                                System.out.println("Lần tái bản (Vui lòng điền số nguyên dương): ");
                                while (!scanner.hasNextInt()) {
                                    System.out.println("Vui lòng nhập số");
                                    scanner.next();
                                }
                                lanTaiBan = scanner.nextInt();
                            } while (lanTaiBan <= 0);

                            // Create object sach with SanPham type and add parameter for constractor
                            SanPham sach = new Sach(maSach, tenSach, slSach, giaSach, danhMucsach,
                                    nXB, namXB, tacGia, ngayXB, lanTaiBan);
                            // Call method addSanpham to add data into list
                            mainmenuControll.addSach(sach);
                            // Call FileWriting method to write data into file
                            File_Utils.FileWriting("Sach.csv", sach.toString());
                            break;
                        }
                        // Enter data for Dodunghoctap
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
                            do {
                                switch (mausacDodung) {
                                    case "Xanh":
                                        System.out.println("Màu sắc: Xanh");
                                        break;
                                    case "Đỏ":
                                        System.out.println("Màu sắc: Đỏ");
                                        break;
                                    case "Vàng":
                                        System.out.println("Màu sắc: Vàng");
                                        break;
                                    case "Đen":
                                        System.out.println("Màu sắc: Đen");
                                        break;
                                    case "Trắng":
                                        System.out.println("Màu sắc: Trắng");
                                        break;
                                    default:
                                        System.out.println("Vui lòng nhập lại, chỉ được nhập trong phạm vi (Xanh, Đỏ, Vàng, Đen, Trắng)");
                                        mausacDodung = scanner.nextLine();
                                }
                            } while (false);


                            System.out.println("Chất liệu: ");
                            String chatlieuDodung = scanner.nextLine();
                            System.out.println("Kích thước: ");
                            String kichthuocDodung = scanner.nextLine();
                            // Create object dodunghoctap with SanPham type and add parameter for constractor
                            SanPham dodunghoctap = new DoDungHocTap(maDodung, tenDodung, slDodung,
                                    giaDodung, danhMucdoDung, xxDodung, thuonghieuDodung, nccDodung,
                                    hdsdDodung, mausacDodung, chatlieuDodung, kichthuocDodung);
                            // Call method addSanpham to add data into list
                            mainmenuControll.addDodung(dodunghoctap);
                            // Call FileWriting method to write data into file
                            File_Utils.FileWriting("Dodunghoctap.csv", dodunghoctap.toString());
                            break;
                        }
                        // Enter data for Dochoitreem
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
                                    danhMucdochoi, xxDochoi, thuonghieuDochoi, nccDochoi, hdsdDochoi);
                            // Call method adDochoi to add data into list
                            mainmenuControll.addDochoi(dochoitreem);
                            // Call FileWriting method to write data into file
                            File_Utils.FileWriting("Dochoitreem.csv", dochoitreem.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid 1");
                            break;
                    }
                    break;
                }
                // Set sub menu - show Info
                case "2": {
                    System.out.println("Enter a1: Hiển thị thông tin sách");
                    System.out.println("Enter b1: Hiển thị thông tin đồ dùng học tập");
                    System.out.println("Enter c1: Hiển thị thông tin đồ chơi trẻ em");
                    String type1 = scanner.nextLine();
                    switch (type1) {
                        // Show sach
                        case "a1": {
                            mainmenuControll.showListsach();
                            break;
                        }
                        // Show Dodunghoctap
                        case "b1": {
                            mainmenuControll.showListdodung();
                            break;
                        }
                        // Show Dochoitreem
                        case "c1": {
                            mainmenuControll.showListdochoi();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    // Return to main menu
                    continue;
                }
                // Search product
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
