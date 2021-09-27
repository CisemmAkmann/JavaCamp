public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        
        this.loggers = loggers;
    }

    //loosly - tightly coupled

    public void add(Customer customer){
        System.out.println("Müşteri Eklendi " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
        }



    public void delete(Customer customer){
        System.out.println("Müşteri Silindi " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());ç
    }
}
