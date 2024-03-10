package harc.oop;

public class Main {
    public static void main(String[] args) {
        ogrenci[] ogrenciler = {
                new ogrenci("null", "null", 1973, 1973104001, 0.0, 104, 1),
                new ogrenci("Gökhan", "bilgisayar mühendisliği", 1985, 1985104001, 0.0, 104, 1),
                new ogrenci("Ayşe", "makine mühendisliği", 1985, 1985104001, 0.0, 104,1),
                new ogrenci("Elif", "elektrik-elektronik mühendisliği", 2020, 2020104001, 1.98, 104,1)
        };

        String ogrenci1 = "null";
        ogrenci foundogrenci1 = null;
        for (ogrenci a : ogrenciler) {
            if (a.getAd().equals(ogrenci1)) {
                foundogrenci1 = a;
                break;
            }
        }if (foundogrenci1 == null) {
            throw new IllegalArgumentException("1. öğrenci bulunamadı");}

        String ogrenci2 = "Gökhan";
        ogrenci foundogrenci2 = null;
        for (ogrenci a : ogrenciler) {
            if (a.getAd().equals(ogrenci2)) {
                foundogrenci2 = a;
                break;
            }
        }if (foundogrenci2 == null) {
            throw new IllegalArgumentException("2.öğrenci bulunamadı");}

        String ogrenci3 = "Ayşe";
        ogrenci foundogrenci3= null;
        for (ogrenci a : ogrenciler) {
            if (a.getAd().equals(ogrenci3)) {
                foundogrenci3 = a;
                break;
            }
        }if (foundogrenci3 == null) {
            throw new IllegalArgumentException("3.öğrenci bulunamadı");}

        String ogrenci4 = "Elif";
        ogrenci foundogrenci4 = null;
        for (
                ogrenci a : ogrenciler) {
            if (a.getAd().equals(ogrenci4)) {
                foundogrenci4 = a;
                break;
            }
        }if (foundogrenci4 == null) {
            throw new IllegalArgumentException("4.öğrenci bulunamadı");}

        try {
            ogrenciler[0].ganoHesapla(foundogrenci1.getGano());
            ogrenciler[1].ganoHesapla(foundogrenci2.getGano());
            ogrenciler[2].ganoHesapla(foundogrenci3.getGano());
            ogrenciler[3].ganoHesapla(foundogrenci4.getGano());
            ogrenciler[0].ogrenciNoOlustur(foundogrenci1.getGirisyili(), foundogrenci1.getBolumkodu(), foundogrenci1.getGirisSirasi());
            ogrenciler[1].ogrenciNoOlustur(foundogrenci2.getGirisyili(), foundogrenci2.getBolumkodu(), foundogrenci2.getGirisSirasi());
            ogrenciler[2].ogrenciNoOlustur(foundogrenci3.getGirisyili(), foundogrenci3.getBolumkodu(), foundogrenci3.getGirisSirasi());
            ogrenciler[3].ogrenciNoOlustur(foundogrenci4.getGirisyili(), foundogrenci4.getBolumkodu(), foundogrenci4.getGirisSirasi());

        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
        System.out.println();
        System.out.println("Girilen GANO değerleri geçerli! :) ");
        System.out.println();
        System.out.println("ÖĞRENCİLERİN BİLGİLERİ:");
        System.out.println("OGR-1 : " + ogrenciler[0].getAd() + " " + ogrenciler[0].getBolum() + " " + ogrenciler[0].getOgrNo() + " " + ogrenciler[0].getGano());
        System.out.println("OGR-2 : " + ogrenciler[1].getAd() + " " + ogrenciler[1].getBolum() + " " + ogrenciler[1].getOgrNo() + " " + ogrenciler[1].getGano());
        System.out.println("OGR-3 : " + ogrenciler[2].getAd() + " " + ogrenciler[2].getBolum() + " " + ogrenciler[2].getOgrNo() + " " + ogrenciler[2].getGano());
        System.out.println("OGR-4 : " + ogrenciler[3].getAd() + " " + ogrenciler[3].getBolum() + " " + ogrenciler[3].getOgrNo() + " " + ogrenciler[3].getGano());
        System.out.println("1. öğrencinin ödeyeceği harç : "+ ogrenciler[0].harcHesapla(0,0));
        System.out.println("2. öğrencinin ödeyeceği harç : "+ ogrenciler[1].harcHesapla(0,0));
        System.out.println("3. öğrencinin ödeyeceği harç : " + ogrenciler[2].harcHesapla(4,1));
        System.out.println("4. öğrencinin ödeyeceği harç : " + ogrenciler[3].harcHesapla(8,2));
    }
}
