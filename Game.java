import java.util.*;


public class Game {

    ArrayList<Character> badGuys = new ArrayList<Character>();
    Player player;
    int numGrunts;

    public Game(){
        Random random = new Random();
        this.numGrunts = random.nextInt(2)+1;
        System.out.println("You will be facing "+ numGrunts + " grunts.");
        for(int i = 0; i < numGrunts; i++){
            badGuys.add(new Grunt());
        }
        badGuys.add(new Boss());
        this.player = new Player();
    }

    public boolean win() {
        ListIterator<Character> characterIterator = badGuys.listIterator();
        int numAlive = 0;
        for (Character baddies : badGuys) {
            if (baddies.isAlive) {
                numAlive++;
            }
        }
        if (numAlive > 0){
            return false;
        }
        else{
            return true;
        }
    }


    public boolean lose(){
        if(!player.isAlive){
            return true;
        }
        else{
            return false;
        }
    }


    public int chooseWhoToAttack(){
        System.out.println("Who would you like to attack?");
        ListIterator<Character> characterIterator = badGuys.listIterator();
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        for(Character baddies : badGuys){
            if(baddies.isAlive()) {
                System.out.println(counter + ". " + baddies.getName());
                counter++;
            }
        }
        return scan.nextInt();
    }

    public void playRound(){
        if(player.isAlive()) {
            player.displayYourself();
            ListIterator<Character> characterIterator = badGuys.listIterator();
            for(Character baddies : badGuys){
                if(baddies.isAlive()){
                    baddies.displayYourself();
                }
                player.takeHit(baddies.attack());
            }
            if(player.isAlive()){
                badGuys.get(chooseWhoToAttack()).takeHit(player.attack());
            }
        }
    }

}
