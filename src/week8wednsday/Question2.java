package week8wednsday;
class Date{
	private int month;
	private int day;
	private int year;
	
	public Date(int month,int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void DisplayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
public class Question2 {

	public static void main(String[] args) {
		

	}

}
