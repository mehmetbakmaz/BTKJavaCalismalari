public class Main {
    public static void main(String[] args) {
        //reference type
     CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2 ;
     customerManager.add();
     customerManager.remove();
     customerManager.update();
     int sayi1=10;
     int sayi2=20;
     sayi2=sayi1;
     sayi1=30;
     System.out.println(sayi2);
     //sayi2 eşittir sayi1'e ;  sayi2=sayi1 yani sayi2 artık sayi 1 olmuş oluyor.
        int sayilar1 [] =new int [] {1,2,5,6,4,2};
        int sayilar2 [] =new int [] {12,4,2,7,41,1};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
        //diziler referans tiptir önemli unutma! Stack ve heap mantığını unutma.


    }
}