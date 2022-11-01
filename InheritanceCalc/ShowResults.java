import java.util.Scanner;
public class ShowResults
{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Num1: ");
        double input1 = scan.nextDouble();
        System.out.print("Input Num2: ");
        double input2 = scan.nextDouble();
        
        Addition add = new Addition(input1,input2);
        double sum = add.getSum();
        
        Subtraction sub = new Subtraction(input1,input2);
        double diff = sub.getDiff();
        
        Multiplication mul = new Multiplication(input1,input2);
        double prod = mul.getProd();
        
        Division div = new Division(input1,input2);
        double q = div.getQ();
        
        System.out.println("Results");
        System.out.println("Addidtion: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + q);
    }
}
