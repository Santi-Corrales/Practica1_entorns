package practica1;

public class practica1_entorns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Integrants: Santi(suma), Eric (resta), Quim(multiplicación)
		
		int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int numSuma = 0;
		
		for(int i=0; i < sumArray.length; i++) {
			numSuma += sumArray[i];
		}
		
		System.out.println("El resultado de la suma és: " + numSuma);
		
		// User 2 fer la resta dels elements de subArray
		
		int resultResta = subArray[0];
		
		for (int i = 1; i < subArray.length; i++) {
			   resultResta -= subArray[i];
		   }
		
		System.out.println("El resultado de la resta es: "+ resultResta);
		
		// User 3 fer la multiplicació dels elements de prodArray
 
	        int result = 1; 
	        
	        for (int num : prodArray) {
	          
	        	result *= num; 
	        }
	        
	       System.out.println("El producte dels elements de l'array és: " + result); 
	     
	}

}
