public class Product {

    //constructor,new yaptığında çalışır
    public Product(){
            System.out.println("Ben Çalıştım");
    }
    public Product(int id,String name,double unitPrice,String detail){
        this(); // bu classın parametresiz olanını çalıştır.
        this.id = id;
        this.name= name;
        this.unitPrice = unitPrice;
        this.detail = detail;

    }

    int id;
    String name;
    double unitPrice;
    String detail;

}
