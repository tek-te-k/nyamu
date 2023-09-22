// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void  heal(int hp){
        hp += 10;
    }
    public static void heal(Thief thief){
        thief.hp += 10;
    }
    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("asaka",baseHp);
        heal(baseHp);
        System.out.println(baseHp + ":" + t.hp);
        heal(t);
        System.out.println(baseHp + ":" + t.hp);
    }
}