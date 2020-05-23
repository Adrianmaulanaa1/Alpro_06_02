package ch02;

public class ObjectPegawai {
    public static void main(String[] args) {
        Pegawai pgwi1 = new Pegawai ();
        Pegawai pgwi2 = new Pegawai ();
  
        pgwi1.nik = "12123";
        pgwi1.nama = "Kahar";
        pgwi1.jabatan = "Staff";
        pgwi1.isAktif = true;

        pgwi2.nik = "12124";
        pgwi2.nama = "Citra";
        pgwi2.jabatan = "Administrasi";
        pgwi2.isAktif = true;
        
        pgwi1.cetak();
        System.out.println("==========");
        pgwi2.cetak();
    }
}