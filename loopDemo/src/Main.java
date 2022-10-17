public class Main {
    public static void main(String[] args) {
        //for
        for(int i=1;i<=13;i+=3)
        {
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
        //while
        int i =1;
        while( i<14){
            System.out.println(i);
            i+=3;

        }
        System.out.println("While döngüsü bitti");
        //do while
        int j=1;
        do{
            System.out.println(j);
            j+=3;
        }
        while(j<14);
        System.out.println("Do whiile döngüsü bitti");
    }
}