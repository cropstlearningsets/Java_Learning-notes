package viscropst.PinTiA;

public class OddAndEven {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String[] line = scanner.nextLine().split(" ");
        int countOfLine = scanner.nextInt();
        int count1 = 0, count2 = 0;
        for (int i = 0; i < countOfLine; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0)
                count1++;
            else
                count2++;
        }
        System.out.println(count2 + " " + count1);
    }
}
