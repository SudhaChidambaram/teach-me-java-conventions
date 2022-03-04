package powerpackage;

public class PowerFinder {

    public static int powerOf(int baseNo, int powerNo) {
        int result = 1;
        for (int i = 0; i<powerNo; i++) {
            result *= baseNo;
        }
        return result;
    }
}
