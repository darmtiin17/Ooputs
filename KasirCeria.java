
public class KasirCeria {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Buku", 15000, 10);
        Produk produk2 = new Produk("Pensil", 5000, 20);

        Transaksi transaksi = new Transaksi();
        transaksi.tambahkanProduk(produk1, 2);
        transaksi.tambahkanProduk(produk2, 3);
        transaksi.cetakStruk();
    }
}
