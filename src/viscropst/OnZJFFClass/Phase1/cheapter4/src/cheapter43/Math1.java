package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;

/**
 * @author TEDU
 */
public class Math1 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("������n��ֵ��");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }

}
