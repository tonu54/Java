import java.util.Scanner;

public class bee1043 {
    public static void main(String[] args) {
        System.out.println("Please Enter three floating values: ");
        double[] values = new double[3];
        Scanner myValues = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            values[i] = myValues.nextDouble();
        }

        double a = values[0] + values[1];
        double b = values[1] + values[2];
        double c = values[2] + values[0];
        double perimeter = values[0] + values[1] + values[2];
        double area = 0.5 * a * values[2];

        if (a > values[2] && b > values[0] && c > values[1]) {
            System.out.println("The perimeter of the triangle is : " + perimeter);
        } else {
            System.out.println("The area of the trapezium is: " + area);
        }

        myValues.close();
    }
}
