package esercizi_base_1;
import prog.io.ConsoleInputManager;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsoleInputManager in = new ConsoleInputManager();
		int x=in.readInt("inserisci un numero intero ");
		int y=in.readInt("inserisci un numero intero ");
		
		System.out.println("La somma dei due numeri è: "+(x+y));

	}

}
