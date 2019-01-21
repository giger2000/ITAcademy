import javax.swing.*;

/*
 * l'Usuari indica el seu nom i evalua, caracter a caracter, si és número
 * vocal o consonant
 * */
public class lletres2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preguntem nom a usuari
		String nomUsuari=JOptionPane.showInputDialog("Introduce el nombre de usuario");
		
		//Inicialitzem matriu
		char miArray[];
		//Indiquem tamany de la matriu
		miArray = new char[nomUsuari.length()];
		
		//Omplim array amb el nom introduït
		
		for (int i=0;i<nomUsuari.length();i++) {
			miArray[i]=(nomUsuari.charAt(i));
			
		}
		
		//System.out.println(miArray);
		
		for(int i=0;i<miArray.length;i++) {
			
			if (isNumeric(miArray[i])) {
				
				
				System.out.println("Els noms de persona no contenen números. Ets un robot? ");
				break;
			}
			
			if (isVocal((miArray[i]))) {
				System.out.println("VOCAL: "+miArray[i]);
				
			}else {
				System.out.println("CONSONANT: "+miArray[i]);
				
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
	           // Integer.parseInt(cadena);
	        	switch(cadena){
	        		case 'a':	case 'e':	case 'i':
	        		case 'o':	case 'u':	case 'A':
	        		case 'E':	case 'I':	case 'O':
	        		case 'U':	
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



