package esercizio_base_4;

public class SalutatoreInformale implements Salutatore{

	@Override
	public String salutaMattino(String name) {
		// TODO Auto-generated method stub
		return "Ben svegliato "+name+", dormito bene?";
	}

	@Override
	public String salutaSera(String name) {
		// TODO Auto-generated method stub
		return "Buonasera informale "+name;
	}

	@Override
	public String salutaNotte(String name) {
		// TODO Auto-generated method stub
		return "Sogni d'oro "+name;
	}

}
