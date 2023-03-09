/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_b.model;

import java.util.List;

/**
 *
 * @author hp
 */
public interface WarnetDao {
    Warnet save (Warnet warnet);
        WarnetDao update(int index, Warnet warnet);
        void delete (int index);
        Warnet getWarnet (int index);
        List<Warnet> getAllWarnet();
}
