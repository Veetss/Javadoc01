/**
 * Questa è la mia classe main in cui andrò a stampare le richieste
 * dell'esercizio.
 *
 * @author Vittoria Vassarotti
 */

public class Tester {

    static String word = " Dear";
    static String name = "Pino";
    static String surname = "Daniele";

    /**
     * questo metodo richiama i metodi presenti nella classe WordGames in modo da poter stampare
     * Hello Dear Pino Daniele
     * @param args
     */
    public static void main(String[] args) {
        WordGames obj = new WordGames();
        System.out.println(obj.addHelloWord(word));
        System.out.println(obj.getFullName(name, surname));
    }
}
