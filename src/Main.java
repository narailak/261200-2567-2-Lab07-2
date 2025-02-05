public class Main {
    public static void main(String[] args) {
        Character Narai = new Character(100,50);
        Narai.swingSword();
        Narai.swingSword();
        Narai.swingSword();
        Narai.swingSword();
        Narai.swingSword();

        System.out.println(" ");

        Narai.takeDamage(30);
        Narai.takeDamage(50);
        Narai.takeDamage(20);

        System.out.println(" ");
        Narai.rest();
    }
}