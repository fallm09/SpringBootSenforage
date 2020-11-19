package sn.forage.senforagespring.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.forage.senforagespring.entities.Clients;

@Repository
public interface IClients extends JpaRepository<Clients, Integer> {
	
/*	@Query("SELECT c FROM Clients WHERE c.nom=:nm AND c.prenom=:prnm")
	public Clients getClientsByNomAndPrenom(@Param (value = "nm")String nom ,@Param (value = "prnm")String prenom);*/

}
