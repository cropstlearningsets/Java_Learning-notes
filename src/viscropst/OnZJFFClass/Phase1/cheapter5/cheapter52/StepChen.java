package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

import java.util.Scanner;

/**
 * ��n�Ľ׳�
 *
 * @author TEDU
 */
public class StepChen {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0)
            return;

        int sum = 0;//�����н׳˵ĺ�
        for (int j = 1; j <= n; j++) {
            int ch = 1;
            for (int i = 1; i <= j; i++) {
                ch = ch * i;
            }
            sum = sum + ch;
        }

        System.out.println(sum);
    }

}
