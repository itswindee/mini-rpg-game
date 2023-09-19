import java.util.Random;

public class Player extends Character{


    private int maxAttack = 30;

    public Player(){
        super(true);
        setName("Player 1");
        setStartingHitPoints(100);
        setCurrentHitPoints(100);
    }

    @Override
    public int attack(){
        Random random = new Random();
        int damage = random.nextInt(maxAttack);
        return damage;
    }


    //override of displayyourself()
    @Override
    public void displayYourself(){
        int health = health();
        System.out.println(getName()+ " has health of " + health);
    }
}
