
public class SumOf1to100 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 0;
        int sum = 0;
        int sume = 0;
        int sumf = 0;
        int coun1 = 0;
        while (coun1 <= 100) {
            if ((coun1 % 2) == 0)
                sum = sum + coun1;
            else
                sume = sume + coun1;

            //	sum=sum+count;
            coun1++;
        }
		/*do{
			sum=sum+count;
			count++;
		}while(count<=100);*/
        do {
            if ((count % 2) == 0)
                sumf = sumf + count;
            count++;
        } while (count <= 100);
        int sumg = 0;
        count = 0;
        do {
            count++;
            if (count % 7 == 0)
                sumg += count;
        } while (count <= 50);
		/*int countx=0;
		while(sume+countx<=1000){
			/*if((count%2)==0)
				sum=sum+count;
			else
				sume=sume+count;*/
        //sume=sume+countx;
				/*if(sume>=990)
					break;*/
		/*		countx++;
		}*/
        System.out.println(sum);
        System.out.println(sumf);
        System.out.println(sumg);
    }

}
