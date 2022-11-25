import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GUI gui = new GUI();

        Braet braet = new Braet();
        Braet2 braet2 = new Braet2();
        Player player = new Player();
        Player player2 = new Player();
        Terning terning = new Terning();
        Terning terning2 = new Terning();
        int P1penge = player.getNuvaerendeVaerdi(), P2penge = player2.getNuvaerendeVaerdi();
        Scanner scan = new Scanner(System.in);
        int SpillerLokation = player.setSpillerLokation;
        int Spiller2Lokation = player2.setSpillerLokation;

        String Dansk = "Dansk";
        String English = "English";
        System.out.println("Write :English: for English");
        System.out.println("Skriv :Dansk: for dansk");
        String input = scan.nextLine();

        P1penge = 20;
        P2penge = 20;
        while (P1penge > 0 && P2penge > 0) {

            if (input.compareTo(English) == 0) {

                int slagSpiller1 = terning.getFaceValue() + SpillerLokation;
                int slagSpiller2 = terning2.getFaceValue() + Spiller2Lokation;
                if (slagSpiller1 > 23) {
                    slagSpiller1 -= 23;

                }
                if (slagSpiller2 > 23) {
                    slagSpiller2 -= 23;
                }
                System.out.println("Player 1 rolls:");
                terning.roll();
                System.out.println(terning.getFaceValue());
                System.out.println("Player 1 landed on:");
                System.out.println(braet.BraetFelter.get(slagSpiller1).getFeltNavn());
                System.out.println(P1penge += braet.BraetFelter.get(terning.getFaceValue()).getFeltVaerdi());
                SpillerLokation += braet.BraetFelter.get(terning.getFaceValue()).getFeltNummer();
                System.out.println("Lander på felt nummer = "); //fjern inden aflevering
                System.out.println(SpillerLokation); //fjern inden aflevering


                System.out.println("Player 2 rolls:");
                terning2.roll();
                System.out.println(terning2.getFaceValue());
                System.out.println("Player 2 landed on:");
                System.out.println(braet.BraetFelter.get(slagSpiller2).getFeltNavn());
                System.out.println(P2penge += braet.BraetFelter.get(terning2.getFaceValue()).getFeltVaerdi());
                Spiller2Lokation += braet.BraetFelter.get(terning2.getFaceValue()).getFeltNummer();
                System.out.println("Lander på felt nummer = "); //fjern inden aflevering
                System.out.println(Spiller2Lokation); //fjern inden aflevering


            }
        }
    }
}

