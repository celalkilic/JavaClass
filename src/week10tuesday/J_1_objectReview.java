package week10tuesday;
class Animal{
	int leg = 2;
	String name = "Crocodila";
	@Override
	public String toString() {
		
		return leg + "\n"+ name;
	}
	void talk() {
		System.out.println("animal is talking");
	}
}
class Cat extends Animal{
	int size;
	@Override
	void talk() {
		
		super.talk();
		this.size =90;
	}
	
}
public class J_1_objectReview {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.name+ " "+ animal.leg);
		System.out.println(animal.toString());
		
		Cat objCat = new Cat();
		objCat.talk();
	}

}
