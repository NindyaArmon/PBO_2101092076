/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerB_2101092076;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class HutangDaoImpl implements HutangDao{
    private List<Hutang> data = new ArrayList<>();
    
    public HutangDaoImpl()
    {
        data.add(new Hutang("212121","12 Januari 2009","Yusuf Mathew",120000));
        data.add(new Hutang("222222","30 Maret 2013","Rian Saputra",250000));
        data.add(new Hutang("232323","20 Desember 2022","Rina Yuliana",70000));
    }
    
    public Hutang save(Hutang hutang) {
        data.add(hutang);
        return hutang;
    }
    
    public Hutang update(int index, Hutang hutang) {
        data.set(index, hutang);
        return hutang;
    }

    public void delete(int index) {
        data.remove(index);
    }

    public Hutang getHutang(int index) {
        return data.get(index);
    }

    public List<Hutang> getAllHutang() {
        return data;
    }
}
