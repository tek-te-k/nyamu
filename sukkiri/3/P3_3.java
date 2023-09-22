
public class P3_3 {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        System.out.println(isHungry);
        String food = "banana";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        }else{
            System.out.println("腹ペコです");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます");
        }
        System.out.println("ご馳走様でした");

    }
}
