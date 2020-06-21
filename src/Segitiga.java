public class Segitiga {
    int alas, tinggi, sisimiring;
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setSisimiring(int sisimiring) {
        this.sisimiring = sisimiring;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public static void getJenis(int alas, int tinggi, int sisimiring) {
        if (alas == sisimiring) {
            System.out.println("Segitiga Sama Sisi");
        } else if (sisimiring == Math.sqrt(alas * alas + tinggi * tinggi)) {
            System.out.println("Segitiga Siku Siku");
        } else if (Math.sqrt((alas / 2) * (alas / 2) + (tinggi * tinggi)) == sisimiring) {
            System.out.println("Segitiga Sama kaki");
        } else {
            System.out.println("segitiga anda ngawur");
        }
    }
    public double getLuas() {
        return (alas * tinggi) / 2;
    }
    public double getKel() {
        if (alas == sisimiring) {
            return alas + alas + alas;
        } else if (sisimiring == Math.sqrt(alas * alas + tinggi * tinggi)) {
            return alas + tinggi + sisimiring;
        } else if (Math.sqrt((alas / 2) * (alas / 2) + (tinggi * tinggi)) == sisimiring) {
            return alas + sisimiring + sisimiring;
        }
        return 0;
    }
}
