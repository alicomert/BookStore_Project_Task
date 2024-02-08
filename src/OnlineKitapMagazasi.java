import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {

    private Scanner readInt = new Scanner(System.in);
    private Scanner readStr= new Scanner(System.in);
    private Scanner radDbl=new Scanner(System.in);
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void kitapEkle() {
        // TODO: kitapEkle() methodunu doldurunuz
        // Kullanıcıdan Kitap Adı, Yazar Adı, Yayın Yılı (int) ve Fiyat (double) bilgisini alarak,
        // itapListesine ekleyen metodu yazınız.
        // NOT: Kullanıcıdan aldığınız bilgilerle bir kitap nesnesi oluşturmayı unutmayınız.

        System.out.print("Kitap adı giriniz: ");
        String kitapAdi=readStr.nextLine();
        System.out.print("Yazar Adını Giririniz: ");
        String yazarAdi=readStr.nextLine();
        System.out.print("Yayın Yılı  Giririniz: ");
        int yayinYili=readInt.nextInt();
        System.out.print("Kitap Fiyatı Giririniz: ");
        double fiyat=radDbl.nextDouble();

        Kitap kitap1=new Kitap(yayinYili,kitapAdi,yazarAdi,fiyat);

        kitapListesi.add(kitap1);

    }
    //////////////////////////////////////////////////
    public void kitapSil() {

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");

        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...




    }
//////////////////////////////////////////////////
    public void kitapListele() {
        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.




    }
}
