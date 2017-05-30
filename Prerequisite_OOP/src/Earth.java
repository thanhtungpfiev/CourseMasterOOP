/**
 * tungdt9
 * May 30, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class Earth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human tom;
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Zsabo";
		tom.speak();
		
		Human joe = new Human();
		joe.age = 6;
		joe.eyeColor = "black";
		joe.heightInInches = 15;
		joe.name = "Joe";
		joe.speak();
	}
}
