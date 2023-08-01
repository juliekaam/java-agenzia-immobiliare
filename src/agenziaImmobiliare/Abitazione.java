package agenziaImmobiliare;

public class Abitazione extends Immobili{
    private int numeroVani;
    private int numriBagni;

    //COSTRUTTORI

    public Abitazione(String codice, String indirizzo, int cap, String citta, int supercicia,int numeroVani,int numriBagni) {
        //atributi della super
        super(codice, indirizzo, cap, citta, supercicia);
        //atributi dell'abitazione
        this.numeroVani=numeroVani;
        this.numriBagni=numriBagni;
    }
    //GETTER E SETTER

    public int getNumeroVani() {
        return numeroVani;
    }

    public void setNumeroVani(int numeroVani) {
        this.numeroVani = numeroVani;
    }

    public int getNumriBagni() {
        return numriBagni;
    }

    public void setNumriBagni(int numriBagni) {
        this.numriBagni = numriBagni;
    }
    //METODI

    @Override
    public String toString() {
        return "Abitazione{" +
                "codice='" + getCodice() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", cap=" + getCap() +
                ", citta='" + getCitta() + '\'' +
                ", supercicia=" + getSupercicia() +
                ", personeInteressate=" + aggiungipersona()+
                "numeroVani=" + numeroVani +
                ", numriBagni=" + numriBagni +
                '}';
    }
}
