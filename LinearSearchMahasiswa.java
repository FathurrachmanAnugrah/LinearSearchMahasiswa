public class LinearSearchMahasiswa {
    public static void main(String[] args) {

        // Data mahasiswa
        String[] nim = {
            "231001", "231002", "231003", "231004", "231005"
        };

        String[] nama = {
            "Andi", "Budi", "Citra", "Dewi", "Eko"
        };

        // Nama yang dicari (contoh)
        String cari = "Citra";

        boolean ditemukan = false;
        int indeks = -1;
        int perbandingan = 0;

        // Proses Linear Search
        for (int i = 0; i < nama.length; i++) {
            perbandingan++;
            if (nama[i].equals(cari)) {
                ditemukan = true;
                indeks = i;
                break;
            }
        }

        // Hasil pencarian
        System.out.println("Nama yang dicari   : " + cari);

        if (ditemukan) {
            System.out.println("Status             : Data ditemukan");
            System.out.println("NIM                : " + nim[indeks]);
            System.out.println("Nama               : " + nama[indeks]);
            System.out.println("Posisi Indeks      : " + indeks);
        } else {
            System.out.println("Status             : Data tidak ditemukan");
        }

        System.out.println("Jumlah Perbandingan: " + perbandingan);
    }
}
