package day1;

import java.util.List;

public class BankAccount {

    // States

    // account Number
    private String accountNumber;
    // routing number
    private String routingNumber;
    private String ssn;
    // balance
    private double balance;

    // Transactions
    private List<Transaction> transactions;

    // account type
    private AccountType accountType;

    // account status
    private AccountStatus accountStatus;

    // is card blocked
    private boolean isCardBlocked;

    //Address
    private Address address;

    // cards
    private List<Card> cards;

    // mobile number
    // user id
    // password
    // account holder name
    // account holder dob

    // relationship status

    // social security number

    // beneficiaries


    // bank name
    private final String BANK_NAME = "Sanima Bank";

    public String getAccountNumber(BankAccount account){
        return account.accountNumber;
    }

    public void setAccountNumber(BankAccount account, String accountNumber){
        // checking of the format
        account.accountNumber = accountNumber;
    }

    public double getAccountBalance(BankAccount account){
        return account.balance;
    }

    public void setAccountBalance(BankAccount account, double balance){
        account.balance = balance;
    }

    public void setSSN(BankAccount account ,String ssn){
        account.ssn = ssn;
    }

    // Behaviour

    // deposit => Parameters, Arguments -> to which account, how much amount

    public boolean deposit(BankAccount toWhichAccount, double amount){
        toWhichAccount.balance = toWhichAccount.balance + amount;
        return true;
    }

    // withdraw => parameters -> from which account and how much amount

    public boolean withdraw(BankAccount fromWhichAccount, double amount){
        return true;
    }

    // transfer => parameters -> from which account, to which account, how much amount

    public boolean transfer(BankAccount toWhichAccount, BankAccount fromWhichAccount, double amount){
        return true;
    }

    // update kyc => parameters => KYCHelper Class ko object

    public void updateKYC(KYCHelper kycHelper){

    }

    // check balance => parameters -> account

    public double checkBalance(BankAccount account){
        return account.balance;
    }

    // card request => parameters -> account , what type of card

    public void cardRequest(BankAccount account, String cardType){

    }

    // change password
    // block card


}
