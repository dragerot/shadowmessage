package net.toregard.service;


import net.toregard.model.BaatPlass;

import java.util.List;

public interface BaatPlassService {
    List<BaatPlass> getAll();
    int calcBaatPlass();
}
