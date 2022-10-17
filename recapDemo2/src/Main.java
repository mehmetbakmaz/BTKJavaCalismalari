public class Main {
    public static void main(String[] args) {
        double[] Mylist = {1.2, 1.7, 3.9, 7.2};
        double total = 0;
        double max = Mylist[0];
        for (double number : Mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam=" + total);
        System.out.println("En büyük sayı=" + max);
    }
}