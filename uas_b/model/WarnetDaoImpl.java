/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_b.model;

/**
 *
 * @author hp
 */
import java.util.List;
import java.util.ArrayList;


public class WarnetDaoImpl implements WarnetDao{
    
    private List<Warnet> data = new ArrayList<>();
    
    public WarnetDaoImpl()
    {
        data.add(new Warnet("B101","12 januari 2022","Ali", "12.30", "13.30","1","2000","0,5%","1500"));
        data.add(new Warnet("B102","12 januari 2022","Budi", "12.30", "13.30","1","2000","0,5%","1500"));
        data.add(new Warnet("B101","12 januari 2022","Toni", "12.30", "13.30","1","2000","0,5%","1500"));
    }

    public WarnetDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Warnet save(Warnet warnet) {
        data.add(warnet);
        return warnet;
    }
 
    @Override
    public Warnet update(int index, Warnet warnet) {
        data.set(index, warnet);
        return warnet;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Warnet getWarnet(int index) {
        return data.get(index);
    }

    @Override
    public List<Warnet> getAllWarnet() {
        return data;
    }
}
