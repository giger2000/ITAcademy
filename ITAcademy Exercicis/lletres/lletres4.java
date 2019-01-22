
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * l'Usuari indica el seu nom a la llista, i l'algoritme resol
 * si és VOVAL, CONSONANT o número.
 * */
public class lletres4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> userName = new ArrayList<Character>();
		userName.add('A');
		userName.add('L');
		userName.add('B');
		userName.add('E');
		userName.add('R');
		userName.add('T');
		
		List<Character> userSurname = new ArrayList<Character>();
		userSurname.add('C');
		userSurname.add('O');
		userSurname.add('R');
		userSurname.add('R');
		userSurname.add('A');
		userSurname.add('L');
		List<Character> fullName = new ArrayList<Character>();
		
		for (int i = 0; i < userName.size(); i++) {
			
			fullName.add(i,userName.get(i));

		}
		
		fullName.add((userName.size()),' ');  //afegim espai en blanc
		
		for (int j = 0; j < userSurname.size(); j++) {
			
			fullName.add((fullName.size()),userSurname.get(j));

		}
		
		
		Iterator<Character> itFullName = fullName.iterator();
		while(itFullName.hasNext()){
			Character elemento = itFullName.next();
			System.out.print(elemento+" / ");
		}
		
	}
		
}