/**
 * Created by YSingh on 06/02/17.
 */
public class Problem17 {
    public static void main(String[] args) {
        int sum = 0;
        int size = 1000;
        String [] arr = new String[size + 1];
        for (int i = 0; i <= size; i++) {
            sum = sum + getLetters(i, arr);
        }

        System.out.println(sum);
    }

    private static int getLetters(int i, String[] arr) {
        String letter = "";
        switch (i) {
            case 0: letter = ""; arr[i] = letter;
                break;
            case 1 : letter = "one"; arr[i] = letter;
                break;
            case 2 : letter = "two"; arr[i] = letter;
                break;
            case 3 : letter = "three"; arr[i] = letter;
                break;
            case 4 : letter = "four"; arr[i] = letter;
                break;
            case 5 : letter = "five"; arr[i] = letter;
                break;
            case 6 : letter = "six"; arr[i] = letter;
                break;
            case 7 : letter = "seven"; arr[i] = letter;
                break;
            case 8 : letter = "eight"; arr[i] = letter;
                break;
            case 9 : letter = "nine"; arr[i] = letter;
                break;
            case 10 : letter = "ten"; arr[i] = letter;
                break;
            case 11 : letter = "eleven"; arr[i] = letter;
                break;
            case 12 : letter = "twelve"; arr[i] = letter;
                break;
            case 13 : letter = "thirteen"; arr[i] = letter;
                break;
            case 14 : letter = "fourteen"; arr[i] = letter;
                break;
            case 15 : letter = "fifteen"; arr[i] = letter;
                break;
            case 16 : letter = "sixteen"; arr[i] = letter;
                break;
            case 17 : letter = "seventeen"; arr[i] = letter;
                break;
            case 18 : letter = "eighteen"; arr[i] = letter;
                break;
            case 19 : letter = "nineteen"; arr[i] = letter;
                break;
            case 20 : letter = "twenty"; arr[i] = letter;
                break;
            case 30 : letter = "thirty"; arr[i] = letter;
                break;
            case 40 : letter = "forty"; arr[i] = letter;
                break;
            case 50 : letter = "fifty"; arr[i] = letter;
                break;
            case 60 : letter = "sixty"; arr[i] = letter;
                break;
            case 70 : letter = "seventy"; arr[i] = letter;
                break;
            case 80 : letter = "eighty"; arr[i] = letter;
                break;
            case 90 : letter = "ninety"; arr[i] = letter;
                break;
            case 100 : letter = "one hundred"; arr[i] = letter;
                break;
            case 200 : letter = "two hundred"; arr[i] = letter;
                break;
            case 300 : letter = "three hundred"; arr[i] = letter;
                break;
            case 400 : letter = "four hundred"; arr[i] = letter;
                break;
            case 500 : letter = "five hundred"; arr[i] = letter;
                break;
            case 600 : letter = "six hundred"; arr[i] = letter;
                break;
            case 700 : letter = "seven hundred"; arr[i] = letter;
                break;
            case 800 : letter = "eight hundred"; arr[i] = letter;
                break;
            case 900 : letter = "nine hundred"; arr[i] = letter;
                break;
            case 1000 : letter = "one thousand"; arr[i] = letter;
                break;
            default:
                letter = getOtherLetters(i, arr); arr[i] = letter;
                break;
        }

        System.out.println(i + "->" + letter + ": " + getLength(letter));
        return getLength(letter);
    }

    private static int getLength(String letter) {
        return letter.replace(" ", "").length();
    }

    private static String getOtherLetters(int i, String[] arr) {
        //227 => 200 + 27
        //to get 27 we need to get mod of 100
        //to get 100 we need to get total digits

        int k = 0;
        int value = i;
        while (value > 0) {
            value = value / 10;
            k++;
        }
        int mul = (int)Math.pow(10, k - 1);
        String andString = "and";
        if(i > 100) {
            return arr[mul * (i / mul)] + " " + andString + " " + arr[i % mul];
        }
        return arr[mul * (i / mul)] + " " + arr[i % mul];
    }


}
