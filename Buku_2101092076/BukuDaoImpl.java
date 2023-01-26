/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buku_2101092076;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class BukuDaoImpl implements BukuDao{
    private List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl()
    {
        data.add(new Buku("A01","Malin Kundang","Yusuf Mathew","Surya Cipta"));
        data.add(new Buku("A02","Sains Komputer","Wisnuyana","Gramedia"));
        data.add(new Buku("A03","Cara Cepat Perkalian","Yusuf Mathew","Surya Cipta"));
    }
    
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    public Buku update(int index, Buku buku) {
        data.set(index,buku);
        return buku;
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Buku getBuku(int index) {
        return data.get(index);
    }

    public List<Buku> getAllBuku() {
        return data;
    }
    
}
