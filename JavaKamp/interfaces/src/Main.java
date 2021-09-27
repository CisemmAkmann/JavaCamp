public class Main {

    public static void main(String[] args) {
        Logger[] loggers = new Logger[]{new SmsLogger(), new EmailLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer = new Customer(1,"Çisem","Akman");
        customerManager.add(customer);
    }
}
