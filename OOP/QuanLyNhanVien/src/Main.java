import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        int chon;

        do {
            System.out.println("\n========== QUAN LY NHAN VIEN ==========");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Tinh tong luong cong ty");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            try {
                chon = Integer.parseInt(sc.nextLine());

                switch (chon) {
                    case 1:
                        qlnv.themNhanVien(sc);
                        break;

                    case 2:
                        qlnv.hienThiDanhSach();
                        break;

                    case 3:
                        qlnv.tinhTongLuong();
                        break;

                    case 0:
                        System.out.println("Da thoat chuong trinh!");
                        break;

                    default:
                        System.out.println("Lua chon khong hop le!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so hop le!");
                chon = -1;
            }

        } while (chon != 0);

        sc.close();
    }
}