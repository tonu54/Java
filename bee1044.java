import java.util.Scanner;
public class bee1044 {
    public static void main(String[] args){
        System.out.println("Please Enter two values: ");
        Scanner myValues = new Scanner(System.in);
        double [] values = new double[2];

        for(int i=0; i<2; i++){
            values[i] = myValues.nextDouble();
        }

        if (values[0] % values[1] == 0 || values[1] % values[0] == 0) {
            System.out.println("These two numbers are multiples.");
        }else{
            System.out.println("These Two numbers are not multiples. ");
        }
    }
}
