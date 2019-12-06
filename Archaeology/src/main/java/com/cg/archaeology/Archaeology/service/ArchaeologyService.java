package com.cg.archaeology.Archaeology.service;

import com.cg.archaeology.Archaeology.model.Archaeology;

import java.util.Collection;
import java.util.HashMap;

public interface ArchaeologyService {
    public Collection<Archaeology> viewAllArchaeologies();
    public Archaeology viewArchaeologyById(int id);
    public void updateArchaeologyById(Archaeology archaeology);
    public void deleteArchaeologyById(int id);
    public void createArchaeology(Archaeology archaeology);
}
