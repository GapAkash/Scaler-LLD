/**
 * 
 */
package scaler;

/**
 * @author Akash.Gupta
 *
 */
public class Crow extends Bird implements Flyable {

	@Override
	void walk() {
		System.out.println("Crow is walking");
	}

	@Override
	public void flying() {
		System.out.println("Crow can fly");
	}

	@Override
	public String toString() {
		return "Crow [name=" + name + ", age=" + age + ", weight=" + weight + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
