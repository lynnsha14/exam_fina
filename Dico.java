import java.util.Collection;
import java.util.TreeSet;

public class Dico implements Comparable<Mot> {

	private TreeSet<Mot> mot;
	
	 public Dico () {
		 mot =new TreeSet<>();
	 }
	public void ajouter(Mot mot)
	{
		if(mot == null || mot.longueur()==0)
		{
			throw new MotVideException ("le mot a ajouter est vide");
			
		}
	mot.add(mot);
			
	}
	
	
	public void ajouter(Collection<Mot> motc)
	{
		for( Mot mot :motc)
		{
			ajouter(mot);
		}
	}
	
	public void afficher()
	{
		for (Mot mot:mot)
			System.out.println(mot);
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
