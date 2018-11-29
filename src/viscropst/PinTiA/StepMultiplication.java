package viscropst.PinTiA;

public class StepMultiplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if(n<=0)
            return;

        int sum = 0;//求所有阶乘的和
        for (int j = 1; j <= n; j++) {
            int ch = 1;
            for (int i = 1; i <= j; i++) {
                ch=ch*i;
            }
            sum = sum + ch;
        }

        System.out.println(sum);
    }
}
