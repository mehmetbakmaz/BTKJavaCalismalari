public class Main {
    public static void main(String[] args) {
        char harf ='R';

        switch (harf){
            case 'T':
            case'Y':
            case'I':
            case'E':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Kalın sesli harf");
        }

    }
}