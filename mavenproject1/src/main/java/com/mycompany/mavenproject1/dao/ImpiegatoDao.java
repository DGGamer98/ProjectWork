/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.model.Impiegato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgatta
 */
public class ImpiegatoDao {

    List<Impiegato> listImpiegato = new ArrayList();
    
    
    //Inserisci impiegati
    public void Impiegatoinsert(Impiegato i) {
        listImpiegato.add(i);
        System.out.println("[LOG] impiegato inserito");
    }

    //Cerca tramite codice fiscale
    public Impiegato searchCodiceFiscale(String codicefiscale) {
        for (Impiegato impiegato : listImpiegato) {
            if (impiegato.getCodiceFiscale().equals(codicefiscale)) {
                return impiegato;
            }
        }
        return null;
    }
    
    //Update impiegato
    public boolean updateImpiegato(Impiegato i) {
        boolean Trovato = false;
        for (Impiegato impiegato : listImpiegato) {
            if (impiegato.getCodiceFiscale().equals(i.getCodiceFiscale())) {
                Trovato = true;
                listImpiegato.add(i);
            }
        }
        return false;
    }
    
    public void deleteImpiegato(Impiegato codicefiscale) {
        for (Impiegato impiegato : listImpiegato) {
            if(impiegato.getCodiceFiscale().equals(codicefiscale)) {
                listImpiegato.remove(codicefiscale);
                System.out.println("[LOG] Impiegato eliminato");
            }
        }   
    }
}
