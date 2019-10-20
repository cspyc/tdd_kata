public class Fibonacci {
    public int return_fibonacci_number(int position) {
        if (position < 3) {
            return 1;
        } else if(position >= 3) {
            return return_fibonacci_number(position -1) + return_fibonacci_number(position -2);
        }
        return 2;
    }
}
