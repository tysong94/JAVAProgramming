package E12_Class_Abstract_Interface;

public class Dog_k08 extends Animal_k08 implements MoveBark_k08 {

	public Dog_k08 (String _name) {
		super(_name);
	}

	public void bark () {
		System.out.println("멍멍!");
	}

	@Override
	public void forward() {
		System.out.println("앞으로 가고 있음");
		
	}

	@Override
	public void backward() {
		System.out.println("뒤로 가고 있음");
	}
}
