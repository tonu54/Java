import java.util.Scanner;
public class bee1037 {
    public static void main(String[] args){
        System.out.println("Please Enter a Number: ");
        Scanner myNumber = new Scanner(System.in);

        double num = myNumber.nextDouble();

        if(num==0 || num<=25){
            System.out.println("[0,25]");
        }else if(num<=50){
            System.out.println("(25,50]");
        }else if(num<=75) {
            System.out.println("(50,75]");
        }else if(num<=100) {
            System.out.println("(75,100]");
        }else if(num<0 || num>100){
            System.out.println("Error!!!");
        }

        myNumber.close();
    }
}
