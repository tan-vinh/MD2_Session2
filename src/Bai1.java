import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số vào đây : ");
        n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Số " + n + " chia hết cho 3 và 5");
        } else {
            System.out.println("Số " + n + " không chia hết cho 3 va 5");
        }
    }
}
