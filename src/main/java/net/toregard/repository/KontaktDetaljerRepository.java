package net.toregard.repository;

import net.toregard.model.KontaktDetaljer;
import net.toregard.model.KontaktDetaljerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontaktDetaljerRepository extends JpaRepository<KontaktDetaljer,String> {
}
