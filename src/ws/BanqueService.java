package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class BanqueService {

	public double conversionEuroDollar(double montant){
		return montant * 1.09;
	}
	
	public Compte getCompte(int code){
		Compte c = new Compte();
		c.setCode(code);
		c.setDateCreation(new Date());
		c.setSolde(10000);
		return c;
	}
	
	public List<Compte> getComptes(){
		List<Compte> cptes = new ArrayList<Compte>();
		
		Compte c1 = new Compte();
		c1.setCode(2);
		c1.setDateCreation(new Date());
		c1.setSolde(2000);
		
		Compte c2 = new Compte();
		c2.setCode(3);
		c2.setDateCreation(new Date());
		c2.setSolde(3000);
		
		cptes.add(c1);
		cptes.add(c2);
		
		return cptes;
	}
}
