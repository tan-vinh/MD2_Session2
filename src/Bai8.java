import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap canh a: ");
            a = sc.nextDouble();
            System.out.print("Nhap canh b: ");
            b = sc.nextDouble();
            System.out.print("Nhap canh c: ");
            c = sc.nextDouble();

            if (a + b > c && a + c > b && b + c > a) {
                double s = (a + c + b)/2;
                System.out.println("Chu vi tam giac la: " + (a + b + c));
                System.out.println("Dien tich tam giac la: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            } else {
                System.out.println("Khong hop le. Vui long nhap lai.");
            }
        }
    }
}
