import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSach = new ArrayList<>();

    public void themNhanVien(Scanner sc) {
        System.out.println("\n===== THEM NHAN VIEN =====");
        System.out.println("1. Nhan vien Full-time");
        System.out.println("2. Nhan vien Part-time");
        System.out.print("Chon loai nhan vien: ");

        int loai = Integer.parseInt(sc.nextLine());

        NhanVien nv;

        if (loai == 1) {
            nv = new NhanVienFullTime();
        } else if (loai == 2) {
            nv = new NhanVienPartTime();
        } else {
            System.out.println("Loai nhan vien khong hop le!");
            return;
        }

        nv.nhapThongTin(sc);

        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaNV().equalsIgnoreCase(nv.getMaNV())) {
                System.out.println("Ma nhan vien da ton tai!");
                return;
            }
        }

        danhSach.add(nv);

        System.out.println("Them nhan vien thanh cong!");
    }

    public void hienThiDanhSach() {
        System.out.println("\n===== DANH SACH NHAN VIEN =====");

        if (danhSach.isEmpty()) {
            System.out.println("Danh sach nhan vien trong!");
            return;
        }

        for (NhanVien nv : danhSach) {
            nv.hienThiThongTin();
            System.out.println("-----------------------------");
        }
    }

    public void tinhTongLuong() {
        double tongLuong = 0;

        for (NhanVien nv : danhSach) {
            tongLuong += nv.tinhLuong();
        }

        System.out.println("\n===== TONG LUONG CONG TY =====");
        System.out.printf("Tong luong: %,.0f VND%n", tongLuong);
    }
}