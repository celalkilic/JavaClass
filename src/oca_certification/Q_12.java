package oca_certification;

public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = reverseStringBuilder("SiliconeLabs");
		System.out.println(stringBuilder);
	}
	static StringBuilder reverseStringBuilder(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder = stringBuilder.reverse();
		return stringBuilder;
		
	}
}
