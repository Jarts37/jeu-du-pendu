
public class MonPremierProg {

			 int variable = 5;
			 
			 public static void main(String args[]) {
			 
			 MonPremierProg obj = new MonPremierProg ();
			 
			 obj.method();
			 }
			 
			 void method() {
			 int variable = 40;
			 System.out.println("La valeur de la variable de la classe est : " + this.variable);
			 System.out.println("La valeur de la variable locale est : " + variable);
			 }
			

	}


