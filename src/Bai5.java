public class Bai5 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean soNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo) {
                System.out.print(i + " ");
            }
        }
    }
}
