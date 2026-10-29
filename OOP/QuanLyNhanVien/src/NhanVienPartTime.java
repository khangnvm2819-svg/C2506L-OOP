import java.util.Scanner;

public class NhanVienPartTime extends NhanVien {
    private double ratePerHour;
    private double hourPerMonth;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String maNV, String tenNV,
                            double ratePerHour, double hourPerMonth) {
        super(maNV, tenNV);
        this.ratePerHour = ratePerHour;
        this.hourPerMonth = hourPerMonth;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double getHourPerMonth() {
        return hourPerMonth;
    }

    public void setHourPerMonth(double hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("Nhap tien luong moi gio: ");
        ratePerHour = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap tong so gio lam trong thang: ");
        hourPerMonth = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double tinhLuong() {
        return ratePerHour * hourPerMonth;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("\n--- NHAN VIEN PART-TIME ---");
        super.hienThiThongTin();

        System.out.println("Luong moi gio: " + ratePerHour);
        System.out.println("So gio lam trong thang: " + hourPerMonth);
        System.out.println("Luong thuc nhan: " + tinhLuong());
    }
}