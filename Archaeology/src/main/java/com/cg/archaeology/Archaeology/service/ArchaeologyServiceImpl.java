package com.cg.archaeology.Archaeology.service;


import com.cg.archaeology.Archaeology.model.Archaeology;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;

@Service("siteService")
public class ArchaeologyServiceImpl  implements ArchaeologyService{

    //ArchaeologyDao dao = new ArchaeologyDaoImpl();
    public HashMap<Integer, Archaeology> hashMap = new HashMap<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Archaeology archaeology1 = new Archaeology(1,"Mahabodhi Temple","enlightment of the Buddha","good","Bodhgaya, Bihar",formatter.parse("21/11/2000"));

    Archaeology archaeology2 = new Archaeology(2,"Aga Khan Palace","charity by the sultan","very good","Pune, Maharashtra",formatter.parse("01/10/1892"));

    Archaeology archaeology3 = new Archaeology(3,"Amer fort","known for artistic style elements","good","Jaipur, Rajsthan",formatter.parse("21/11/2000"));

    Archaeology archaeology4 = new Archaeology(4,"Konark Sun Temple","dedicated to the hindu sun god Surya","good","Konark, Odisha",formatter.parse("20/08/1984"));

    Archaeology archaeology5 = new Archaeology(5,"Taj Mahal","located on the banks of river yamuna","good","Agra, UP",formatter.parse("01/12/1632"));

    Archaeology archaeology6 = new Archaeology(6,"Victoria Memorial","dedicated to the memory of Queen Victoria","good","Kolkata, West Bengal",formatter.parse("21/11/1910"));
    public ArchaeologyServiceImpl() throws ParseException {

        hashMap.put(1,archaeology1);
        hashMap.put(2,archaeology2);
        hashMap.put(3,archaeology3);
        hashMap.put(4,archaeology4);
        hashMap.put(5,archaeology5);
        hashMap.put(6,archaeology6);

    }

    @Override
    public Collection <Archaeology> viewAllArchaeologies() {

        return hashMap.values();
    }

    @Override
    public Archaeology viewArchaeologyById(int id) {
       return hashMap.get(id);
    }

    @Override
    public void updateArchaeologyById(Archaeology archaeology) {
        hashMap.put(archaeology.getId(), archaeology);
    }

    @Override
    public void deleteArchaeologyById(int id) {
         hashMap.remove(id);
    }

    @Override
    public void createArchaeology(Archaeology archaeology) {
        hashMap.put(archaeology.getId(), archaeology);
    }
}
