public class Gorilla extends Mammel
{
	public int throwSomething()
	{
		System.out.println("Gorilla has thrown something");
		energy=energy-5;
		return energy;
		
	}
	public int eatBannas()
	{
		System.out.println("Gorilla is satisfied");
		energy=energy+10;
		return energy;
	}
	public int climb()
	{
		System.out.println("Gorilla climbed the tree");
		energy=energy-10;
		return energy;
	}
	
	
}
