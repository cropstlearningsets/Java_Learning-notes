package viscropst.PinTiA;

public class ShuiXianNum {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        int l = (int)Math.pow(10,n-1);
        int m = l*10;
        String message ="";
        for(int i = l;i<m;i++) {
            double sum = 0;
            int j = i;
            do {
                /*int tmp = 1;
                for (int k = 0; k <n ; k++) {
                    tmp = tmp*(j%10);
                }*/
                sum = sum + Math.round(pow((j % 10), n));
                j = j / 10;
            } while (j != 0);
            if (Math.round(sum) == i)
                message += Math.round(sum) + "\n";
        }
        System.out.print(message);
        System.out.println("time："+System.currentTimeMillis());
        /*HashMap<Integer, Integer[]> hashMap = new HashMap();
        hashMap.put(3,new Integer[]{153,370,371,407});
        hashMap.put(4,new Integer[]{1634,8208,9474});
        hashMap.put(5,new Integer[]{54748,92727,93084});
        hashMap.put(6,new Integer[]{548834});
        hashMap.put(7,new Integer[]{1741725,4210818,9800817,9926315});
        for (int i:
                hashMap.get(n) ) {
            System.out.println(i);
        }*/


    }
    public static int pow(int x ,int n){
        int tmp =1;
        for (int i = 0; i <n ; i++) {
            tmp = tmp * x;
        }
        return tmp;
    }
}
