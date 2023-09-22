public class gomi {
    public static void main(String[] args) {
        int[] heights = {172,149,152,191,155};
        for (int h : heights) {
            System.out.println(h);
        }
        
        StartMark();

    }
    private static void StartMark(){
        System.out.print("|");
            for (int i = 0; i < 40; i++) {
                System.out.print("=");
            }
            System.out.println("|");
    }
}
