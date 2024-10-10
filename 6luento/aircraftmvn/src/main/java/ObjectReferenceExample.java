import models.library.Author;

public class ObjectReferenceExample {

    /**
     * OLIO-OHJELMOINTI I
     * - Argumenttien välitys arvoina ja olioviittaukset.
     */


    //Funktio ei muuta kutsuvan funktion alkuperäisen
    //numeron arvoa, koska argumentista from syntyy
    //KOPIO. Muutos ei näin välity ilman return-lausetta.
    public static void changeDouble(double from){
        from=999999999.999999999;   //try to set a new value.
    }

    //Argumentin ollessa olio, muutos välittyy ja tällä funktiolla
    //on näin sivuvaikutus!
    public static void changeObjectArgumentAttributes(Author author){
        author.setId(890);   //Set new value to object attribute of the argument
    }


    public static void main(String[] args){
        double nbr = 8.0d;
        changeDouble(nbr);
        System.out.println("Numero on edelleen "+nbr);

        Double nbrAsDouble = Double.parseDouble("12.9");

        changeDouble(nbrAsDouble);
        System.out.println("Numero on edelleen "+nbrAsDouble);

        Author authorA = new Author();
        authorA.setId(1);
        changeObjectArgumentAttributes(authorA);

        System.out.println("Authorid on nyt muuttunut olioviittauksen vuoksi se on nyt "+authorA.toString());
    }

}
