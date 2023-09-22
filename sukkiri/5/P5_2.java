
public class P5_2 {
    public static void main(String[] args) {
        String title = "joiful";
        String address = "joy@ful";
        String text = "joiful";
        mail(title,address,text);
    }

    public static void mail(String title, String address, String text) {
        System.out.println(address + "に、以下メールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }
}
