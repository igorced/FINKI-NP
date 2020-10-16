package zadaca1;

public class RomanConverter {
    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
        String toReturn = "";
        if (n >= 1000) {
            int numOfRepeats = n/1000;
            for (int i=0; i<numOfRepeats; i++) {
                toReturn += "M";
            }
            n = n%1000;
        }

        if (n >= 100 && n <= 399) {
            int numOfRepeats = ((n / 100) );
            for (int i=0; i<numOfRepeats; i++) {
                toReturn += "C";
            }
            n = n%100;
        }
        else if (n >= 400 && n <= 499) {
            toReturn += "CD";
            n = n%100;
        }
        else if (n >= 500) {
            if (n >= 900) {
                toReturn += "CM";
            }
            else {
                toReturn += "D";
                int numOfRepeats = ((n / 100) - 5);
                for (int i = 0; i < numOfRepeats; i++) {
                    toReturn += "C";
                }
            }
            n = n%100;
        }

        if (n >= 10 && n <= 39) {
            int numOfRepeats = ((n / 10));
            for (int i=0; i<numOfRepeats; i++) {
                toReturn += "X";
            }
            n = n%10;
        }
        else if (n >= 40 && n <= 49) {
            toReturn += "XL";
            n = n%10;
        }
        else if (n >= 50) {
            if (n >= 90) {
                toReturn += "XC";
            }
            else {
                toReturn += "L";
                int numOfRepeats = ((n / 10) - 5);
                for (int i = 0; i < numOfRepeats; i++) {
                    toReturn += "X";
                }
            }
            n = n%10;
        }

        if (n >= 5 && n <= 9) {
            if (n == 5) {
                toReturn += "V";
                n = 0;
            }
            else if (n == 9) {
                toReturn += "IX";
                n = 0;
            }
            else {
                toReturn += "V";
                n = n - 5;
            }
        }

        if (n>=1) {
            if (n == 4) {
                toReturn += "IV";
            }
            else {
                for (int i = 0; i < n; i++) {
                    toReturn += "I";
                }
            }
        }
        return toReturn;
    }

}
