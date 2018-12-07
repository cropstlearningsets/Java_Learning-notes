/**
 *
 */
package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;

/**
 * @author TEDU
 *
 */
public class Score4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("�������" + (i + 1) + "�ſγɼ�");
            int score = scanner.nextInt();
            if (score < 0) {
                continue;
            }
            count++;
            sum = sum + score;
        }
        double average = sum * 1.0 / count;
        System.out.println(String.format(count + "�ſγ̵�ƽ����Ϊ%.2f", average));
    }

}
