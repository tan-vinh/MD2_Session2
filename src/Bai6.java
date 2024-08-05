public class Bai6 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;

        while (count < 20) {
            boolean soNguyenTo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    soNguyenTo = false;
                    break;
                }
            }
            if (soNguyenTo) {
                System.out.println(i + " ");
                count ++;
            }
            i ++;
        }
    }
}
