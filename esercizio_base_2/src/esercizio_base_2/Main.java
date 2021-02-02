package esercizio_base_2;
import prog.io.ConsoleInputManager;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsoleInputManager in=new ConsoleInputManager();
		
		ArrayList<Articolo> lista_articoli= new ArrayList<Articolo>();
		
		for (int i=0; i<3; i++) {
			
			Articolo art=new Articolo();
			art.setId((i+1));
			art.setCodice(in.readLine("Inserisci il codice "));
			art.setDescrizione(in.readLine("Inserisci la descrizione "));
			art.setQuantita(in.readInt("Inserisci la quantità "));
			
			lista_articoli.add(art);
		}
		
		Articolo q_max=lista_articoli.get(0);
		for (int i=1; i<lista_articoli.size(); i++) {
			if(lista_articoli.get(i).getQuantita()>q_max.getQuantita()) {
				q_max=lista_articoli.get(i);
			}
		}
		
		System.out.println(q_max.toString());
	}

}
