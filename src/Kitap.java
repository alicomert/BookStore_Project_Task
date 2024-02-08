
class Kitap {

    //TODO: int kitapNumarasi ve yayinYili; String kitapAdi ve yazarAd; double fiyat fieldlarini olusturun.
    // Oluşan her kitap nesnesinin yegane (unique) bir kitap numarası olmalıdır.

    private  int kitapNumarasi,yayinYili;
    private  String kitapAdi,yazarAd;
    private double fiyat;

    private static int sayac=1;

    public Kitap(int yayinYili, String kitapAdi, String yazarAd, double fiyat) {

        setYayinYili(yayinYili);
        setKitapAdi(kitapAdi);
        setYazarAd(yazarAd);
        setFiyat(fiyat);

        this.kitapNumarasi=sayac++;
    }


///////////////////////////////////////////////////////////////////////

    public Kitap(String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        //TODO: Kitap nesnesi oluşturma sırasında ilk çalışan metodu (constructor) olusturun
        //NOT: Her kitabın tekil bir kitap numarası (id) olduğunu unutmayınız...




    }

    // TODO: Gerekli olan getter() veya setter() metodlarını oluşturunuz.
    // Kullanılmayanları oluşturmanıza gerek yok.
    // Program tamamlandıktan sonra kullanılmayan metodları sonradan silmek de bir yöntemdir


    @Override
    public String toString() {
        return "Kitap{" +
                "kitapNumarasi=" + kitapNumarasi +
                ", yayinYili=" + yayinYili +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAd='" + yazarAd + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public int getKitapNumarasi() {
        return kitapNumarasi;
    }

    public void setKitapNumarasi(int kitapNumarasi) {
        this.kitapNumarasi = kitapNumarasi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAd() {
        return yazarAd;
    }

    public void setYazarAd(String yazarAd) {
        this.yazarAd = yazarAd;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
