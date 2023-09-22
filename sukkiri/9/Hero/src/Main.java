// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "fire sword";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "minato";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);
        h.attack();
    }
}