package Class_Assignment;
public class SumOfNumsInString {

    public static void main(String[] args) {
        String s = "ab4cy5x12j1000fkm";
        //output=1021
        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');  // build number
            } else {
                sum += num;  // add completed number
                num = 0;
            }
        }

        // add last number if string ends with digit
        sum += num;

        System.out.println("sum = " + sum);
    }
}
