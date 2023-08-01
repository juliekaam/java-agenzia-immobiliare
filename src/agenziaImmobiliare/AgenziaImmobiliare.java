package agenziaImmobiliare;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {
    /*una lista di immobili e presenta
un metodo per aggiungere un immobile
un metodo per la ricerca di un immobile a partire dal codice alfanumerico
un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate*/
    private List<Immobile>listaImmobili;

    //COSTRUTTORI


    public AgenziaImmobiliare() {
        this.listaImmobili =new ArrayList<>() ;
    }
    //METODI
    //un metodo per aggiungere un immobile
    public void aggiungiImmobili(Immobile immobile){


        listaImmobili.add(immobile);
    }


    //un metodo per la ricerca di un immobile a partire dal codice alfanumerico
public Immobile ricercaImmobilePerCodice(String codice){

    boolean trovato = false;
    int contatore = 0;
    Immobile immobileCercato = null;
    while (!trovato && contatore < listaImmobili.size()) {
        // per ogni immonile nella lista confronto il codice con quello passato
        if (codice.equals(listaImmobili.get(contatore).getCodice())) {
            // trovato!
            immobileCercato = listaImmobili.get(contatore);
            trovato = true;
        }
        contatore++;
    }
    return immobileCercato;
}


    //un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
    public Immobile immobileConmaggiorInteresse() {
        int maxInteresse = 0;

        Immobile immobileInteressati = null;
        for (Immobile immobile : listaImmobili) {
            int personeInteressate = immobile.getPersonaInteressata();
            if (immobile.getPersonaInteressata() > maxInteresse) {
                maxInteresse =personeInteressate ;
               immobileInteressati=immobile;
                break;

            }

        }
        return immobileInteressati;
    }
}
