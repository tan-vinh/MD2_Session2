import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số để kiểm tra tính chẵn lẻ: ");
                    int n = sc.nextInt();
                    if (n % 2 == 0) {
                        System.out.println(n + " là số chẵn.");
                    } else {
                        System.out.println(n + " là số lẻ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số để kiểm tra số nguyên tố: ");
                    int n1 = sc.nextInt();
                    if (n1 == 1){
                        System.out.println(n1 + " không phải là số Nguyên tố");
                        break;
                    }
                    boolean soNguyenTo = true;
                    for (int j = 2; j <= Math.sqrt(n1); j++) {
                        if (n1 % j == 0) {
                            soNguyenTo = false;
                            break;
                        }
                    }
                    if (soNguyenTo) {
                        System.out.println(n1 + " là số Nguyên tố");
                    }else {
                        System.out.println(n1 + " không phải là số Nguyên tố");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số để kiểm tra chia hết cho 3: ");
                    int n2 = sc.nextInt();
                    if (n2 % 3 == 0) {
                        System.out.println(n2 + " chia hết cho 3.");
                    } else {
                        System.out.println(n2 + " không chia hết cho 3.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        sc.close();
    }
}
