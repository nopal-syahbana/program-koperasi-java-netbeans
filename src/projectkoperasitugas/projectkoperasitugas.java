/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectkoperasitugas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/**
 *
 * @author naufal
 */
public class projectkoperasitugas {

    public static void main(String[] args) {

        barang produkmakanan = new barang(5, 12500, "12-29-2022", 15625, 75000 * 15 / 100, "Croffle Frozen");

        String tanggalKadaluarsa = produkmakanan.HitungKadaluarsa();
        System.out.println("ID barang : " + produkmakanan.idbarang);
        System.out.println("Tanggal Sekarang : 9-29-2022 ");
        System.out.println("Tanggal Kadaluarsa Barang : " + produkmakanan.kadaluarsa);
        System.out.println("Tanggal kadaluarsa barang ini adalah : " + tanggalKadaluarsa);
        System.out.println("==============================================");
        int hasilbeli = produkmakanan.HitungBeli(5);
        System.out.println("Harga Beli Barang : " + produkmakanan.beli);
        System.out.println("Harga Jual Barang + 25% : " + hasilbeli);
        System.out.println("==============================================");
        int total = produkmakanan.HitungJual(5);
        System.out.println("Harga Jual Barang : " + produkmakanan.jual);
        System.out.println("Jumlah Barang : 5");
        System.out.println("Total Harga : " + total);

        int hasilSetelahDiskon = produkmakanan.HitungJualDiskon(total);
        System.out.println("Total harga setelah diskon 15% : " + hasilSetelahDiskon);

        System.out.println("================================================");
        supplier anyar = new supplier("Azzam Bakery", "Bungah", "sp-001", "Croffle Frozen");
        System.out.println("Nama Supplier: " + anyar.namasupplier + "\n" + "ID Supplier : " + anyar.idsupplier);
        anyar.UbahNamaSupplier("Azzam Coffe");
        System.out.println("Nama Supplier setelah diubah : " + anyar.namasupplier + "\n" + "ID Supplier : " + anyar.idsupplier);
        System.out.println("Lokasi Suplier: " + anyar.alamat);
        anyar.UbahAlamatSupplier("Gresik Kota");
        System.out.println("lokasi supplier setelah diganti : " + anyar.alamat);
        System.out.println("================================================");

        koperasi sukses = new koperasi("Gudang Barat ", "Gudang Timur ", 57, 20);
        System.out.println("Gudang Koperasi : " + sukses.gudang1 + "dengan transaksi sebanyak " + sukses.daftartransaksi1 + "-kali Transasi");
        System.out.println("Gudang Koperasi : " + sukses.gudang2 + "dengan transaksi sebanyak " + sukses.daftartransaksi2 + "-kali Transasi");
        System.out.println("Hasil setelah diubah : ");
        int modtransaksi = sukses.ModifikasiTransaksigudang1(100);
        System.out.println("Gudang Koperasi : " + sukses.gudang1 + "dengan transaksi sebanyak " + modtransaksi + "-kali Transasi");

        System.out.println("================================================");
        pembeli pembeli = new pembeli("001", "Azzam Akhiratuddin");
        System.out.println("Pembeli : " + pembeli.namapembeli + " | ID Pembeli : " + pembeli.idpembeli);
        String namabaru = pembeli.modifikasiNamaPembeli("Maulana Efendi");
        String idbaru = pembeli.modifikasiIdPembeli("050");
        System.out.println("Pembeli yang telah dimodifikasi : " + namabaru + " | ID Pembeli : " + idbaru);

        System.out.println("================================================");
        ArrayList<barang> daftar = new ArrayList<>(Arrays.asList(produkmakanan));
        ArrayList<Integer> jumlah = new ArrayList<>(Arrays.asList(2));
        stokbarang daftarStockBarang = new stokbarang(daftar, jumlah);

        barang produkminuman = new barang(20, 5000, "11-18-2022", 20000, 10000, "Floridina");
        daftarStockBarang.tambah(produkminuman);
        System.out.println("List Barang setelah Penambahan : ");
        System.out.println("Kelompok Barang : Produk Makanan" + "\n" + "dengan id : " + produkmakanan.idbarang);
        System.out.println("Kelompok Barang : Produk Minuman" + "\n" + "dengan id : " + produkminuman.idbarang);
        System.out.println("List Barang Setelah Pengurangan : ");
        daftarStockBarang.kurang(1);
        System.out.println("Kelompok Barang : Produk Makanan" + "\n" + "dengan id : " + produkmakanan.idbarang);

        System.out.println("================================================");
        gudang gudang = new gudang(daftarStockBarang, "Maju Jaya", "Sinar Benderang");
        barang produkkesehatan = new barang(150, 500, "11-29-2022", 10000, 1000, "Bodrex");
        gudang.modifikasiStockBarang(produkkesehatan);
        System.out.println("List Barang Setelah dimodifikasi : ");
        System.out.println("Kelompok Barang : Produk Kesehatan" + "\n" + "dengan id : " + produkkesehatan.idbarang);
        System.out.println("Set Koperasi : ");
        System.out.println(gudang.namakoperasi1);
        System.out.println("Set Koperasi Baru : ");
        System.out.println(gudang.namakoperasi2);
        System.out.println("================================================");
        ArrayList<String> penjualan = new ArrayList<>(Arrays.asList("Croffle Frozen", "Floridina", "Bodrex"));
        ArrayList<String> pembelian = new ArrayList<>(Arrays.asList("Risoles Frozen", "Minute Maid", "Promag"));
        transaksi daftarTransaksi = new transaksi(penjualan, pembelian);
        System.out.println("Data Penjualan Awal : ");
        System.out.println(penjualan);
        System.out.println("Data Pembelian Awal : ");
        System.out.println(pembelian);

        daftarTransaksi.tambahDataPembelian("Kebab Frozen");
        daftarTransaksi.tambahDataPenjualan("Kebab Frozen Pedas");
        System.out.println("Data Penjualan setelah Penambahan : ");
        System.out.println(daftarTransaksi.penjualan);
        System.out.println("Data Pembelian setelah Penambahan : ");
        System.out.println(daftarTransaksi.pembelian);
    }
}

class barang {

    int jumlah;
    int beli;
    String kadaluarsa;
    int jual;
    String idbarang;
    int diskon;

    public barang(int jumlah, int beli, String kadaluarsa, int jual, int diskon, String idbarang) {
        this.jumlah = jumlah;
        this.diskon = diskon;
        this.beli = beli;
        this.kadaluarsa = kadaluarsa;
        this.jual = jual;
        this.idbarang = idbarang;
        this.diskon = diskon;
    }

    public String HitungKadaluarsa() {
        long days_difference = 0;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
            Date current = new Date();
            Date now = formatter.parse(formatter.format(current));
            Date barang = formatter.parse(this.kadaluarsa);

            long time_difference = barang.getTime() - now.getTime();
            days_difference = (time_difference / (1000 * 60 * 60 * 24)) % 365;

        } catch (ParseException e) {
        }

        return days_difference + " hari";
    }

    public int HitungBeli(int jumlahBarangYangDibeli) {
        return this.beli + beli * 25 / 100;
    }

    public int HitungJual(int jumlahBarangYangDibeli) {
        return this.jual * jumlahBarangYangDibeli;
    }

    public int HitungJualDiskon(int totalHargaBeli) {
        return totalHargaBeli - this.diskon;
    }
}

class supplier {

    String namasupplier;
    String idsupplier;
    String alamat;
    String jenisbarang;

    public supplier(String namasupplier, String alamat, String idsupplier, String jenisbarang) {
        this.namasupplier = namasupplier;
        this.alamat = alamat;
        this.idsupplier = idsupplier;
        this.jenisbarang = jenisbarang;
    }

    public void UbahNamaSupplier(String namaSupplierBaru) {
        this.namasupplier = namaSupplierBaru;
    }

    public void UbahAlamatSupplier(String AlamatSupplierBaru) {
        this.alamat = AlamatSupplierBaru;
    }
}

class koperasi {

    String gudang1;
    String gudang2;
    int daftartransaksi1;
    int daftartransaksi2;

    public koperasi(String gudang1, String gudang2, int daftartransaksi1, int daftartransaksi2) {
        this.gudang1 = gudang1;
        this.gudang2 = gudang2;
        this.daftartransaksi1 = daftartransaksi1;
        this.daftartransaksi2 = daftartransaksi2;
    }

    public int ModifikasiTransaksigudang1(int modgudang1) {
        this.daftartransaksi1 = modgudang1;
        return modgudang1;
    }

    public int ModifikasiTransaksigudang2(int modgudang2) {
        this.daftartransaksi2 = modgudang2;
        return modgudang2;
    }
}

class pembeli {

    String idpembeli;
    String namapembeli;

    public pembeli(String idpembeli, String namapembeli) {
        this.idpembeli = idpembeli;
        this.namapembeli = namapembeli;
    }

    public String modifikasiNamaPembeli(String namaPembeliBaru) {
        this.namapembeli = namaPembeliBaru;
        return namaPembeliBaru;
    }

    public String modifikasiIdPembeli(String idpembelibaru) {
        this.idpembeli = idpembelibaru;
        return idpembelibaru;
    }
}

class stokbarang {

    ArrayList<barang> daftar;
    ArrayList<Integer> jumlah;

    public stokbarang(ArrayList<barang> daftar, ArrayList<Integer> jumlah) {
        this.daftar = daftar;
        this.jumlah = jumlah;
    }

    public void tambah(barang barangbaru) {
        this.daftar.add(barangbaru);
    }

    public void kurang(int index) {
        this.daftar.remove(index);
    }
}

class gudang {

    stokbarang daftarStockBarang;
    String namakoperasi1;
    String namakoperasi2;

    public gudang(stokbarang daftarStockBarang, String namakoperasi1, String namakoperasi2) {
        this.daftarStockBarang = daftarStockBarang;
        this.namakoperasi1 = namakoperasi1;
        this.namakoperasi2 = namakoperasi2;
    }

    public void modifikasiStockBarang(barang tambahBarangbaru) {
        this.daftarStockBarang.tambah(tambahBarangbaru);
    }

    public void setKoperasi(String namakoperasi) {
        this.namakoperasi1 = namakoperasi2;
    }

}

class transaksi {

    ArrayList<String> penjualan;
    ArrayList<String> pembelian;

    public transaksi(ArrayList<String> penjualan, ArrayList<String> pembelian) {
        this.penjualan = penjualan;
        this.pembelian = pembelian;
    }

    public void tambahDataPenjualan(String dataPenjualanBaru) {
        this.penjualan.add(dataPenjualanBaru);
    }

    public void tambahDataPembelian(String dataPembelianBaru) {
        this.pembelian.add(dataPembelianBaru);
    }
}
