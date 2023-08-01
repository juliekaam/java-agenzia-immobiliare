package agenziaImmobiliare;

public class Box  extends Immobili {
    private int numeroposti;


    //COSTRUTTORI
    public Box(String codice, String indirizzo, int cap, String citta, int supercicia,int numeroposti) {
        //ATRIBUTI DELLA SUPER
        super(codice, indirizzo, cap, citta, supercicia);
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
                ", personeInteressate=" + aggiungipersona() +
                "numeroposti=" + numeroposti +
                '}';
    }
}
