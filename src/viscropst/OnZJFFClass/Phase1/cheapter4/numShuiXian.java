
public class numShuiXian {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int k = 100;
        while (k < 999) {
            k++;
            int s = (int) Math.round(Math.pow((k % 10), 3));
            int ten = (int) Math.round(Math.pow((k / 10 % 10), 3));
            int hund = (int) Math.round(Math.pow((k / 100), 3));
            if (s + ten + hund == k)
                System.out.println(k);
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int mAndn = n * m;
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int o = m;
        int p = n;
        while (m % 2 == 0 && n % 2 == 0) {
            m = m / 2;
            n = n / 2;
        }

        while (m != n) {
            int tmp = m;
            m = n;
            n = tmp - n;
			/*if(m<n){
				int t1 = m;
				m=n;
				n=t1;
			}*/
            if (n < 0)
                n = -n;
        }
        while (p != 0) {
            int tmp = o % p;
            o = p;
            p = tmp;
        }
        System.out.println("2:" + m);
        System.out.println("2:" + o);
        System.out.println("2:" + mAndn / m);
        System.out.println("2:" + mAndn / o);

    }

}
