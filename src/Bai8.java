import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        int choice;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap canh a: ");
            a = sc.nextDouble();
            System.out.print("Nhap canh b: ");
            b = sc.nextDouble();
            System.out.print("Nhap canh c: ");
            c = sc.nextDouble();

            if (a + b > c && a + c > b && b + c > a) {
                do {
                    System.out.println("Nhập lựa chọn:");
                    System.out.println("1. Tính chu vi:");
                    System.out.println("2. Tính diện tích:");
                    System.out.println("3. thoát.");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Chu vi tam giac la: " + (a + b + c));
                            break;
                        case 2:
                            double s = (a + c + b)/2;
                            System.out.println("Dien tich tam giac la: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                            break;
                        case 3:
                            System.exit(choice);
                    }
                }while (choice != 3);
            } else {
                System.out.println("Khong hop le. Vui long nhap lai.");
            }
        }
    }
}
