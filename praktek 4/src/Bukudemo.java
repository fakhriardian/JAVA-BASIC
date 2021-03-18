class Buku{
    String Judul, Pengarang, Penerbit;
    int Tahun;
    public Buku(String Judul, String Pengarang, String Penerbit, int Tahun){
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }
    public void cetakBuku(){
        System.out.println(Judul+","+Pengarang+","+Penerbit+","+Tahun);
    }
}

public class Bukudemo {
    public static void main(String[] args) {
        Buku book = new Buku("Pemprograman Berbasis Objek dengan Java","Indrahjani","Elexmedia Komputindo",2007);
        Buku book2 = new Buku("Dasar Pemprograman Java","Abdul Kadir","Andi Offset",2004);
        book.cetakBuku();
        book2.cetakBuku();
    }
}
