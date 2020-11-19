package sn.forage.senforagespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.forage.senforagespring.dao.IVillage;
import sn.forage.senforagespring.entities.Clients;
import sn.forage.senforagespring.entities.Village;

@SpringBootApplication
public class SenforagespringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SenforagespringApplication.class, args);
		
		IVillage IVillage = ctx.getBean(IVillage.class);
		Village village = new Village();
		//Clients clients = new Clients ();
		village.setId(1);
		village.setNom("DIAMAGUENE");
		//village.setClients("");
		try {
			IVillage.findAll();
			IVillage.save(village);
			System.out.println("ok");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
