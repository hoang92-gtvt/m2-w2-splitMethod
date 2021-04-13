public class CylinderTest {

    public static final double PI = Math.PI;

    public static double getVolume(int radius, int height){
        double volume =getPerimeter(radius) * height + 2 * getArea(radius);
        return volume;
    }

    public static double getPerimeter(int radius) {
        return radius*PI*2;
    }

    public  static double getArea(int radius) {
        return  radius*radius*PI;

    }
}
