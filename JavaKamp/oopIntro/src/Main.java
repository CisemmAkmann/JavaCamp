public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram"); //referans oluşturma,instance

        Product product2 = new Product(2,"Lenovo V15",16000,"32 GB Ram");


        Product product3 = new Product();
        product3.id = 3;
        product3.name ="Hp 5";
        product3.unitPrice = 10000;
        product3.detail = "8 GB Ram";

        Product[] products = {product1,product2,product3};

        for (Product product: products
             ) {
            System.out.println(product.name);
        }

        //System.out.println(products.length);

        Category category1 = new Category(1,"Bilgisayar");

        Category category2 = new Category(2,"Ev/Bahçe");


        Category[] categories = {category1,category2};

        for (Category category:categories
             ) {
            System.out.println(category.name);
        }

        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);





    }
}
