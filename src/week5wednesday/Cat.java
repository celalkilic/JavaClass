package week5wednesday;

public class Cat {
	String breed;
	String eyeColor;
	String color;
	String name;
	int age;
	boolean hungry;
	int foodLevel;
	void eatFood(int foodValue) {
		if (hungry) {
			System.out.println(name + " is hungry");
			System.out.println(name + " drunk " + foodValue + " glass of milk");
			foodLevel += foodValue;
		}else {
			System.out.println(name + " is not hungry");
		}
	}
	void catInfo() {
		System.out.println("Cat Name : " + name);
		System.out.println("Cat Color : " + color);
		System.out.println("Cat Age : " + age);
		System.out.println("Cat Eye Color : " + eyeColor);
		System.out.println("Cat Breed : " + breed);
	}
	void play(String toy) {
		System.out.println(name + " is playing with " + toy);
	}
	
	void jump() {
		System.out.println(name + " is jumping");
	}


	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.age = 2;
		cat1.name = "Tarcin";
		cat1.color = "Brown";
		cat1.eyeColor = "blue";
		cat1.breed = "Van Cat";
		cat1.hungry = true;
		cat1.eatFood(4);
		cat1.catInfo();
		cat1.jump();
		cat1.play("yumak");

		System.out.println("\n*********************\n");
		Cat cat2 = new Cat();
		cat2.age = 4;
		cat2.name = "Duman";
		cat2.color = "Gray";
		cat2.eyeColor = "Black";
		cat2.breed = "Tekir Cat";
		cat2.hungry = false;
		cat2.eatFood(5);
		cat2.catInfo();
		// Escape Sequence
		System.out.println("\tCemil"); // t tab
		System.out.println("\nCemil"); // n new line
		System.out.println("\\\\Ahmet said 'He is not feeling well!'");
		
	}

}
