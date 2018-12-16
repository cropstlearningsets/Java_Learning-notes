/**
 *
 */
package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��һ����ĸ���򣬼���˳�����е���
 * @author TEDU
 *
 */
public class Characteristics {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] chars = new char[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < chars.length; i++) {
            chars[i] = scanner.next().charAt(0);
        }
        Arrays.sort(chars);
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - (i + 1)]);
        }
    }

}
