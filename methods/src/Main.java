public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();


    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 3, 4, 5, 6, 7, 8, 17};
        int aranacak = 5;
        boolean varMi = false;


        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer(aranacak);
        } else {
            System.out.println("Sayı mevcut değildir");
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("Sayı mevcuttur");

    }
}