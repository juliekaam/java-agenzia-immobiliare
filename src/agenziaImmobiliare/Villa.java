package agenziaImmobiliare;

public class Villa extends Abitazione{

    private int dimensioniGiardino;

    //COSTRUTTORI
    public Villa(String codice, String indirizzo, int cap, String citta, int supercicia,int personaIntessate, int numeroVani, int numriBagni, int dimensioniGiardino) {
        super(codice, indirizzo, cap, citta, supercicia, personaIntessate,numeroVani, numriBagni);
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

   //overload
   public void reimpostaSuperfici(int surface, int superficieGiardino) {
       this.dimensioniGiardino = superficieGiardino;
       super.reinpostaSuperfici(surface,superficieGiardino);}

    @Override
    public String toString() {
        return "villa{" + "codice='" + getCodice() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", cap=" + getCap() +
                ", citta='" + getCitta() + '\'' +
                ", supercicia=" + getSupercicia() +
                ", personeInteressate=" + getPersonaInteressata()+
                ", numeroVani=" + getNumeroVani() +
                ", numriBagni=" + getNumriBagni() +
                ", dimensioniGiardino=" + dimensioniGiardino +
                '}';
    }


}
