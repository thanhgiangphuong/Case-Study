package NhaSach_NhaNam;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainmenuControll {
    // Create a list to add san pham
    private List<SanPham> Sachs;
    private List<SanPham> Dodungs;
    private List<SanPham> Dochois;

    // Create no-arg Constructor
    public MainmenuControll() {
        this.Sachs = new ArrayList<>();
        this.Dodungs = new ArrayList<>();
        this.Dochois = new ArrayList<>();
    }
    // Create addSanPham method
//    public void addSanPham(SanPham sanPham) {
//        this.Sachs.add(sanPham);
//        this.Dodungs.add(sanPham);
//        this.Dochois.add(sanPham);
//    }
    public void addSach (SanPham sachh){
        this.Sachs.add(sachh);
    }
    public void addDodung (SanPham dodungg){
        this.Dodungs.add(dodungg);
    }
    public void addDochoi (SanPham dochoii){
        this.Dochois.add(dochoii);
    }
    // Create showListInfor_SanPham method
    //public void showListInfor_SanPham() {
        // Use lambda (abbreviation)
//        this.sanPhams.forEach(sp -> System.out.println(sp.toString()));
//        this.sanPhams.forEach(n -> System.out.println(n));
        // Use Iterator
//        Iterator<SanPham> showList1 = this.sanPhams.iterator();
//        while (showList1.hasNext()) {
//            System.out.println(showList1.next());
//        }
        // Use forEach
    public void showListsach() {
        for (SanPham showList1 : this.Sachs) {
            System.out.println(showList1);
        }
    }
    public void showListdodung() {
        for (SanPham showList2 : this.Dodungs) {
            System.out.println(showList2);
        }
    }
    public void showListdochoi(){
        for (SanPham showList3 : this.Dochois) {
            System.out.println(showList3);
        }
    }

    // Return a list when search SanPham by MaSanPham
    public List<SanPham> searchSanPhambyMaSanPham(String MaSP) {
        List sanphambyMaSP = new ArrayList<>();
        for (SanPham sanPham : this.Sachs) {
            if (sanPham.getMaSanPham().contains(MaSP)) {
                sanphambyMaSP.add(sanPham);
            }
        }
        for (SanPham sanPham1 : this.Dodungs) {
            if (sanPham1.getMaSanPham().contains(MaSP)) {
                sanphambyMaSP.add(sanPham1);
            }
        }
        for (SanPham sanPham2 : this.Dochois) {
            if (sanPham2.getMaSanPham().contains(MaSP)) {
                sanphambyMaSP.add(sanPham2);
            }
        }
        if (sanphambyMaSP.isEmpty()){
            System.out.println("Sản phẩm này không tồn tại");
            return new ArrayList<>();
        } else {
            return sanphambyMaSP;
        }
        // Use lambda (abbreviation)
        // return this.sanPhams.stream().filter(san -> san.getMaSanPham().contains(MaSP)).collect(Collectors.toList());
    }

    // Create a file creation method
    public static void FileCreating (String fileName) {
        // Create file
        try {
            File CS_file = new File(fileName);
            if(CS_file.createNewFile()){
                System.out.println("File đã được tạo: " + CS_file.getName());
            } else {
                System.out.println("File đã tồn tại");
            }
        } catch (IOException e){
            System.out.println("Đã xảy ra lỗi");
            e.printStackTrace();
        }
    }
}

