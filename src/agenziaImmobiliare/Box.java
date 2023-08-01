package agenziaImmobiliare;

public class Box  extends Immobile {
    private int numeroposti;


    //COSTRUTTORI
    public Box(String codice, String indirizzo, int cap, String citta, int supercicia,int numeroposti,int personeInteressate) {
        //ATRIBUTI DELLA SUPER
        super(codice, indirizzo, cap, citta, supercicia,personeInteressate);
        //ATRIBUTI DELLA BOX
        this.numeroposti=numeroposti;
    }
    //getter e setter

    public int getNumeroposti() {
        return numeroposti;
    }

    public void setNumeroposti(int numeroposti) {
        this.numeroposti = numeroposti;
    }




    //METODI


    @Override
    public String toString() {
        return "Box{"  +
                "codice='" + getCodice() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", cap=" + getCap() +
                ", citta='" + getCitta() + '\'' +
                ", supercicia=" + getSupercicia() +
                ", personeInteressate=" + getPersonaInteressata()+
                ", numeroposti=" + numeroposti +
                '}';
    }
}
