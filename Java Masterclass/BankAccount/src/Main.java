public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account("123456", 1000, "Bob Brown", "bob@aol.com", "(123) 456-7890");
        Account timsAccount = new Account();//"654321", 1000, "Tim Buchalka", "tim@gmal.com", "(098) 765-4321"

        VipCustomer chase = new VipCustomer();
        System.out.println(chase.getName());
        VipCustomer jon = new VipCustomer("Jon Snow", "JonSnow@aol.com");
        System.out.println(jon.getName());
        VipCustomer ben = new VipCustomer("Uncle Ben", "uncleben@yahoo.com", 4000);
        System.out.println(ben.getName());
        System.out.println(ben.getEmail());
//        System.out.println("Bob");
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.deposit(500);
//        bobsAccount.withdrawal(2000);
//        bobsAccount.deposit(1000);
//        bobsAccount.withdrawal(2000);
//        System.out.println("Tim");
//        System.out.println(timsAccount.getBalance());
//        timsAccount.withdrawal(50);
//        timsAccount.deposit(2000);
//        timsAccount.deposit(4000);
//        timsAccount.withdrawal(3000);
//
//        System.out.println(bobsAccount.getAccount());
//        System.out.println(bobsAccount.getCustomer());
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getPhone());
//        System.out.println(bobsAccount.getEmail());
//        System.out.println(" ");
//        System.out.println(timsAccount.getAccount());
//        System.out.println(timsAccount.getCustomer());
//        System.out.println(timsAccount.getBalance());
//        System.out.println(timsAccount.getPhone());
//        System.out.println(timsAccount.getEmail());
//
//        Account dogsAccount = new Account("Dog", "dog@mindspring.com", "(123) 123-1234");
//        System.out.println(dogsAccount.getAccount() + " name " + dogsAccount.getCustomer());
    }
}

