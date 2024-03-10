package harc.oop;

public class ogrenci {private String ad;
    private String bolum;
    private int girisyili;
    private int ogrNo;
    private double gano;
    private int bolumkodu;
    private int girisSirasi;

    public ogrenci(String ad, String bolum, int girisyili, int ogrNo, double gano, int bolumkodu, int girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisyili = girisyili;
        this.ogrNo = ogrNo;
        this.gano = gano;
        this.bolumkodu = bolumkodu;
        this.girisSirasi = girisSirasi;
    }
    public ogrenci(String ad, String bolum) {
        this(ad, bolum, 0, 0, 0.0, 0, 0);
        this.ad = ad;
        this.bolum = bolum;
    }
    public ogrenci() {
    }
    public String ogrenciNoOlustur(int girisyili, int bolumkodu, int girisSirasi) {
        String ogrNumarasi = (String.valueOf(girisyili) + String.valueOf(bolumkodu) + "00" +String.valueOf(girisSirasi));;
        if (Integer.parseInt(ogrNumarasi) != getOgrNo()){
            System.out.println(ogrNumarasi);
            System.out.println(getOgrNo());
            throw new IllegalArgumentException("Öğrenci numarası hatalı!!!");}
        return ogrNumarasi;
    }
    public void ganoHesapla(double aralık) {
        if (gano < 0.0 || gano > 4.0) {
            throw new IllegalArgumentException("Geçersiz GANO ! Lütfen doğru bir GANO aralığı giriniz! ");
        }
    }
    public double harcHesapla(int dersSayisi) {
        double dersHarci = 1000; // Ders başına harç oranı varsayılan olarak 1000 TL olsun
        double toplamHarc = dersSayisi * dersHarci;
        return toplamHarc;
    }

    public double harcHesapla(int dersSayisi, int uzatilanYil) {
        double dersHarci = 60.0; // ders başına harç ücreti 60 TL olsun
        double toplamHarc = dersSayisi * dersHarci; // uzatılan her yıl için 240 TL
        double yilHarci = uzatilanYil * 240.0;
        toplamHarc += yilHarci;

        return toplamHarc;
    }

    public String getAd() {
        return ad;
    }
    public String getBolum() {
        return bolum;
    }
    public int getGirisyili() {
        return girisyili;
    }
    public int getOgrNo() {
        return ogrNo;
    }
    public double getGano() {
        return gano;
    }
    public int getBolumkodu() {
        return bolumkodu;
    }
    public int getGirisSirasi() {
        return girisSirasi;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }
    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }
    public void setGano(double gano) {
        this.gano = gano;
    }
    public void setBolumkodu(int bolumkodu) {
        this.bolumkodu = bolumkodu;
    }
    public void setGirisSirasi(int girisSirasi) {
        this.girisSirasi = girisSirasi;
    }
}
