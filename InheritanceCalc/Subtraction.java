public class Subtraction extends Calculator
{
    double diff;
    public void setDiff(){
        this.diff = diff;
    }
    
    public double getDiff(){
        return diff;
    }
    
    public Subtraction(double num1, double num2){
        super(num1,num2);
        this.diff = num1 - num2;
    }
}
