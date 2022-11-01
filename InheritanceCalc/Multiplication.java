public class Multiplication extends Calculator
{
    double prod;
    
    public void setProd(){
        this.prod = prod;
    }
    
    public double getProd(){
        return prod;
    }
    
    public Multiplication(double num1, double num2){
        super(num1, num2);
        this.prod = num1 * num2;
    }
}