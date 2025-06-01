package tokolaptop.controllers;

import java.util.List;
import tokolaptop.helper.DBHelper;
import tokolaptop.models.Laptop;

public class LaptopDAO {
    public static List<Laptop> getAll(){
        return DBHelper.getAllLaptops();
    }
    
    public static boolean insert(Laptop l){
        return DBHelper.insertLaptop(l);
    }
    
    public static boolean update(Laptop l){
        return DBHelper.updateLaptop(l);
    }
    
    public static boolean delete(String id){
        return DBHelper.deleteLaptop(id);
    }
}
