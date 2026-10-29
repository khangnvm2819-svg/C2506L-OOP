import java.util.Scanner;

public abstract class NhanVien {
    private String maNV;
    private String tenNV;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();

        System.out.print("Nhap ten nhan vien: ");
        tenNV = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ten nhan vien: " + tenNV);
    }

    public abstract double tinhLuong();
}
