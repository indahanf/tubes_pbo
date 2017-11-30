
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
public class manager extends person {
    private String idManager;
    private double gaji;
    private String username;
    private String pass;

    public manager(String idManager, double gaji, String username, String pass, String nama, String JK, int umur) {
        super(nama, JK, umur);
        this.idManager = idManager;
        this.gaji = gaji;
        this.username = username;
        this.pass = pass;
    }

    

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getIdManager() {
        return idManager;
    }
    

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }
    
    
}
