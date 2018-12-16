/**
 *
 */
package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

/**
 * ??5??????????????????????????????
 * @author TEDU
 *
 */
public class Score {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] scores = new int[5];//???????????????????????????????0
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        //[1]?????????
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextInt();
        }
        //[2]???????λ??
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
        //[3]???????
        System.out.println("??????" + max + "??λ?????" + (max_index + 1) + "??");
        System.out.println("??????" + min + "??λ?????" + (min_index + 1) + "??");
    }

}
