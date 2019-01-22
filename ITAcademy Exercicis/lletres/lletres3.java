import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lletres3 {

	public static void main(String[] args) {
		
		//Inicialitzem HashMap
		Map<Character,Integer> repetitions=new HashMap<>();
		
		//Inicialitzem llista de caracters
		List<Character> userName = new ArrayList<Character>();
		userName.add('A');
		userName.add('L');
		userName.add('B');
		userName.add('E');
		userName.add('R');
		userName.add('T');
		userName.add('T');
		//Omplim map amb el nom de la llista i inicialitzem el comptador
		for (int i=0;i<userName.size();i++) {
			
			Character letter=userName.get(i);
			
			if (repetitions.get(letter)!=null) { //Si no está buit
				int counter= repetitions.get(letter);
				repetitions.put(letter, ++counter);
				System.out.println("contador: "+counter);
			}else { //Si està buit, posem la lletra i el comptador a 1
				repetitions.put(letter, 1);
			}
		
		}
		
		
		
		//Mostrar informació del MAP
		
		for (Map.Entry<Character, Integer> entry : repetitions.entrySet()) {
		    System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
		}
		
		


	}

}
