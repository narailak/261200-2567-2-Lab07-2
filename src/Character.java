public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    public Character(int health, int stamina) {
        this.health =  health;
        this.stamina = stamina;
        this.maxHealth = health;
        this.maxStamina = stamina;
        System.out.println("Character created with " + this.health + " health and " + this.stamina + " stamina.");
    }

    public int getHealth(){
        return this.health;
    }

    public int getStamina(){
        return this.stamina;
    }

    public void swingSword(){
        this.stamina -= 10;
        if(stamina <= 0){
            System.out.println("Character swings sword.Stamina is now " + this.stamina + ".");
            System.out.println("Your character needs to cool down.");
        } else {
            System.out.println("Character swings sword.Stamina is now " + this.stamina + ".");
        }
    }

    public void takeDamage(int damageAmount){
        this.health -= damageAmount;
        if(this.health <= 0){
            System.out.println("Character takes " + damageAmount + " damage from enemy.Health is now  " + this.health + ".");
            System.out.println("Character is dead.");
        }
        else {
            System.out.println("Character takes " + damageAmount + " damage from enemy.Health is now  " + this.health + ".");
        }
    }

    public void rest(){
        this.stamina = maxStamina;
        this.health = maxHealth;
        System.out.println("Character has rested.Health and stamina restore to maximum.");
        System.out.println("Character's health : " + this.health +", stamina : " + this.stamina + ".");
    }
}