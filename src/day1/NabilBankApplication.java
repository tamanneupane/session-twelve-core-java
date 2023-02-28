package day1;

public class NabilBankApplication {

    BankAccount ramAccount = new BankAccount();


    public static void main(String[] args) {
        int a = 2;

        BankAccount ramAccount = new BankAccount();

//        ramAccount.accountNumber = "12345";
        ramAccount.setAccountNumber("12345");

//        ramAccount.balance = 500;
//        ramAccount.setAccountBalance(500);
//
////        ramAccount.ssn = "111111";
//        ramAccount.setSSN("11111");

//        System.out.println(ramAccount.ssn);

        double ramBalance = ramAccount.checkBalance();

        System.out.println(ramBalance);

        BankAccount shyamAccount = new BankAccount();

//        shyamAccount.accountNumber = "67890";
        shyamAccount.setAccountNumber("67890");

//        shyamAccount.balance = 1000;
//        shyamAccount.setAccountBalance(1000);

        double shyamBalance = shyamAccount.checkBalance();

        System.out.println(shyamBalance);

        BankAccount firstAccount = new BankAccount();
//        BankAccount secondWay = new BankAccount("11111","2", "123456", AccountType.CURRENT);
        BankAccount thirdWay = new BankAccount("11111","2", "123456", AccountType.CURRENT, new Address());
    }

}
