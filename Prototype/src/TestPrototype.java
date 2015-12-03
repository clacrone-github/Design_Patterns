public class TestPrototype {

	public static void main(String[] args) {
		
		System.out.println("Creating a Prototype Factory with a SoupSpoon and a SaladFork");
		
		PrototypeFactory factory = new PrototypeFactory(new SoupSpoon(), new SaladFork());
		AbstractSpoon spoon = factory.makeSpoon();
		AbstractFork fork = factory.makeFork();
		
		System.out.println("Getting the Spoon and Fork name:");
		System.out.println("Spoon: " + spoon.getSpoonName());
		System.out.println("Fork: " + fork.getForkName());
		System.out.println();
		
		System.out.println("Creating a Prototype Factory with a SaladSpoon and a DesertFork");
		
		factory = new PrototypeFactory(new SaladSpoon(), new DesertFork());
		spoon = factory.makeSpoon();
		fork = factory.makeFork();
		
		System.out.println("Getting the Spoon and Fork name:");
		System.out.println("Spoon: " + spoon.getSpoonName());
		System.out.println("Fork: " + fork.getForkName());
		System.out.println();
	}
}
