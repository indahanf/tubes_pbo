
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
public class karyawan extends person{
    private String idKaryawan;
    private String jabatan;
    private double gaji;
    private String idManager;

    public karyawan(String idKaryawan, String jabatan, double gaji, String idManager, String nama, String JK, int umur) {
        super(nama, JK, umur);
        this.idKaryawan = idKaryawan;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.idManager = idManager;
    }

    

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public String getIdManager() {
        return idManager;
    }
    
    
}
