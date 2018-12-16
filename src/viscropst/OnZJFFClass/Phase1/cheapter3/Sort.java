package viscropst.OnZJFFClass.Phase1.cheapter3;

public class Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] ins = scanner.nextLine().split(" ");
        int[] ite = new int[ins.length];
        int samp = Integer.parseInt(ins[0]);
        for (int j = 0; j < ins.length; j++) {
            ite[j] = Integer.parseInt(ins[j]);
        }
		/*for (int i = 1;i<ite.length;i++){
			if(samp<ite[i])
				samp=ite[i];
			else
				ite[i]=samp;
		}*/
        int a = ite[0];
        int b = ite[1];
        int c = ite[2];
		
		/*if(a > b && a >c){
			int temp=c;
			c = a;
			c=temp;
			if(a>b){
				temp=b;
				b = a;
				a=temp;
			}		
		}
		else if(b > a && b >c){
			int temp=c;
			c = b;
			b=temp;
			if(a>b){
				temp=a;
				b = a;
				a=temp;
			}
		}
		else{
			int temp=0;
			if(a>b){
				temp=b;
				b = a;
				a=temp;
			}
		}*/

        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = c;
            c = b;
            b = temp;
        }

        samp = c;
		/*
		int temp[]={0,0,0};
		
		if(a > b && a >c){
			temp[2]=a;
			if(b>c){
				temp[1]=b;
				temp[0]=c;
			}		
		}
		else if(b > a && b >c){
			temp[2]=c;
			if(a>c){
				temp[1]=a;
				temp[0]=c;
			}
		}
		else{
			temp[2]=c;
			if(b>a){
				temp[1]=b;
				temp[0]=a;
			}
		}*/
		
		
		/*Arrays.sort(ite);
		for(int i : ite)
		 System.out.print(i);*/
        System.out.print(samp);
    }

}
