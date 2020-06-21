import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Segitiga baru = new Segitiga();
        System.out.print("Masukkan alas : ");
        int alas = in.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = in.nextInt();
        System.out.print("Masukkan sisi miring : ");
        int miring = in.nextInt();
        baru.getJenis(alas, tinggi, miring);
        baru.setAlas(alas);
        baru.setSisimiring(miring);
        baru.setTinggi(tinggi);
        System.out.println("Keliling : " + baru.getKel());
        System.out.println("Luas : " + baru.getLuas());
    }
}
