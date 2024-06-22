package br.tulio.repository;

import br.tulio.model.DonoDoPet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonoDoPetRepository extends JpaRepository<DonoDoPet, Integer> { }
