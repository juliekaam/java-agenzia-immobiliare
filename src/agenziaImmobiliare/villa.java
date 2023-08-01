package agenziaImmobiliare;

public class villa extends Abitazione{

    private int dimensioniGiardino;

    //COSTRUTTORI
    public villa(String codice, String indirizzo, int cap, String citta, int supercicia, int numeroVani, int numriBagni,int dimensioniGiardino) {
        super(codice, indirizzo, cap, citta, supercicia, numeroVani, numriBagni);
        this.dimensioniGiardino=dimensioniGiardino;
    }

    //GETTER E SETTER

    public int getDimensioniGiardino() {
        return dimensioniGiardino;
    }

    public void setDimensioniGiardino(int dimensioniGiardino) {
        this.dimensioniGiardino = dimensioniGiardino;
    }
    //METODI

    @Override
    public String toString() {
        return "villa{" + "codice='" + getCodice() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", cap=" + getCap() +
                ", citta='" + getCitta() + '\'' +
                ", supercicia=" + getSupercicia() +
                ", personeInteressate=" + aggiungipersona()+
                "numeroVani=" + getNumeroVani() +
                ", numriBagni=" + getNumriBagni() +
                "dimensioniGiardino=" + dimensioniGiardino +
                '}';
    }


}
