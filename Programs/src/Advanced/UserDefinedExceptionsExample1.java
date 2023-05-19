package Advanced;

public class UserDefinedExceptionsExample1 {
    public static void main (String[] args) throws InvalidBalanceException {

        int balance;

        balance = Integer.parseInt(args[0]);
        updateBalance(balance);

    }

    public static void updateBalance(int number)throws InvalidBalanceException {
        if(number < 0) {
            throw (new InvalidBalanceException("Account balance cannot be less than Zero."));
        }

        System.out.println("No exception occured in updateBalance() method");
    }
}
