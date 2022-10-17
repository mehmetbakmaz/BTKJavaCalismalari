public class Main {
    public static void main(String[] args) {
        product product1=new product(1,"Laptop","Apple laptop",200.9,14,"siyah");
        product product=new product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Apple laptop");
        product.setStockAmount(14);
        product.setPrice(200.9);
    productManager productManager=new productManager();
    productManager.Add(product);

        System.out.println(product.getKod());


    }
}