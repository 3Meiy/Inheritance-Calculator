public class Division extends Calculator
{
    double q;
    public void setQ(){
        this.q = q;
    }
    
    public double getQ(){
        return q;
    }
    
    public Division(double num1, double num2){
        super(num1, num2);
        this.q = num1 / num2;
    }
}
