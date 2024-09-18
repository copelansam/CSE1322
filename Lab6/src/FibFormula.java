public class FibFormula implements FindFib{
    public int calculate_Fib(int number){
        int fibo1 = (int) Math.pow(((1+Math.sqrt(5)) / 2),number);
        int fibo2 =  (int) Math.pow(((1-Math.sqrt(5)) / 2),number);
       
        return (int) Math.round((fibo1 - fibo2) /  Math.sqrt(5));
    }
}
