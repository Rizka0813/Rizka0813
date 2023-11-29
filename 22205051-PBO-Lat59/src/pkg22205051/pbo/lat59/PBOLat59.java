package pkg22205051.pbo.lat59;

/**
 * Nama        : Rizka Yuniarti 
 * Prodi       : Teknik Informatika 
 * Semester    : 3 
 * Mata kuliah : PBO
 */
class Karakter {

    private String nama;
    private String peran;

    public Karakter(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }
}

class KarakterUtama extends Karakter {

    private String tim;

    public KarakterUtama(String nama, String peran, String tim) {
        super(nama, peran);
        this.tim = tim;
    }

    public String getTim() {
        return tim;
    }

    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peran: " + getPeran());
        System.out.println("Tim: " + getTim() + "\n");
    }

}

class KarakterPendukung extends Karakter {

    private String hubungan;

    public KarakterPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilKarakterPendukung() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peranan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
        System.out.println("");
    }

}

public class PBOLat59 {

    public static void main(String[] args) {
        KarakterUtama conan = new KarakterUtama("Shinichi Kudo/Conan Edogawa",
                "Detektif", "Detektif Cilik");
        conan.tampilKarakterUtama();

        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ketua klub karate",
                "Tidak bergabung dengan tim, tetapi sering membantu tim detektif cilik");
        ran.tampilKarakterUtama();

        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta",
        "Detektif Cilik");
        kogoro.tampilKarakterUtama();

        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki",
                "remaja perempuan biasa yang centil dan suka mencari perhatian remaja laki-laki yang menarik",
                "Sahabat Ran");
        sonoko.tampilKarakterPendukung();

        KarakterPendukung genta = new KarakterPendukung("Genta Kojima",
                "pendiri Grup Detektif Cilik", "teman dari Shinichi Kudo/Conan Edogawa");
        genta.tampilKarakterPendukung();

        KarakterPendukung mitsuhiko = new KarakterPendukung("Mitsuhiko Tsuburaya",
                "Seorang anggota Grup Detektif Cilik", "Teman dari Shinichi Kudo");
        mitsuhiko.tampilKarakterPendukung();

        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki",
                "Seorang pengacara (Ratu Pengacara)", "Ibu dari Ran Mouri");
        eri.tampilKarakterPendukung();

        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Toyama",
                "Ahli alkido", "Teman dekat dengan Ran Mouri");
        kazuha.tampilKarakterPendukung();

        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori",
                "Ahli menyelidiki kasus dan petarung kendo",
                "Teman dekat dengan Conan Edogawa/ Shinich");
        heiji.tampilKarakterPendukung();

        KarakterPendukung ai = new KarakterPendukung("Ai Haibara",
                "Seorang anggota Organisasi Berbaju Hitam yang berkhianat",
                "Teman dari Conan Edogawa");
        ai.tampilKarakterPendukung();
        
        KarakterPendukung hiroshi = new KarakterPendukung("Hiroshi Agasa",
                "Seorang profesor linglung yang menemukan beberapa perangkat untuk membantu Conan",
                "Dia sering membantu Grup Detektif");
        hiroshi.tampilKarakterPendukung();
        
        KarakterPendukung ayumi = new KarakterPendukung("Ayumi Yoshida",
                "anggota Grup Detektif Cilik", "teman Conan");
        ayumi.tampilKarakterPendukung();

    }
}