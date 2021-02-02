package esercizio_base_4;

public class SalutatoreFormale implements Salutatore{

	@Override
	public String salutaMattino(String name) {
		// TODO Auto-generated method stub
		return "Buongiorno signor "+name;
	}

	@Override
	public String salutaSera(String name) {
		// TODO Auto-generated method stub
		return "Le auguro una buona serata signor "+name;
	}

	@Override
	public String salutaNotte(String name) {
		// TODO Auto-generated method stub
		return "Buonanotte signor "+name;
	}

}
