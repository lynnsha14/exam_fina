import java.util.Arrays;

public class Mot 
	 private String motM ;

	 public Mot (String mot)
	 {
		 this.motM=mot;
	 }
	 
	 public String getMot()
	 {
		 return this.motM;
	 }
	 public void setMot(String mot)
	 {
		 this.motM=mot.toUpperCase();
	 }
	 public void afficherMessage()
	 {
		 System.out.println(motM);
	 }
	 
	   @Override
	   
	   public String toString()
	   {
		   return "le mot en majuscule est"+ this.motM;
	   }
	   
	  public boolean equals (Object obj)
	  {
		  if(obj == this)
		  {
			  return true;
		  }
		  if (!(obj instanceof Mot))
		  {
			  return false;
		  }
		  Mot o = (Mot)obj;
		  return this.motM.equals(o.motM);
	  }
	  
	  public int hashcode()
	  {
		  return motM.hashCode();
	  }
	 
	  public int longueur()
	  {
		  return motM.length();
		  
	  }
	 
	 
	  
	  public static void main (String[] args)
	  {
		  Mot m1 =new Mot(" salut ");
		  Mot m2 =new Mot ("bonjour");
		  
		  System.out.println("equals:"+ m1.equals(m2));
		  
		  System.out.println("hashcode m1:"+m1.hashCode()); 
		  System.out.println("hashcode m2:"+m2.hashCode()); 
		  
		  System.out.println("ToString m1:"+ m1); 
		  System.out.println("ToString m2:"+ m2); 
		  System.out.println("le nombre de caractere est:"+ m2.longueur()); 
		  
		  Dico d =new Dico();
		  d.ajouter(new Mot("Java"));
		  d.ajouter(new Mot("super"));
		  d.ajouter(Arrays.asList(new Mot("facile"),new Mot("cool"),new Mot("examen"),new Mot("Java"),new Mot("rapide")));
		  d.afficher();
		  
	  }
	
}
