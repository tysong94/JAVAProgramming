package E12_Class_Abstract_Interface;

public class Main {
	public static void main(String[] args) {
		// Dog ��
		Dog_k08 dog = new Dog_k08("������");
		System.out.println(dog.name);
		dog.eat();
		dog.bark();
		dog.forward();
		dog.backward();
		
		System.out.println("***********************");
		
		// Animal ����ȯ
		Animal_k08 dog1 = (Animal_k08) dog;
		System.out.println(dog1.name);
		dog1.eat();
//		dog1.bark();	
//		dog1.forward();
//		dog1.backward();
		
		System.out.println("***********************");
		
		// MoveBark ����ȯ
		MoveBark_k08 dog2 = (Dog_k08) dog;
//		System.out.println(dog2.name);
//		dog2.eat();
		dog2.bark();
		dog2.forward();
		dog2.backward();
		
		System.out.println("***********************");
		
		// Pigeon ��
		Pigeon_k08 pigeon = new Pigeon_k08();
		pigeon.fly();
		
		System.out.println("***********************");
		
		// FlyAnimal ����ȯ
		FlyAnimal pigeon2 = (FlyAnimal) pigeon;
		pigeon2.fly();
		
		
	}
}
