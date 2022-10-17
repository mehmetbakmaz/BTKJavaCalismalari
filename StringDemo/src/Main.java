public class Main {
    public static void main(String[] args) {
     String mesaj="Bugün hava çok güzel.";
     System.out.println(mesaj);
     /*System.out.println("Eleman sayısı=" +mesaj.length());
     System.out.println("5. Eleman="+mesaj.charAt(4));
     System.out.println(mesaj.concat(" Yaşasın."));
     System.out.println(mesaj.startsWith("T"));
     System.out.println(mesaj.endsWith("."));
     char[] karakterler = new char[5];
     mesaj.getChars(0,3,karakterler ,1);
     System.out.println(karakterler);
     System.out.println(mesaj.indexOf("v"));
     System.out.println(mesaj.lastIndexOf("v"));
     //Lastindexof aramaya sağdan başlar ama soldan yazar.*/
     String yeniMesaj= mesaj.replace(' ','-');
     System.out.println(yeniMesaj);
     System.out.println(mesaj.substring(2,7));
     //2den başla 7ye kadar 7 dahil değildir
     for (String kelime: mesaj.split(" ")) {
      System.out.println(kelime);
     }

     System.out.println(mesaj.toLowerCase());
     System.out.println(mesaj.toUpperCase());
     System.out.println(mesaj.trim());
     //bildiğimiz budama yöntemi başında ve sonunda olan boşlukları yoksayar

    }
}