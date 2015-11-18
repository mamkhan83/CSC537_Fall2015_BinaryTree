import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();

		Patient rootNode = new Patient();
		rootNode.setFirstName("First Name 0");
		rootNode.setLastName("Last Name 0");
		int age = new Random().nextInt((85 - 5) + 1) + 5;
		rootNode.setAge(age);

		bt.add(rootNode);

		for (int i = 1; i < 100; i++) {
			Patient p = new Patient();
			p.setFirstName("First Name " + i);
			p.setLastName("Last Name " + i);
			age = new Random().nextInt((85 - 5) + 1) + 5;
			p.setAge(age);
			bt.add(p);

		}

		System.out.println("\n\n---------------All nodes-----------\n");
		//bt.show(rootNode);
		System.out.println("\n\n---------------Left Brach-----------\n");
		bt.show(rootNode.left);
		System.out.println("\n\n---------------Right Brach-----------\n");
		bt.show(rootNode.right);

	}
}