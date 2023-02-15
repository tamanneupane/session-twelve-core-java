package day1;

public class NabilBankApplication {

    public static void main(String[] args) {
        int a = 2;

        BankAccount ramAccount = new BankAccount();

//        ramAccount.accountNumber = "12345";
        ramAccount.setAccountNumber(ramAccount, "12345");

//        ramAccount.balance = 500;
        ramAccount.setAccountBalance(ramAccount, 500);

//        ramAccount.ssn = "111111";
        ramAccount.setSSN(ramAccount, "11111");

//        System.out.println(ramAccount.ssn);

        double ramBalance = ramAccount.checkBalance(ramAccount);

        System.out.println(ramBalance);

        BankAccount shyamAccount = new BankAccount();

//        shyamAccount.accountNumber = "67890";
        shyamAccount.setAccountNumber(shyamAccount, "67890");

//        shyamAccount.balance = 1000;
        shyamAccount.setAccountBalance(shyamAccount, 1000);

        double shyamBalance = shyamAccount.checkBalance(shyamAccount);

        System.out.println(shyamBalance);
    }

}
