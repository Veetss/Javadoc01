/**
 * Questa è la classe in cui andrò ad inserire i metodi di riferimento da utilizzare
 * nella classe main.
 *
 * @author Vittoria Vassarotti
 */

public class WordGames {

    /**
     * questo metodo mi ritorna la stringa Hello sommata alla mia variabile word("Dear")
     * @param word
     * @return
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }

    /**
     * questo metodo mi ritorna la somma delle stringhe name("Pino") e surname("Daniele")
     * @param name
     * @param surname
     * @return
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
