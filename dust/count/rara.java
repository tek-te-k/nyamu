public class rara {
	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		int num2 = num;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print("*");
			}
			System.out.println();
			num2--;
		
		}
	}
}
