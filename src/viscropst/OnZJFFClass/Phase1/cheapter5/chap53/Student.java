package viscropst.OnZJFFClass.Phase1.cheapter5.src.chap53;


public class Student {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] names = new String[2][3];
        java.util.Scanner in = new java.util.Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                //依次把6位学生保存到二维数组中
                names[i][j] = in.next();
            }
        }
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                //依次把6位学生保存到二维数组中
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }

}
