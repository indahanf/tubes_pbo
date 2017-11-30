
import java.sql.Date;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TOSHIBA
 */
public class transaksi {
    private Date hariTanggal;
    private penumpang dataPenumpang;
    private jadwal dataPerjalanan;
    private karyawan karyawan;

    public transaksi(Date hariTanggal, penumpang dataPenumpang, jadwal dataPerjalanan, karyawan karyawan) {
        this.hariTanggal = hariTanggal;
        this.dataPenumpang = dataPenumpang;
        this.dataPerjalanan = dataPerjalanan;
        this.karyawan = karyawan;
    }

    public karyawan getKaryawan() {
        return karyawan;
    }
    
    
    
    public void setHariTanggal(Date hariTanggal) {
        this.hariTanggal = hariTanggal;
    }

    public Date getHariTanggal() {
        return hariTanggal;
    }

    
    public penumpang getDataPenumpang() {
        return dataPenumpang;
    }

    public jadwal getDataPerjalanan() {
        return dataPerjalanan;
    }
    
    

}
