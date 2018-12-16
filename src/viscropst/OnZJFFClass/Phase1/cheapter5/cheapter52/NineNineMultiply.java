package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

import java.util.Scanner;

/***
 * �žų˷���
 *
 *
 */

public class NineNineMultiply {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(String.format("%d*%d=%-4d", i, k, (i * k)));
            }
            System.out.println();
        }
    }

}
