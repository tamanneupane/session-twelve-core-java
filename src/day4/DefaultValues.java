package day4;

import day1.AccountStatus;
import day1.AccountType;
import day1.Address;
import day1.BankAccount;

import java.util.Objects;
import java.util.Optional;

public class DefaultValues {

    public static void main(String[] args) {

        BankAccount ramAccount = new BankAccount("12345","2","111111", AccountType.CURRENT,new Address());

        System.out.println(ramAccount.getAccountNumber());
        System.out.println(ramAccount.getBalance());
        System.out.println(ramAccount.getAccountType());

//        if(ramAccount.getAccountStatus().equals(AccountStatus.ACTIVE)){
//            System.out.println("This account is active");
//        }

        boolean isAccountStatusNull = Objects.nonNull(ramAccount.getAccountStatus());
        System.out.println(isAccountStatusNull);

        AccountStatus status = Objects.requireNonNullElse(ramAccount.getAccountStatus(), AccountStatus.ACTIVE);

        Optional<AccountStatus> optionalAccountStatus = Optional.ofNullable(ramAccount.getAccountStatus());
        boolean checkAccountStatus = optionalAccountStatus.isPresent();

        if(checkAccountStatus){
            System.out.println(optionalAccountStatus.get());
        }

//        System.out.println(checkAccountStatus);
    }
}
