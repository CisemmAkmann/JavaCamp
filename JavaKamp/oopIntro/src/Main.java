public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram",10); //referans oluşturma,instance

        Product product2 = new Product(2,"Lenovo V15",16000,"32 GB Ram",7);


       Product product3 = new Product();
       product3.setId(3);
       product3.setName("Lenovo v15");
       product3.setDetail("16 gb Ram");
       product3.setDiscount(10);
       product3.setUnitPrice(16000);

       System.out.println(product3.getUnitPriceAfterDiscount());

        Category category1 = new Category(1, "Bilgisayar");

        Category category2 = new Category();
        category2.setId(2);
        category2.set("Ev/Bahçe");

        System.out.println(category1.getName());
        System.out.println(category2.getName());




    }
}
