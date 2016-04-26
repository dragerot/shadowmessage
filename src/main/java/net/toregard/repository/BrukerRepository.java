package net.toregard.repository;

import net.toregard.model.Bruker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrukerRepository extends JpaRepository<Bruker, String> {
}
