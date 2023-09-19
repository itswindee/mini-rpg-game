public abstract class Character {

    protected int startingHitPoints;
    protected int currentHitPoints;
    protected boolean isAlive;
    protected String name;

    //default constructor
    public Character(boolean isAlive) {
        this.isAlive = isAlive;
    }


    //getter for name
    public String getName() {
        return name;
    }


    //setter for name
    public void setName(String name) {
        this.name = name;
    }


    //setter for hit points (both of them)
    public void setStartingHitPoints(int startingHitPoints) {
        this.startingHitPoints = startingHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }


    //health method - calculates what % health the user has
    public int health(){
        return (currentHitPoints * 100)/startingHitPoints;
    }


    //takeHit method - takes in an amount of damage (int)
    public int takeHit(int damage){
        System.out.println(getName() + " has been hit with " + damage + " damage.");
        setCurrentHitPoints(currentHitPoints-damage);
        if(currentHitPoints < 0){
            this.isAlive = false;
            System.out.println(getName() + " has died");
        }
        else{
            System.out.println(getName() + " now has health of " + currentHitPoints);
        }
        return currentHitPoints;
    }


    //isAlive method - returns true if character is alive, false otherwise
    public boolean isAlive(){

       return this.isAlive;
    }


    //displayYourself method - take in and returns nothing
    public void displayYourself(){
        int health = health();
        System.out.print(getName()+ " Health: " + "(" + health + ")");
        for(int i = 0; i < 9; i++){
            if(health/10 > i){
                System.out.print("=");
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println();
    }

    //an abstract method called attack that takes no parameters and returns an int
    public abstract int attack();

}