/**
 *
 */
package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

/**
 * ��5��ѧ���ĳɼ�����߷֣�����¼�ǵڼ���ѧ��
 * @author TEDU
 *
 */
public class Score {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] scores = new int[5];//������������Ϊ�������ÿռ�ʱ����ʼֵΪ0
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //[1]��ʼ������
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextInt();
        }
        //[2]����߷ּ�λ��
        int max_index = 0;
        int min_index = 0;
        int max = scores[0];
        int min = scores[min_index];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max_index = i;
                max = scores[max_index];
            }
            if (min > scores[i]) {
                min_index = i;
                min = scores[min_index];
            }
        }
        scanner.close();
        //[3]�ѽ�����
        System.out.println("��߷���" + max + "��λ���ǵ�" + (max_index + 1) + "��");
        System.out.println("��ͷ���" + min + "��λ���ǵ�" + (min_index + 1) + "��");
    }

}
