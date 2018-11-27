package viscropst.HomeworkOfLife.Phase1;

import java.util.Scanner;

public class Shopping1 {
    public static void main(String[] args) {
        int[] points = {18, 25, 7, 36, 13, 2, 89, 63};
        new Phase0(new Scanner(System.in)).doing(points);
        int[] nums = new int[10];
        int[] count = new int[4];
        new Phase1(new Scanner(System.in)).doing(nums, count);
        int[] array = new int[]{1, 3, -1, 5, -2};
        new Phase2(new Scanner(System.in)).doing(array);
    }
}

class Phase0 {
    private Scanner scanner = null;

    public Phase0(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doing(int[] points) {
        int min = 0;
        int index = 0;
        min = points[index];
        for (int i = 0; i < points.length; i++) {
            if (points[i] < min) {
                //int tmp = min;
                min = points[i];
                index = i;
                //points[i] = tmp;
            }
        }
        System.out.println("最低积分为:" + min + "，它在数组中的原始位置是：" + index);
    }
}

class Phase1 {
    private Scanner scanner = null;

    public Phase1(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doing(int[] num, int[] count) {
        System.out.println("请输入十个数");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                default:
                    count[3]++;
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("数字%d 的个数：%d", i + 1, count[i]));
        }
        System.out.println(String.format("非法数字的个数：%d", 1, count[3]));
    }
}

class Phase2 {
    private Scanner scanner = null;

    public Phase2(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doing(int[] arrays) {
        int[] arrays0 = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 0)
                continue;
            else {
                arrays0[arrays.length - i - 1] = arrays[i];
            }
        }
        System.out.println("原数组为：");
        String s = "";
        for (int i :
                arrays) {
            s = s + i + " ";
        }
        System.out.println(s.trim());
        System.out.println("逆序并处理后的数组为：");
        String s0 = "";
        for (int i :
                arrays0) {
            s0 = s0 + i + " ";
        }
        System.out.println(s0.trim());
    }
}
