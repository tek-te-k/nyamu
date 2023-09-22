
public class Main {
    public static void main(String[] args) {
        //勇者を生成
        Hero h = new Hero();
        Cleric c = new Cleric();

        //フィールドに初期値をセット
        h.name = "ミナト"; //set name "minato"
        h.hp = 100;       //set hp 100
        System.out.println("勇者" + h.name + "を生み出しました");
        c.name = "ササキ";
        c.hp = 70;
        c.mp = 70;
        System.out.println("聖職者" + c.name + "を生み出しました");

        Matango m1 = new Matango();

        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';


        h.slip();
        m1.run();
        m2.run();
        h.run();
        c.pray(5);

    }

}