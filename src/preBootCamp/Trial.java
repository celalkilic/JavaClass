package preBootCamp;

public class Trial {

	public static void main(String[] args) {
	Trial objTrial = new Trial();
	System.out.println(objTrial.calculateBMI(78, 1.82));
	}
	// Method which calculates BMI value  :  weight(kg) / height*height(meter)
	// Below 18.5 = Underweight
	// 18.5-24.9 = Normal Weight
	// 25.0-29.9 = Overweight
	// 30.0-34.9 = Obesity Class I
	// 35.0-39.9 = Obesity Class II
	// Above 40.0 = Obesity Class III
	// method will return String which tells my condition
	public String calculateBMI(double weight, double height) {
		double BMI = weight/Math.pow(height, 2);
		if (BMI<=18.5) {
			return "Underweight";
		}else if (BMI<=24.9) {
			return "Normal Weight";
		}else if (BMI<=29.9) {
			return " Overweight";
		}else if (BMI<=34.9) {
			return "Obesity Class I";
		}else if (BMI<=39.9) {
			return "Obesity Class II";
		}else {
			return "Obesity Class III";
		}
	}
	
}
