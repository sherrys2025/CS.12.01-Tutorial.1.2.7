import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num < 0) {
            throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");
        }
        String number = "" + num;
        for (char c: number.toCharArray()) {
            digitList.add(Character.getNumericValue(c));
        }
    }


    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing()
    {
        int prev = digitList.get(0)-1;
        for (int i: digitList) {
            if (i <= prev) {
                return false;
            }
            prev = i;
        }
        return true;

    }

}
