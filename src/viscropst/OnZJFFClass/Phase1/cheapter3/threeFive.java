package viscropst.OnZJFFClass.Phase1.cheapter3;

/**
 * @author TEDU
 */
public class threeFive {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("请输入整数：");
        int n = scanner.nextInt();
        if (n % 3 == 0 || n % 5 == 0)
            System.out.println("这个数可以被3或者5整除");
        else
            System.out.println("这个数不可以被3或者5整除");
    }

}
