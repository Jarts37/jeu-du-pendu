import java.util.Scanner;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		System.out.println("Combien de mots ?");
		int nbmots = entree.nextInt();
	    String[] numbers = new String[nbmots];
	    
	    int i = 0;
		do
		{
	        System.out.println("Entrez un Mot [" + (i+1) + "/" + nbmots + "]");
	        String Secure = entree.next();
	        
	        if(Pattern.matches("[a-zA-ZËçåÌ€ˆ‡‰‹ŠŒñîïÍ…¯˜—™›š¿éƒæè‘‚íêëì“’”•ôòó†œŸØ„–]+", Secure)) 
	        { 
	        numbers[i] = Secure;
	        i++;
	        } 
	        else 
	        { 
	        System.out.println("Erreur de saisie !"); 
	        } 
	        
	        
		} while (i < nbmots);
	    
	    String motatrouver = numbers[(int) (Math.random() * nbmots)];
	    System.out.println(motatrouver);
	    
	    for (int loop = 1; loop <= motatrouver.length(); loop++)
	    {
	    	System.out.print("-");
	    }
	    



	}
	    
	}

		
		
