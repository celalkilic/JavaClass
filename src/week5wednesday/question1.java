package week5wednesday;

public class question1 {

	public static void main(String[] args) {
		Hollowrect(5, 5, 'e');
	}
static void Hollowrect(int row , int col,char ch) {
	for (int i = 1; i <= row; i++) {
		for (int j = 1; j <=col; j++) {
			if (i==1||i==row||j==1||j==col) {
				System.out.print(ch);
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
