package esercizio_base_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import prog.io.ConsoleInputManager;
import java.io.PrintWriter;
import java.io.FileOutputStream;

import esercizio_base_2.Articolo;

public class LettoreFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Articolo> lista=new ArrayList<Articolo>();
		FileReader file;
		try {
			file = new FileReader("articoli.csv");
			BufferedReader br=new BufferedReader(file);
	        
			for (int i=0; i<10; i++){
				String [] ausiliari=br.readLine().split(";");
				Articolo art=new Articolo();
				art.setId(Integer.parseInt(ausiliari[0]));
				art.setCodice(ausiliari[1]);
				art.setDescrizione(ausiliari[2]);
				art.setQuantita(Integer.parseInt(ausiliari[3]));
				lista.add(art);	
			}
			file.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lista.toString());

		boolean c;
		do {
			ConsoleInputManager in=new ConsoleInputManager();
			c=in.readSiNo("Vuoi inserire un nuovo articolo?");
			if(c==true) {  
			   Articolo artic=new Articolo();
			   artic.setId(in.readInt("Inserisci l'ID "));
			   artic.setCodice(in.readLine("Inserisci il codice "));
			   artic.setDescrizione(in.readLine("Inserisci la descrizione "));
			   artic.setQuantita(in.readInt("Inserisci la quantit� "));
			   lista.add(artic);  
			}
		} while (c==true);
		
		
		File file_II;
		PrintWriter scrittura;
		try {
			file_II=new File("nuovi-articoli.csv");
			scrittura=new PrintWriter(new FileOutputStream(file_II));
			for (int i=0; i<lista.size(); i++) {
				scrittura.write(lista.get(i).toString() + System.lineSeparator());
			}
			System.out.println("scrittura su nuovi-articoli.csv eseguita");
			scrittura.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}