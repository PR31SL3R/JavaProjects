public class Account {

    private float balance;
    private float minimumBalance = 10.00F;


    public float getBalance(){
        return balance;
    }

public void deposit(float amount){

        balance += amount;
}

public void withdraw(float amount){
        if(amount>balance){
            System.out.println("not sufficient funds");
            return;
        }
        balance=-amount;
    System.out.println(balance);
}

}