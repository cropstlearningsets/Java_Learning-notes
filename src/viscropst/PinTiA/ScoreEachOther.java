package viscropst.PinTiA;

public class ScoreEachOther {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        double[] final_sc=new double[n];
        for(int i = 0;i<n;i++){
            int[] t0=new int[k];
            for(int j=0;j<t0.length;j++)
                t0[j]=in.nextInt();
            java.util.Arrays.sort(t0);
            double avg = 0;
            for(int g=1;g<t0.length-1;g++)
                avg+=t0[g];
            final_sc[i]=avg*1.0/(k-2);
        }
        java.util.Arrays.sort(final_sc);
        String s = "";
        for(int l =m;l>=1;l--)
            s+=String.format("%.3f",final_sc[final_sc.length-l])+" ";
        System.out.print(s.trim());
    }
}
