public class Bai6 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;

        while (count < 20) {
            if (i == 2) {
                System.out.print(i + " ");
                count ++;
            } else if (i == 3) {
                System.out.print(i + " ");
                count ++;
            } else if (i == 5) {
                System.out.print(i + " ");
                count ++;
            } else if (i == 7) {
                System.out.print(i + " ");
                count ++;
            } else if (i % 2 == 0) {
                count = count + 0;
            }else if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                count = count + 0;
            }else {
                System.out.print(i + " ");
                count ++;
            }
            i ++;
        }
    }
}
