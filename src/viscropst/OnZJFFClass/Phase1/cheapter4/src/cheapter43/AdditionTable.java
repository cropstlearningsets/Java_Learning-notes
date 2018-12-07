package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;

public class AdditionTable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner in = new java.util.Scanner(System.in);
        int num_in = in.nextInt();
        for (int i = 0, j = num_in; i <= num_in; i++, j--) {
            System.out.println(i + "+" + j + "=" + (i + j));
        }
        System.out.println("===============");
        for (int i = 0; i <= num_in; i++) {
            System.out.println(i + "+" + (num_in - i) + "=" + (i + (num_in - i)));
        }
    }

}
