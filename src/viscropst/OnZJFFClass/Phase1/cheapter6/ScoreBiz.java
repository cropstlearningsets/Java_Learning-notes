package cheapter6;

/***
 * 学生管理类
 * @author TEDU
 *
 */
public class ScoreBiz {
    String name;
    int java;
    int c;

    public int calcTotal() {
        int total = java + c;
        return total;
    }

    public double calcAvg() {
        return (calcTotal()) * 1.0 / 2.0;
    }

    public void printScore() {
        System.out.print(String.format("%s学生的java成绩是%d,c成绩是%d,总分是%d,平均分%.2f",
                name, java, c, calcTotal(), calcAvg()));
    }
}

class TestScoreBiz {
    public static void main(String[] args) {
        ScoreBiz st0 = new ScoreBiz();
        st0.name = "张三";
        st0.java = 150;
        st0.c = 150;
        st0.printScore();
    }
}