package agenziaImmobiliare;

import java.lang.reflect.Array;
import java.util.List;

public class Immobili {
     private String codice;
     private String indirizzo;
     private int cap;
     private String citta;
     private int supercicia;
     // attributo per memorizzare il numero di persone interessate all’acquisto
//COSTRUTORI

     public Immobili(String codice, String indirizzo, int cap, String citta, int supercicia) {
          this.codice = codice;
          this.indirizzo = indirizzo;
          this.cap = cap;
          this.citta = citta;
          this.supercicia = supercicia;
     }
     //GETTER E SETTER

     //GET E SET CODICE
     public String getCodice() {
          return codice;
     }

     public void setCodice(String codice) {
          this.codice = codice;
     }
//GET E SET INDIRIZZO
     public String getIndirizzo() {
          return indirizzo;
     }

     public void setIndirizzo(String indirizzo) {
          this.indirizzo = indirizzo;
     }
     //GET E SET CAP
     public int getCap() {
          return cap;
     }

     public void setCap(int cap) {
          this.cap = cap;
     }
     //GET E SET CITTA
     public String getCitta() {
          return citta;
     }

     public void setCitta(String citta) {
          this.citta = citta;
     }
     //GET E SET SUPERFICIA
     public int getSupercicia() {
          return supercicia;
     }

     public void setSupercicia(int supercicia) {
          this.supercicia = supercicia;
     }

     private int personeInteressate =0;
//METODI
     //  aggiungere un metodo per incrementare questo numero.
 public int aggiungipersona(){
      personeInteressate=personeInteressate+1;
      return personeInteressate;
 }
 // Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie
 public int reinpostaSuperfici(int nuonaSuperficia){

      return nuonaSuperficia;
 }


     @Override
     public String toString() {
          return "Immobili{" +
                  "codice='" + codice + '\'' +
                  ", indirizzo='" + indirizzo + '\'' +
                  ", cap=" + cap +
                  ", citta='" + citta + '\'' +
                  ", supercicia=" + supercicia +
                  ", personeInteressate=" + personeInteressate +
                  '}';
     }
}
