public class Main {

    public static void main(String[] args) {
        Game myGame = new Game();
        while ((!myGame.win()) && (!myGame.lose())) {
            myGame.playRound();
            System.out.println();
        }
    }
}