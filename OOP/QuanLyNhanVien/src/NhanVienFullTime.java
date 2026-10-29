import java.util.Scanner;

public class NhanVienFullTime extends NhanVien {
    private double salary;
    private int exp;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String maNV, String tenNV,
                            double salary, int exp) {
        super(maNV, tenNV);
        this.salary = salary;
        this.exp = exp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("Nhap luong co ban: ");
        salary = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so nam kinh nghiem: ");
        exp = Integer.parseInt(sc.nextLine());
    }

    @Override
    public double tinhLuong() {
        return salary + salary * 0.1 * exp;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n--- NHAN VIEN FULL-TIME ---");
        super.hienThiThongTin();

        System.out.println("Luong co ban: " + salary);
        System.out.println("So nam kinh nghiem: " + exp);
        System.out.println("Luong thuc nhan: " + tinhLuong());
    }
}