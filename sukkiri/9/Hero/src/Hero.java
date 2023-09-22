public class Hero {
    String name;
    int hp;
    Sword sword;

    public void attack(){
        System.out.println(this.name + "は" + sword.name + "で攻撃した！");
        System.out.println("敵に５ダメージを与えた");
    }

}
