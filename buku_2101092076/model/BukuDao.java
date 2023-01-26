/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_2101092076.model;

import java.util.List;

/**
 *
 * @author hp
 */
public interface BukuDao {
    Buku save (Buku anggota);
    Buku update(int index, Buku buku);
    void delete (int index);
    Buku getBuku(int index);
    List<Buku> getAllBuku();
}
