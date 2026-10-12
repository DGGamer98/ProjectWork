/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.dao.ImpiegatoDao;
import com.mycompany.mavenproject1.model.Impiegato;

/**
 *
 * @author dgatta
 */
public class main {

    public static void main(String[] args) {
        Impiegato impiegato1 = new Impiegato();
        Impiegato impiegato2 = new Impiegato();
        Impiegato impiegato3 = new Impiegato();

        ImpiegatoDao dao = new ImpiegatoDao();

        //Inizializziamo in memoria i valori dell'instanza impiegato1
        impiegato1.setNome("Mario");
        impiegato1.setCognome("Rossi");
        impiegato1.setMatricola(032604);
        impiegato1.setCodiceFiscale("RSSMRA80A01H501U");

        // Impiegato 3
        impiegato2.setNome("Luca");
        impiegato2.setCognome("Bianchi");
        impiegato2.setMatricola(32606); // Usato come intero senza lo zero iniziale
        impiegato2.setCodiceFiscale("BNCLCU88M15F205W");

        // Impiegato 4
        impiegato3.setNome("Elena");
        impiegato3.setCognome("Verdi");
        impiegato3.setMatricola(032607);
        impiegato3.setCodiceFiscale("VRDLNE92P52L219Y");


        //Aggiungo impiegato 
        dao.Impiegatoinsert(impiegato1);
        dao.Impiegatoinsert(impiegato2);
        dao.Impiegatoinsert(impiegato3);

        //Cerco impiegato
        System.out.println(dao.searchCodiceFiscale("VRDLNE92P52L219Y"));
        //elimino il dato
        dao.delete("VRDLNE92P52L219Y");
        
        dao.printAll();



    }
}
