package ui; 

import model.*;
import java.util.ArrayList; 

public class Init {
    
    public Init() { }

    public ArrayList<Vehicule> initVehicules(){
        ArrayList <Vehicule> vehicules = new ArrayList<Vehicule>();

        Soat soat1 = new Soat(2000, 2022, 20000);
        Document propertyCard1 = new Document(1300, 2016);
        MechanicalReview mechanicalReview1 = new MechanicalReview(800, 2022, 4);

        
        Soat soat2 = new Soat(0, 0, 0);
        Document propertyCard2 = new Document(0, 0);
        MechanicalReview mechanicalReview2 = new MechanicalReview(1000, 2022, 2);

                
        Soat soat3 = new Soat(1300, 2023, 20000);
        Document propertyCard3 = new Document(2200, 2020);
        MechanicalReview mechanicalReview3 = new MechanicalReview(1200, 2022, 2);

                        
        Soat soat4 = new Soat(2500, 2022, 40000);
        Document propertyCard4 = new Document(2000, 2021);
        MechanicalReview mechanicalReview4 = new MechanicalReview(1300, 2022, 3);

                        
        Soat soat5 = new Soat(1100, 2022, 30000);
        Document propertyCard5 = new Document(1000, 2018);
        MechanicalReview mechanicalReview5 = new MechanicalReview(2600, 2022, 5);
        

        Vehicule newVehicule = new Gasoline(1011,1000, 2000, "Nissan", 2014, 2000, 1200, TYPEVEHICULE.USED, "AB3-203", propertyCard1, soat1, mechanicalReview1, TYPEAUTOMOBILE.SEDAN, 4, "yes", 30, TYPEGASOLINE.CURRENT, 5);
        vehicules.add(newVehicule);

        Vehicule newVehicule2= new Electric(1330,1000, 2000, "Tesla", 2012, 2400, 1000, TYPEVEHICULE.NEW, "AAD-003", propertyCard2, soat2, mechanicalReview2, TYPEAUTOMOBILE.SEDAN, 4, "yes", TYPECHARGER.FAST, 7, 1);
        vehicules.add(newVehicule2);

        Vehicule newVehicule3= new Hybrid(1739,3000, 2000, "Tesla", 2013, 2200, 1400, TYPEVEHICULE.USED, "KEN-110", propertyCard3, soat3, mechanicalReview3, TYPEAUTOMOBILE.PICKUP, 4, "yes", 35, TYPEGASOLINE.EXTRA, 4, TYPECHARGER.NORMAL, 4, 2);
        vehicules.add(newVehicule3);

        Vehicule newVehicule4= new Motorcycle(1099, 3500, 2000, "Yamaha", 2009, 2050, 900, TYPEVEHICULE.USED, "HAH-000", propertyCard4, soat4, mechanicalReview4, TYPEMOTORCYCLE.CROSS, 30, 2);
        vehicules.add(newVehicule4);

        return vehicules;
    }

}