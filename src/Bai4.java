import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bắt đầu từ : ");
        a = sc.nextInt();
        System.out.print("Kết thúc tại : ");
        b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                c = c + i;
            }
        }
        System.out.println("Tổng số chẵn trong khoảng là : " + c);
    }
}
