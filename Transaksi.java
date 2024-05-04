
class Transaksi {
    private List<Produk> daftarProduk;
    private double totalHarga;

    public Transaksi() {
        daftarProduk = new ArrayList<>();
        totalHarga = 0;
    }

    public void tambahkanProduk(Produk produk, int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            daftarProduk.add(produk);
            totalHarga += produk.getHarga();
            produk.kurangiStok(1);
        }
    }

    public void hapusProduk(Produk produk) {
        if (daftarProduk.contains(produk)) {
            daftarProduk.remove(produk);
            totalHarga -= produk.getHarga();
            produk.kurangiStok(-1);
        }
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void cetakStruk() {
        System.out.println("======= Struk Pembelian =======");
        for (Produk produk : daftarProduk) {
            System.out.println(produk.getNama() + "\tRp " + produk.getHarga());
        }
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("===============================");
    }
}
