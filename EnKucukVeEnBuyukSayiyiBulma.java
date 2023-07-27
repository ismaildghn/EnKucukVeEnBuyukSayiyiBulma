import java.util.Scanner;
public class EnKucukVeEnBuyukSayiyiBulma {
    public static void main(String[] args) {
        int n, sayi = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner imp = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = imp.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayi = imp.nextInt();

            if (sayi > max) {
                max = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
            System.out.println("En büyük sayı : " + max);
            System.out.println("En küçük sayı : " + min);
    }
}
