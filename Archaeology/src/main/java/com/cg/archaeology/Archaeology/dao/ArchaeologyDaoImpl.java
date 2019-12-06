/*package com.cg.archaeology.Archaeology.dao;

import com.cg.archaeology.Archaeology.model.Archaeology;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

@Repository
public class ArchaeologyDaoImpl implements ArchaeologyDao {

    HashMap<Integer, Archaeology> hashMap = new HashMap<Integer, Archaeology>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Archaeology archaeology1 = new Archaeology(1,"Mahabodhi Temple","enlightment of the Buddha","good","Bodhgaya, Bihar",formatter.parse("21/11/2000"));

    Archaeology archaeology2 = new Archaeology(2,"Aga Khan Palace","charity by the sultan","very good","Pune, Maharashtra",formatter.parse("01/10/1892"));

    Archaeology archaeology3 = new Archaeology(3,"Amer fort","known for artistic style elements","good","Jaipur, Rajsthan",formatter.parse("21/11/2000"));

    Archaeology archaeology4 = new Archaeology(4,"Konark Sun Temple","dedicated to the hindu sun god Surya","good","Konark, Odisha",formatter.parse("20/08/1984"));

    Archaeology archaeology5 = new Archaeology(5,"Taj Mahal","located on the banks of river yamuna","good","Agra, UP",formatter.parse("01/12/1632"));

    Archaeology archaeology6 = new Archaeology(6,"Victoria Memorial","dedicated to the memory of Queen Victoria","good","Kolkata, West Bengal",formatter.parse("21/11/1910"));
    public ArchaeologyDaoImpl() throws ParseException {
        hashMap.put(1,archaeology1);
        hashMap.put(2,archaeology2);
        hashMap.put(3,archaeology3);
        hashMap.put(4,archaeology4);
        hashMap.put(5,archaeology5);
        hashMap.put(6,archaeology6);
    }
    @Override
    public HashMap<Integer, Archaeology> viewAllArchaeologies() {

        for (Integer key: hashMap.keySet()) {

            System.out.println("id : " + key);

            System.out.println("Name: " + hashMap.get(key).getName());

            System.out.println("Description: " + hashMap.get(key).getDesc());

            System.out.println("Condition" + hashMap.get(key).getCondition());

            System.out.println("Condition" + hashMap.get(key).getCondition());

            System.out.println("Location" + hashMap.get(key).getLocation());

            System.out.println("Date" + hashMap.get(key).getDate());

        }
        return hashMap;
    }

    @Override
    public Archaeology viewArchaeologyById(int id) {

        Archaeology arch = hashMap.get(id);
        return arch;
    }

    @Override
    public boolean updateArchaeologyById(Archaeology archaeology, int id) {
        archaeology.setId(id);
        Archaeology arch = hashMap.replace(archaeology.getId(), archaeology);
        if(arch == null)
            return false;
        return true;
    }

    @Override
    public boolean deleteArchaeologyById(int id) {
        if(hashMap.remove(id)!=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean createArchaeology(Archaeology archaeology) {
        Archaeology arch = hashMap.put(archaeology.getId(), archaeology);
        if(arch == null)
            return true;
        return false;
    }
}
*/