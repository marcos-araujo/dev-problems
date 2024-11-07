public class ReverseInteger {

    /*
    Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
    The algorithm for myAtoi(string s) is as follows:

    Whitespace: Ignore any leading whitespace (" ").
    Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
    Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
     */

    public static void main(String[] args) {
        System.out.println(usingRemainder("42"));
        System.out.println(usingRemainder("-042"));
        System.out.println(usingRemainder("1337c0d3"));
        System.out.println(usingRemainder("0-1"));
        System.out.println(usingRemainder("words and 987"));
    }

    private static int usingRemainder(String number) {
        number = number.trim();
        int result = 0;
        int signal = 1;
        int x = 0;

        if (number.charAt(0) == '+' || number.charAt(0) == '-') {
            signal = number.charAt(0) == '+' ? 1 : -1;
            x++;
        }

        for (; x < number.length(); x++) {
            if (!Character.isDigit(number.charAt(x)))
                break;

            int digit = number.charAt(x) - '0';
            result = result * 10 + digit;

        }

        return result*signal;
    }

}
