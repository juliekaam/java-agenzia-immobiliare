package agenziaImmobiliare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();

        Box box=new Box("a01","via angelo 10 ",13400,"Milano",45,3,5);
        Box box1=new Box("a02","via liceo 48 ",14400,"biella",80,5,2);


        Abitazione abitazione=new Abitazione("as5","via sappa 6A",19100,"como",100,3,5,2);
        Abitazione abitazione1=new Abitazione("aa12","via neggr 61",14100,"ancona",122,1,5,2);


        Villa villa=new Villa("ng14","via ancona 05",18100,"como",200,8,7,3,50);
        Villa villa1=new Villa("bc12","via sappa 12",19100,"como",245,6,8,3,45);

        agenzia.aggiungiImmobili(box);
        agenzia.aggiungiImmobili(box1);
        agenzia.aggiungiImmobili(abitazione);
        agenzia.aggiungiImmobili(abitazione1);
        agenzia.aggiungiImmobili(villa);
        agenzia.aggiungiImmobili(villa1);


        Immobile[] listaImmobili;
        for (Immobile immobile:
             ) {
            System.out.println(listaImmobili);


        }
        System.out.println(agenzia);

        //System.out.println(villa.(200,45));
        System.out.println(villa);

    }


}
