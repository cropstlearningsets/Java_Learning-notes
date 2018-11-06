package viscropst.PinTiA;

public class TheInspect {
    public static void main(String[] args) {
        // write your code here
        int N;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        N = Integer.parseInt(line[0]);
        int U = Integer.parseInt(line[1]);
        int D = Integer.parseInt(line[2]);
        int sum = 0;
        int i;
        for (i = 1; sum <= N; i++) {
            sum += U - D;
            if (sum >= N - 1)
                break;
            else
                i++;
        }
        System.out.println(i);
    }
}
