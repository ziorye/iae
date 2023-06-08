package day0609.constructor.exercises.e2.demo;

public class CustomerTest {
    public static void main(String[] args) {
        //创建Customer实例
        Customer customer = new Customer("小富", "");

//        Account account = new Account(1000,2000,0.0123);
//        customer.setAccount(account);
        customer.setAccount(new Account(1000, 2000, 0.0123));


        //针对于客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户信息
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] 有一个账户:id=" + customer.getAccount().getId() + ",annualInterestRate=" +
                customer.getAccount().getAnnualInterestRate() * 100 + "%,balance=" +
                customer.getAccount().getBalance());

        new Account(1001, 2000, 0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());

        int num = 10;


    }
}
