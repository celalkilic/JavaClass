package week4Tuesday;

public class officehour7 {

	public static void main(String[] args) {
		System.out.println(cProfit(70, 100));

	}
	static String cProfit(int buyPrize, int sellPrize) {
		String str = " ";
		if (buyPrize>sellPrize) {
			str = "profit";
		}else {
			str= "non profit";
		}
		return str;
	}
}
