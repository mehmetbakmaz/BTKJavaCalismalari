public class Main {
    public static void main(String[] args) {
      String mesaj="Bugün hava çok güzel";
      String yeniMesaj=mesaj.substring(0,2);
      System.out.println(yeniMesaj);
      String yeniMesaj2=sehirVer();
      int sayi = topla(5,9);
      System.out.println(sayi);
        System.out.println(yeniMesaj2);
     int toplam= topla2(1,2,4,5,52,4,124,1245,5,212,3,124321,4);
        System.out.println(toplam);


    }
    public static void  ekle (){
     System.out.println("Eklendi.");
    }
    public static void cikar(){
        System.out.println("Çıkartıldı.");
    }
    public static void guncelle(){
        System.out.println("güncellendi.");
    }
    public static int topla(int sayi1 , int sayi2){
        return  sayi1+sayi2;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }


        return toplam;
    }
}