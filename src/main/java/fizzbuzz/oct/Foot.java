package fizzbuzz.oct;

/**
 * @author pi
 * @date 2020/10/28 12:30 AM
 **/
public class Foot {
    private final int length;

    public Foot(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getInchLength() {
        return length * 12;
    }
}
