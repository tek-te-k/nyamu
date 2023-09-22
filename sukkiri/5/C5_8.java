
public class C5_8 {
    public static int add(int x,int y) {
        int ans = x + y;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(add(add(100, 10),add(20, 20)));
    }
}
