import java.util.Scanner;
public class bee1048 {
    public static void main(String[] args){
        System.out.println("Please Enter Your Salary: ");
        Scanner mySal = new Scanner(System.in);

        double salary = mySal.nextDouble();
        double a = salary * 1.15;
        double b = salary * 1.12;
        double c = salary * 1.1;
        double d = salary * 1.07;
        double e = salary * 1.04;

        if(salary==0 || salary<=400){
            System.out.println("New Salary: "+a+"\nIncrement: "+(double)(a-salary)+"\nIncrement Percentage: 15%");
        }else if(salary<=800){
            System.out.println("New Salary: "+b+"\nIncrement: "+(double)(b-salary)+"\nIncrement Percentage: 12%");
        }else if(salary<=1200){
            System.out.println("New Salary: "+c+"\nIncrement: "+(double)(c-salary)+"\nIncrement Percentage: 10%");
        }else if(salary<=2000){
            System.out.println("New Salary: "+d+"\nIncrement: "+(double)(d-salary)+"\nIncrement Percentage: 7%");
        }else if(salary>2000){
            System.out.println("New Salary: "+e+"\nIncrement: "+(double)(e-salary)+"\nIncrement Percentage: 4%");
        }else{
            System.out.println("Please Enter a number greater than 0!!!");
        }
    }
}
