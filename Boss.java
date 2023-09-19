import java.util.Random;

public class Boss extends Character{

    private int maxAttack = 10;

    //constructor that sets the character's name to "The Boss" and sets the hit points to 200
    public Boss(){
        super(true);
        setName("The Boss");
        setStartingHitPoints(200);
        setCurrentHitPoints(200);
    }

    //an override of attack that picks a random number between 0 and maxAttack
    @Override
    public int attack(){
        Random random = new Random();
        int damage = random.nextInt(maxAttack);
        System.out.println(getName() + " mega attacks you inflicting " + damage + " damage");
        return damage;
    }

}
