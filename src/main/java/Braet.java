import java.util.ArrayList;
import java.util.List;

public class Braet {
    List<Felter> BraetFelter;

    public Braet() {

        BraetFelter = new ArrayList<Felter>();

        BraetFelter.add(new Felter("START", +2, 0));
        BraetFelter.add(new Felter("BurgerBaren", -1, 1));
        BraetFelter.add(new Felter("PizzaHuset", -1,2));
        BraetFelter.add(new Felter("Chance",0 ,3));
        BraetFelter.add(new Felter("Slikbutikken", -1,4));
        BraetFelter.add(new Felter("Iskiosken", -1,5));
        BraetFelter.add(new Felter("På besøg (fængsel)", 0,6));
        BraetFelter.add(new Felter("Museet", -2,7));
        BraetFelter.add(new Felter("Biblioteket", -2,8));
        BraetFelter.add(new Felter("Chance", +0,9));
        BraetFelter.add(new Felter("Skaterparken", -2,10));
        BraetFelter.add(new Felter("Swimmingpoolen", -2,11));
        BraetFelter.add(new Felter("Gratis Parkering", 0,12));
        BraetFelter.add(new Felter("SpilleHallen", -3,13));
        BraetFelter.add(new Felter("Biograf", -3,14));
        BraetFelter.add(new Felter("Chance", 0,15));
        BraetFelter.add(new Felter("Legetøjsbutikken", -3,16));
        BraetFelter.add(new Felter("Dyrehandlen", -3,17));
        BraetFelter.add(new Felter("Gå i fængsel", 0,18));
        BraetFelter.add(new Felter("Bowlinghallen", -4,19));
        BraetFelter.add(new Felter("Zoologisk have", -4,20));
        BraetFelter.add(new Felter("Chancen", 0,21));
        BraetFelter.add(new Felter("Vandlandet", -5,22));
        BraetFelter.add(new Felter("Strandpromenaden", -5,23));

    }

}



