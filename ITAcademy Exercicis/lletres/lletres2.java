import java.util.*;


/*
 * l'Usuari indica el seu nom a la llista, i l'algoritme resol
 * si és VOVAL, CONSONANT o número.
 * */
public class lletres2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		 List<Character> nomUsuari = new ArrayList<Character>();
		 	nomUsuari.add('A');
		 	nomUsuari.add('L');
		 	nomUsuari.add('B');
			nomUsuari.add('E');
		 	nomUsuari.add('R');
		 	nomUsuari.add('T');
		 	
		
	
		for(int i=0;i<nomUsuari.size();i++) {
			
			if (isNumeric(nomUsuari.get(i))) {
				
				
				System.out.println("Els noms de persona no contenen números. Ets un robot? ");
				break;
			}
			
			if (isVocal((nomUsuari.get(i)))) {
				System.out.println("VOCAL: "+nomUsuari.get(i));
				
			}else {
				System.out.println("CONSONANT: "+nomUsuari.get(i));
				
			}
			
			
		

		}

	}
	// Funció per indicar si és un número
	   public static boolean isNumeric(char cadena) {
		
		   boolean resultado;

	       if (Character.isDigit(cadena)==true) {

	        	resultado = true;
	        } else {
	            resultado = false;
	        }

	        return resultado;
	    }
	// Funció per comprobar si és vocal
	   public static boolean isVocal(char cadena) {

	        boolean resultado;

	        try {
	          
	        	switch(Character.toUpperCase(cadena)){
	        		case 'A':	case 'E':	case 'I':
	        		case 'O':	case 'U':	
	        			resultado = true;
	        	break;
	        	
	        	default:
	        		resultado = false;
	        	}
	            
	        } catch (NumberFormatException excepcion) {
	            resultado = false;
	        }

	        return resultado;
	    }
}



