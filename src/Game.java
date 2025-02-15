public class Game {
    public static void main(String[] args) {

        Superman superman = new Superman("Superman",60);
        Batman batman = new Batman("Batman", 45);
        Spiderman spiderman = new Spiderman("Spiderman", 24);
        spiderman.fight(batman);
    }
}
