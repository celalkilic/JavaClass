package week7saturday;


class Dog{
	String name;
	String breed;
	double weight;	
	public Dog() {
		name = " ";
		breed = " ";
		weight = 0.0;
	}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
		breed = "Mutt";
	}
}
public class Question1 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.println("dog name :"+dog1.name);
		System.out.println("dog breed :"+dog1.breed);
		System.out.println("dog weigth :"+dog1.weight);
		System.out.println("**********************");
		Dog dog2 = new Dog("Alfred", 20.1);
		System.out.println(dog2.name);
		System.out.println(dog2.breed);
		System.out.println(dog2.weight);
	}
}