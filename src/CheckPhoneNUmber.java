public class CheckPhoneNUmber {

    public static void main(String[] args) {

        CheckPhoneNUmber test = new CheckPhoneNUmber();
        test.checkPhone(22313);

    }

    public void checkPhone(int phoneToCheck){
        int checker = 0;
        while (((phoneToCheck) != 0)){
            phoneToCheck/=10;
            checker++;
        }
        if (checker < 6 || checker > 12)
        {
            System.out.println("not right format");
            System.out.println("you have " + checker);
            return;
        }

        System.out.println("right format " + checker);
    }

}
