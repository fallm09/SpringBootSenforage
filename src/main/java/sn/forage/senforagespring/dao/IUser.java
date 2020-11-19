package sn.forage.senforagespring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.forage.senforagespring.entities.User;

@Repository
public interface IUser extends JpaRepository<User, Integer> {

}
