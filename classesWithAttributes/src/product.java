public class product {


    public product(int id,String name,String description,double price ,int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
        this.renk=renk;
    }
public product(){

}

    //attribute and fields
    private int id;
    private String name;
     private String description;
     private double price;
     private int stockAmount;
     private String renk;
     private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod = this.name.substring(0,1)+this.id;
    }

}

