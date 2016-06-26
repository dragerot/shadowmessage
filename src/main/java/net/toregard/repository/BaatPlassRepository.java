package net.toregard.repository;


import net.toregard.model.BaatPlass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaatPlassRepository extends JpaRepository<BaatPlass, String> {
    //public List<BaatPlass> findall();
}
