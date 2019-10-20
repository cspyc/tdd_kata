public class FebonacciArray {
    public int returnArrayNumber(int i) {
        if (i < 3) {
            return 1;
        } else {
            return returnArrayNumber(2) + returnArrayNumber(1);
        }
    }
}
