
public class ComptageMot {

	public static void main(String[] args) {

				// Programme de base non optimisé
				String phrase1;
				int lg1;
				phrase1 = "Bienvenue dans cette initiation à Java.";
				lg1 = phrase1.length();
				System.out.println("La longueur de la phrase est de " + lg1);
				
				System.out.println("=====================");
				
				// programme plus optimisé
				String phrase2 = "Bienvenue dans cette initiation à Java.";
				int lg2 = phrase2.length();
				System.out.println("La longueur de la phrase est de " + lg2);
				
				System.out.println("=====================");
				
				// programme optimisé : nous supprimons 1 variable
				String phrase3 = "Bienvenue dans cette initiation à Java.";
				System.out.println("La longueur de la phrase est de " + phrase3.length());
			}

		
	}


