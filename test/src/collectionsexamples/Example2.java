package collectionsexamples;

public class Example2 {

	public static void main(String[] args) {
		Example example = new Example();
		example.getAl().remove(1);
		System.out.println(example.getAl() + " in Example2 class");
	}

}
