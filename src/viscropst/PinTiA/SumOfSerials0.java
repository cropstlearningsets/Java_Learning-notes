package viscropst.PinTiA;

public class SumOfSerials0 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String[] line = scanner.nextLine().split(" ");
        int countOfSerial = scanner.nextInt();
        double a = 2.0;
        double b = 1.0;
        double sum = 2.0;
        for (int i = 1; i < countOfSerial; i++) {
            double tmp = a;
            a = a + b;
            b = tmp;
            sum = sum + (a / b);
        }
        System.out.format("%.2f", sum);
    }
}
