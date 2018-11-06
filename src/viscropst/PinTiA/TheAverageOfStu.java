package viscropst.PinTiA;

public class TheAverageOfStu {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int tarC = scanner.nextInt();
        double sum = 0.0;
        int count = 0;
        int c1 = 0;
        if (tarC == 0) {
            System.out.println("average = " + 0.0);
            System.out.println("count = " + 0);
            return;
        }
        do {
            int n = scanner.nextInt();
            if (n >= 60)
                c1++;
            sum += n;
            count++;
        } while (count < tarC);
        System.out.println("average = " + (sum / tarC));
        System.out.println("count = " + c1);
    }

}
