package nindy021222;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BukuAlamat 
{
    private String name; 
    private String address; 
    private String notelp; 
    private String email; 
    //area penulisan kode selanjutnya 
    
    
    public BukuAlamat(){ 
        
    }
    
    public BukuAlamat(String temp){
        this.name = temp;
    }
    
    public BukuAlamat(String name, String address, String notelp, String email){
        this.name = name;
        this.address = address;
        this.notelp = notelp;
        this.email = email;
    }
    
    //Nama
    public String getName(){ 
        return name; 
    }
     
    //Alamat
    public String getAddress(){ 
        return address; 
    }
     
    //No Telepon
    public String getNotelp(){ 
        return notelp; 
    }
    
    //Email
    public String getEmail(){ 
        return email; 
    }
    
}
