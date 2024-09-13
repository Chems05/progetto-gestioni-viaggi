package Repositories;

import Entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Integer> {
    List<Viaggio> findByStato(String stato);

}
