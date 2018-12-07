package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;

public class Math1_1 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        int this_turn = 0;//this_turn=1
        for (int i = 1; i <= n; i++) {
            if (this_turn <= 2) {
                this_turn = i * (i - 1);
            } else
                this_turn = this_turn * i;
            sum = sum + this_turn;
            //sum=sum*i;
        }
        System.out.println(sum);
    }
}
