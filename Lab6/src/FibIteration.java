public class FibIteration implements FindFib{
    public int calculate_Fib(int number) {
        int result = 1;
        if (number == 1 || number == 2) {
            return result;
        }
        else{
            int little = 1;
            int big = 1;
            for (int i = 0; i < number - 2; i++){
                result = little + big;
                int temp = big;
                big += little;
                little = temp;
            }
        }
        return result;
    }
}

