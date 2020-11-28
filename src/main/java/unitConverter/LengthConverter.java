package unitConverter;

/**
 * @author pi
 * @date 2020/11/25 11:21 PM
 **/
public class LengthConverter {
    public int convertUnitToInch(int length, String unit) {
        if ("foot".equals(unit)) {
            return length * 12;
        }
        if ("yard".equals(unit)) {
            return length * 12 * 3;
        }
        return length;
    }

    public int convertUnitToFoot(int length, String unit) {
        if ("yard".equals(unit)) {
            return length * 3;
        }
        return length;
    }
}
