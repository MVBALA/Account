public class Main {
    public static void main(String[] args) {
        Account sample = new Account("1234", 100000.56, "abc", "abc@gmail.com", "95437892102");
        System.out.println(sample.getNumber());
        System.out.println(sample.getCustomerName());
        System.out.println(sample.getBalance());
        System.out.println(sample.getCustomerEmailAddress());
        System.out.println(sample.getCustomerPhoneNumber());
        sample.withdrawal(100);
        sample.deposit(500);
        sample.withdrawal(600);
        sample.deposit(1000);
        sample.withdrawal(700);
        System.out.println("+++++++++++++++++++++");
        Account web=new Account();
        System.out.println(web.getNumber());
        System.out.println(web.getCustomerName());
        System.out.println(web.getBalance());
        System.out.println(web.getCustomerEmailAddress());
        System.out.println(web.getCustomerPhoneNumber());
        web.withdrawal(100);
        web.deposit(500);
        web.withdrawal(600);
        web.deposit(1000);
        web.withdrawal(700);
    }
}