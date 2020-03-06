public class Binary {

    public int converterBinaryToDecimal(int number){
    double i = digits(number);
    int newdigit = 0;
        for (int j = 0; j < i; j++){
            //newdigit = newdigit + ((2^j)*(number%10));
            newdigit = newdigit + ((int)(Math.pow(2,j) * (number%10)));
            number = number/10;
        }

        return newdigit;
    }

    public String converterDecimalToBinary(int number2){
        double i = digits(number2);
        String newDigit = "";

        for (int j =0; j < i; j++){
            if (number2%2 == 0){
                number2 = (number2 -(number2 / 2));
                newDigit = newDigit.concat ("0");



            }

            else {
                number2 = (number2 -(int)Math.floor((number2 / 2)));
                newDigit = newDigit.concat ("1");

            }
        }

        return newDigit;
    }


    public double digits(int number){
        int digits = 0;
        while (number !=0){
            digits++;
            number = number/10;


        }
        return digits;
    }

    public static void main(String[] args) {

        Binary test = new Binary();
        System.out.println(test.converterBinaryToDecimal(11111));
        System.out.println(test.converterDecimalToBinary(31));

    }
}
