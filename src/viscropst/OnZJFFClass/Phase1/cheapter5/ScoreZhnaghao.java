package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter5;

/**
 * ʹ�����������ѧ���ɼ���ƽ����
 *
 * @author TEDU
 */
public class ScoreZhnaghao {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] scores = new int[5];
        int sum = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextInt();
            sum = sum + scores[i];
        }
        double average = sum * 1.0 / scores.length;
        System.out.println(String.format("���ѧ����ƽ���ɼ�Ϊ%.2f", average));
        scanner.close();
    }

}
