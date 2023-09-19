import java.util.Random;

public class Grunt extends Character {

    int gruntID;
    private int maxAttack = 5;
    static int gruntCount = 1;


    public Grunt(){
        super(true);
        setName("Grunt " + gruntCount);
        gruntCount++;
        setStartingHitPoints(100);
        setCurrentHitPoints(100);
        this.gruntID = gruntCount;
    }


    @Override
    public int attack(){
        Random random = new Random();
        int damage = random.nextInt(maxAttack);
        System.out.println(getName() + " attacks you inflicting " + damage + " damage");
        return damage;
    }
}