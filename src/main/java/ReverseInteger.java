public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(usingRemainder("2321"));

    }

    private static int usingRemainder(String number) {

        number = number.trim();
        int result = 0;
        int signal = 1;

        if (number.charAt(0) == '-')
            signal=-1;
        else if (number.charAt(0) == '+')



        for (int x = 0; x < number.length(); x++) {



            int digit = number.charAt(x) - '0';
            result = result * 10 + digit;



        }
        return 1;
    }

}
