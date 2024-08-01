public class Bai5 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (i == 2) {
                System.out.print(i + " ");
                continue;
            } else if (i == 3) {
                System.out.print(i + " ");
                continue;
            } else if (i == 5) {
                System.out.print(i + " ");
                continue;
            } else if (i == 7) {
                System.out.print(i + " ");
                continue;
            } else if (i % 2 == 0) {
                continue;
            }else if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    System.out.print(i + " ");
            }
        }
    }
}
