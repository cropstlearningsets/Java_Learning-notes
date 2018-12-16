package cheapter6;

public class Circle {

    //属性
    double radius;

    //方法
    void area() {
        double square = Math.PI * Math.pow(radius, 2);
        System.out.println(String.format("圆的面积为:%.2f", square));
    }
}