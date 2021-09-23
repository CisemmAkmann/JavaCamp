public class Main {

    public static void main(String[] args) {
	   IndividualCustomer individualCustomer1 = new IndividualCustomer();
       individualCustomer1.customerNumber = "12345";
       CorporateCustomer corporateCustomer1 = new CorporateCustomer();
       corporateCustomer1.customerNumber = "78945";

       SendikaCustomer sendikaCustomer = new SendikaCustomer();
       sendikaCustomer.customerNumber ="99999";

       CustomerManager customerManager = new CustomerManager();
       Customer[] customers = {individualCustomer1,corporateCustomer1,sendikaCustomer};

       customerManager.addMultiple(customers);





    }
}
