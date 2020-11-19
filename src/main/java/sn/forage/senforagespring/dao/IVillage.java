package sn.forage.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.forage.senforagespring.entities.Village;

@Repository
public interface IVillage extends JpaRepository<Village, Integer> {
	
	@Query("SELECT v FROM Village v WHERE v.nom=:nm")
	public Village getVillageByNom(@Param (value = "nm")String nom );


}
