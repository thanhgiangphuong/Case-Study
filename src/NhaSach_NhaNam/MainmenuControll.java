package NhaSach_NhaNam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
    public void addSach(SanPham sachh) {
        this.Sachs.add(sachh);
    }

    public void addDodung(SanPham dodungg) {
        this.Dodungs.add(dodungg);
    }

    public void addDochoi(SanPham dochoii) {
        this.Dochois.add(dochoii);
    }

    // Create showListInfor_SanPham method
    public void showListsach() {
        List a1 = File_Utils.FileReading("Sach.csv");
        for (Object showList1 : a1) {
            System.out.println(showList1.toString());
        }
    }

    public void showListdodung() {
        List a2 = File_Utils.FileReading("Dodunghoctap.csv");
        for (Object showList1 : a2) {
            System.out.println(showList1.toString());
        }
    }

    public void showListdochoi() {
        List a3 = File_Utils.FileReading("Dochoitreem.csv");
        for (Object showList1 : a3) {
            System.out.println(showList1.toString());
        }
    }

    //    // Return a list when search SanPham by MaSanPham
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
        if (sanphambyMaSP.isEmpty()) {
            System.out.println("Sản phẩm này không tồn tại");
            return new ArrayList<>();
        } else {
            return sanphambyMaSP;
        }
        // Use lambda (abbreviation)
        // return this.sanPhams.stream().filter(san -> san.getMaSanPham().contains(MaSP)).collect(Collectors.toList());
    }
}


