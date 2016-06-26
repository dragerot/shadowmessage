package net.toregard.service;


import net.toregard.model.BaatPlass;
import org.springframework.stereotype.Service;

import java.util.List;


public class BaatPlassServiceImpl implements BaatPlassService{
    @Override
    public List<BaatPlass> getAll() {
        return null;
    }

    @Override
    public int calcBaatPlass() {
        return getAll().size();
    }
}
