package day1;

import java.util.ArrayList;
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
    private List<Transaction> transactions = new ArrayList<>();

    // account type
    private AccountType accountType;

    // account status
    private AccountStatus accountStatus;

    // is card blocked
    private boolean isCardBlocked;

    //Address
    private Address address;

    // cards
    private List<Card> cards = new ArrayList<>();

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



    public BankAccount(){}

    public BankAccount(String accountNumber, String routingNumber, String ssn, AccountType accountType){}

    public BankAccount(String accountNumber, String routingNumber, String ssn, AccountType accountType, Address address){
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.ssn = ssn;
        this.accountType = accountType;
        this.address = address;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setCardBlocked(boolean cardBlocked) {
        isCardBlocked = cardBlocked;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public boolean isCardBlocked() {
        return isCardBlocked;
    }

    public Address getAddress() {
        return address;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getBANK_NAME() {
        return BANK_NAME;
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

    public double checkBalance(){
        return this.balance;
    }

    // card request => parameters -> account , what type of card

    public void cardRequest(BankAccount account, String cardType){

    }

    // change password
    // block card


}
