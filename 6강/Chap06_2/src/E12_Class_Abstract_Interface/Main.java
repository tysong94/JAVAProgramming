package E12_Class_Abstract_Interface;

public class Main {
	public static void main(String[] args) {
		// Dog 형
		Dog_k08 dog = new Dog_k08("강아지");
		System.out.println(dog.name);
		dog.eat();
		dog.bark();
		dog.forward();
		dog.backward();
		
		System.out.println("***********************");
		
		// Animal 형변환
		Animal_k08 dog1 = (Animal_k08) dog;
		System.out.println(dog1.name);
		dog1.eat();
//		dog1.bark();	
//		dog1.forward();
//		dog1.backward();
		
		System.out.println("***********************");
		
		// MoveBark 형변환
		MoveBark_k08 dog2 = (Dog_k08) dog;
//		System.out.println(dog2.name);
//		dog2.eat();
		dog2.bark();
		dog2.forward();
		dog2.backward();
		
		System.out.println("***********************");
		
		// Pigeon 형
		Pigeon_k08 pigeon = new Pigeon_k08();
		pigeon.fly();
		
		System.out.println("***********************");
		
		// FlyAnimal 형변환
		FlyAnimal pigeon2 = (FlyAnimal) pigeon;
		pigeon2.fly();
		
		
	}
}
