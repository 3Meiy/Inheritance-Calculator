public class Addition extends Calculator
{
    double sum;
    public void setSum(double sum){
        this.sum = sum;
    }
    
    public double getSum(){
        return sum;
    }
    
    public Addition(double num1, double num2){
        super(num1,num2);
        this.sum = num1 + num2;
    }
}
