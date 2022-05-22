package model;

import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

public class Concessionaire{
    
	/**
    *  Description: this var its the arrayList of vehicules
    * */
    private ArrayList<Vehicule> vehicules;

    
	/**
    *  Description: this var its the array of documents for the
    * */
    protected Document [] documentsConsesionaire;

    public Concessionaire(){

        vehicules= new ArrayList<Vehicule>();

        documentsConsesionaire= new Document[3];
    }


	public Concessionaire(ArrayList<Vehicule> vehicules) {
        this.vehicules=vehicules;
    }

    /**
    *  Description: Method to add a gasoline car in the arrayList
    *@param id <id>, must be initialized
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeGasolin <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <int>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param tankCapacity <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Gasoline
    public void addGasolineAutomobile(int id, int typeVehicule, int typeAutomobil, int typeGasolin, double basePrice, double soldPrice, String mark, int model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double tankCapacity,
            double consumption, double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPEGASOLINE typeGasoline;
                TYPEVEHICULE type;
                
                Gasoline car;



                switch(typeGasolin) {

                    case 1:
                        typeGasoline=TYPEGASOLINE.EXTRA;


    
                        break;
                    case 2:
                        typeGasoline=TYPEGASOLINE.CURRENT;
    
                        break;

                    case 3:
                        typeGasoline=TYPEGASOLINE.DIESEL;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeGasoline=TYPEGASOLINE.DIESEL;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;


    
                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;


    
                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC =new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Gasoline(id, basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, tankCapacity, typeGasoline, consumption);
                        vehicules.add(car);
        }

            
	/**
    *  Description: Method to add a electric car in the arrayList
        *@param id <id>, must be initialized
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeCharge <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <int>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param duration <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Electric
    public void addElectricAutomobile(int id, int typeVehicule, int typeAutomobil, int typeCharge, double basePrice, double soldPrice, String mark, int model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double duration, double consumption,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPECHARGER typeCharger;
                TYPEVEHICULE type;
                
                Electric car;


                switch(typeCharge) {

                    case 1:
                        typeCharger=TYPECHARGER.FAST;



                        break;
                    case 2:
                        typeCharger=TYPECHARGER.NORMAL;

                        break;

                    default:
                        System.out.println("Error");
                        typeCharger=TYPECHARGER.NORMAL;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;



                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;

                        break;

                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Electric(id, basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, typeCharger, duration, consumption);
                        vehicules.add(car);

    }

                
	/**
    *  Description: Method to add a hybrid car in the arrayList
     * @param id <id>, must be initialized
	 * @param typeVehicule <int>, must be initialized
	 * @param typeAutomobil <int>, must be initialized
	 * @param typeCharge <int>, must be initialized
     * @param typeGasolin <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <int>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param numOfDoors <int>, must be initialized
     * @param polarized <String>, must be initialized
     * @param duration <double>, must be initialized
     * @param consumptionElectric <double>, must be initialized
     * @param tankCapacity <double>, must be initialized
     * @param consumptionGas <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */
    
    //Hybrid
    public void addHybridAutomobile(int id, int typeVehicule, int typeAutomobil, int typeCharge, int typeGasolin, double basePrice, double soldPrice, String mark, int model, 
            double cylinderCapacity, double milage, String plate, int numOfDoors, String polarized, double duration, double consumptionElectric,double tankCapacity,double consumptionGas,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEAUTOMOBILE typeAutomobiles;
                TYPECHARGER typeCharger;
                TYPEVEHICULE type;
                TYPEGASOLINE typeGasoline;
                
                Hybrid car;


                switch(typeGasolin) {

                    case 1:
                        typeGasoline=TYPEGASOLINE.EXTRA;


    
                        break;
                    case 2:
                        typeGasoline=TYPEGASOLINE.CURRENT;
    
                        break;

                    case 3:
                        typeGasoline=TYPEGASOLINE.DIESEL;
    
                        break;
    
                    default:
                        System.out.println("Error");
                        typeGasoline=TYPEGASOLINE.EXTRA;
                }

                switch(typeCharge) {

                    case 1:
                        typeCharger=TYPECHARGER.FAST;



                        break;
                    case 2:
                        typeCharger=TYPECHARGER.NORMAL;

                        break;

                    default:
                        System.out.println("Error");
                        typeCharger=TYPECHARGER.FAST;
                }

                switch(typeAutomobil) {

                    case 1:
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;



                        break;
                    case 2:
                        typeAutomobiles=TYPEAUTOMOBILE.PICKUP;

                        break;

                    default:
                        System.out.println("Error");
                        typeAutomobiles=TYPEAUTOMOBILE.SEDAN;
                }
                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.NEW;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);

                        car= new Hybrid(id, basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeAutomobiles, numOfDoors, polarized, tankCapacity, typeGasoline, consumptionGas, typeCharger, duration, consumptionElectric);
                        vehicules.add(car);
    }

                    
	/**
    *  Description: Method to add a motorcycle in the arrayList
        *@param id <id>, must be initialized
	 * @param typeVehicule <int>, must be initialized
	 * @param typeMotorcy <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <int>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param capacityGasoline <double>, must be initialized
     * @param consumption <double>, must be initialized
     * @param priceProperty <double>, must be initialized
     * @param yearProperty <int>, must be initialized
     * @param priceSoat <double>, must be initialized
     * @param yearSoat <int>, must be initialized
     * @param coverageSoat <double>, must be initialized
     * @param priceReview <double>, must be initialized
     * @param yearReview <int>, must be initialized
     * @param gasLevesReview <double>, must be initialized
    * */

    //Motorcycle
    public void addMotorVehicule(int id, int typeVehicule, int typeMotorcy, double basePrice, double soldPrice, String mark, int model, 
            double cylinderCapacity, double milage, String plate, double capacityGasoline, double consumption,
            double priceProperty, int yearProperty, double priceSoat, int yearSoat, double coverageSoat, double priceReview, int yearReview,
            double gasLevesReview){

                TYPEMOTORCYCLE typeMotorcycle;
                TYPEVEHICULE type;
                
                Motorcycle motorcycle;



                switch(typeMotorcy) {

                    case 1:
                        typeMotorcycle=TYPEMOTORCYCLE.STANDARD;



                        break;
                    case 2:
                        typeMotorcycle=TYPEMOTORCYCLE.SPORTY;

                        break;

                    case 3:
                        typeMotorcycle=TYPEMOTORCYCLE.SCOOTER;

                        break;
                        
                    case 4:
                        typeMotorcycle=TYPEMOTORCYCLE.CROSS;

                    break;

                    default:
                        System.out.println("Error");
                        typeMotorcycle=TYPEMOTORCYCLE.CROSS;
                }

                        
                switch(typeVehicule) {

                    case 1:
                        type=TYPEVEHICULE.NEW;



                        break;
                    case 2:
                        type=TYPEVEHICULE.USED;

                        break;

                    default:
                        System.out.println("Error");
                        type=TYPEVEHICULE.USED;
                }

                        Document propertyC=new Document(priceProperty, yearProperty);
                        Soat soat=new Soat(priceSoat, yearSoat, coverageSoat);
                        MechanicalReview mechanical=new MechanicalReview(priceReview, yearReview, gasLevesReview);
                        motorcycle= new Motorcycle(id, basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical, typeMotorcycle, capacityGasoline, consumption);
                        vehicules.add(motorcycle);
        }


    /**
    *  Description: Method to print the information of the vehicules
	 * @param typeVehicule <int>, must be initialized
     * @param typeCombustible <int>, must be initialized
     * */    
    //PRINT INFORMATION
    public void printVehiculeInformation(int typeVehicule, int typeCombustible){

        int contGasolineCars=0, countElectricCars=0, countHibridCars=0, countMotorcycle=0;

        System.out.println("***CARS***");

        switch(typeVehicule){

            case 1:

                switch(typeCombustible){

                    case 1:

                        //GASOLINE CARS
                        //NEW

                        System.out.println("**NEW GASOLINE CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Gasoline && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Gasoline)vehicules.get(i)).toString());
                                contGasolineCars++;
                            }

                        }
                        if(contGasolineCars==0){
                            System.out.println("The concessionaire dont have New Gasoline cars");
                            
                        }
                        contGasolineCars=0;


                        //USED

                        System.out.println("");
                        System.out.println("**USED GASOLINE CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Gasoline && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Gasoline)vehicules.get(i)).toString());
                                contGasolineCars++;
                            }

                        }
                        if(contGasolineCars==0){
                            System.out.println("The concessionaire dont have Used Gasoline cars");

                        }


                    break;

                    case 2:
                        //ElECTRIC CARS
                        //NEW

                        System.out.println("");
                        System.out.println("**NEW ELECTRIC CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Electric && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Electric)vehicules.get(i)).toString());
                                countElectricCars++;
                            }

                        }
                        if(countElectricCars==0){
                            System.out.println("The concessionaire dont have New Electric cars");
                            

                        }
                        countElectricCars=0;

                        //USED

                        System.out.println("");
                        System.out.println("**USED ELECTRIC CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Electric && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Electric)vehicules.get(i)).toString());
                                countElectricCars++;
                            }

                        }
                        if(countElectricCars==0){
                            System.out.println("The concessionaire dont have Used Electric cars");
                        }

        

                    break;

                    case 3:
                    
                        
                        //HYBRID CARS
                        //NEW

                        System.out.println("");
                        System.out.println("**NEW HYBRID CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Hybrid && comparedVehicule==TYPEVEHICULE.NEW){
                                System.out.println(((Hybrid)vehicules.get(i)).toString());
                                countHibridCars++;
                            }

                        }
                        if(countHibridCars==0){
                            System.out.println("The concessionaire dont have New Hybrid cars");

                        }
                        countHibridCars=0;

                        //USED

                        System.out.println("");
                        System.out.println("**USED HYBRID CARS**");
                        System.out.println("");
                        for(int i=0; i < vehicules.size(); i++){
                            
                            TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                            if(vehicules.get(i) instanceof Hybrid && comparedVehicule==TYPEVEHICULE.USED){
                                System.out.println(((Hybrid)vehicules.get(i)).toString());
                                countHibridCars++;
                            }


                        }
                        if(countHibridCars==0){
                            System.out.println("The concessionaire dont have Used Hybrid cars");
                        }


                    break;

                    default:

                    System.out.println("Not valid value");
                }



            break;

            case 2:
            
                //MOTORCYCLE


                System.out.println("***MOTORCYCLES***");

                //NEW

                System.out.println("**NEW MOTORCYCLES**");
                System.out.println("");
                for(int i=0; i < vehicules.size(); i++){
                    
                    TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                    if(vehicules.get(i) instanceof Motorcycle && comparedVehicule==TYPEVEHICULE.NEW){
                        System.out.println(((Motorcycle)vehicules.get(i)).toString());
                        countMotorcycle++;
                    }

                }
                if(countMotorcycle==0){
                    System.out.println("The concessionaire dont have New Motorcycles");
                    
                }
                countMotorcycle=0;


                //USED

                System.out.println("");
                System.out.println("**USED MOTORCYCLES**");
                System.out.println("");
                for(int i=0; i < vehicules.size(); i++){
                    
                    TYPEVEHICULE comparedVehicule = vehicules.get(i).getType();
                    if(vehicules.get(i) instanceof Motorcycle && comparedVehicule==TYPEVEHICULE.USED){
                        System.out.println(((Motorcycle)vehicules.get(i)).toString());
                        countMotorcycle++;
                    }

                }
                if(countMotorcycle==0){
                    System.out.println("The concessionaire dont have Used Motorcycles");

                }
            

            break;


            default:

            System.out.println("Not valid value");
        }

       
  

        
    }

    /**
     * Description: This method print the information of a car by the id inserted for the user
     * @param id
     */
    
    public void showDocumentsStateForId(int id){
        boolean breaker =false;
        Soat soat;
        MechanicalReview mechanical;
        Document propertyC;
        String documentsCode="";
        for (int i=0; i<vehicules.size() && breaker==false;i++ ){

            if(vehicules.get(i).getId()==id){
                breaker=true;

                //gasoline
                if(vehicules.get(i) instanceof Gasoline){
                    soat= ((Gasoline) vehicules.get(i)).getSoat();
                    mechanical=((Gasoline) vehicules.get(i)).getMechanical();
                    propertyC=((Gasoline) vehicules.get(i)).getPropertyC();

                    //if to verify if the soat its current
                    if(soat.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its current");
                        
                        documentsCode+= "The soat code is: " + soat.getCode() + "\n";


                    }else if(soat.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its not current");

                        documentsCode+= "The soat code is: DONT HAVE SOAT "+"\n";
                    }

                    //if to verify if the mechanical review its current
                    if(mechanical.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: " + mechanical.getCode() + "\n";

                    }else if(mechanical.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: DONT HAVE MECHANICAL REVIEW" + "\n";
                    }

                    
                    //if to verify if the property card its current
                    if(propertyC.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The property card its current");
                        System.out.println(" ");
                        documentsCode+= "The property card code is: " + propertyC.getCode() + "\n";

                    }else if(propertyC.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The Property card its not current");
                        documentsCode+= "The Property card code is: DONT HAVE PROPERTY CARD " + "\n";
                    }

                } 

                
                //Electric
                if(vehicules.get(i) instanceof Electric){
                    soat= ((Electric) vehicules.get(i)).getSoat();
                    mechanical=((Electric) vehicules.get(i)).getMechanical();
                    propertyC=((Electric) vehicules.get(i)).getPropertyC();

                    //if to verify if the soat its current
                    if(soat.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its current");
                        
                        documentsCode+= "The soat code is: " + soat.getCode() + "\n";


                    }else if(soat.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its not current");

                        documentsCode+= "The soat code is: DONT HAVE SOAT "+"\n";
                    }

                    //if to verify if the mechanical review its current
                    if(mechanical.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: " + mechanical.getCode() + "\n";

                    }else if(mechanical.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: DONT HAVE MECHANICAL REVIEW" + "\n";
                    }

                    
                    //if to verify if the property card its current
                    if(propertyC.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The property card its current");
                        System.out.println(" ");
                        documentsCode+= "The property card code is: " + propertyC.getCode() + "\n";

                    }else if(propertyC.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The Property card its not current");
                        documentsCode+= "The Property card code is: DONT HAVE PROPERTY CARD " + "\n";
                    }

                } 

                
                //Hybrid
                if(vehicules.get(i) instanceof Hybrid){
                    soat= ((Hybrid) vehicules.get(i)).getSoat();
                    mechanical=((Hybrid) vehicules.get(i)).getMechanical();
                    propertyC=((Hybrid) vehicules.get(i)).getPropertyC();

                    //if to verify if the soat its current
                    if(soat.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its current");
                        
                        documentsCode+= "The soat code is: " + soat.getCode() + "\n";


                    }else if(soat.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its not current");

                        documentsCode+= "The soat code is: DONT HAVE SOAT "+"\n";
                    }

                    //if to verify if the mechanical review its current
                    if(mechanical.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: " + mechanical.getCode() + "\n";

                    }else if(mechanical.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: DONT HAVE MECHANICAL REVIEW" + "\n";
                    }

                    
                    //if to verify if the property card its current
                    if(propertyC.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The property card its current");
                        System.out.println(" ");
                        documentsCode+= "The property card code is: " + propertyC.getCode() + "\n";

                    }else if(propertyC.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The Property card its not current");
                        documentsCode+= "The Property card code is: DONT HAVE PROPERTY CARD " + "\n";
                    }

                } 

                
                //Motorcycle
                if(vehicules.get(i) instanceof Motorcycle){
                    soat= ((Motorcycle) vehicules.get(i)).getSoat();
                    mechanical=((Motorcycle) vehicules.get(i)).getMechanical();
                    propertyC=((Motorcycle) vehicules.get(i)).getPropertyC();

                    //if to verify if the soat its current
                    if(soat.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its current");
                        
                        documentsCode+= "The soat code is: " + soat.getCode() + "\n";


                    }else if(soat.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**SOAT**");
                        System.out.println("The Soat its not current");

                        documentsCode+= "The soat code is: DONT HAVE SOAT "+"\n";
                    }

                    //if to verify if the mechanical review its current
                    if(mechanical.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: " + mechanical.getCode() + "\n";

                    }else if(mechanical.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**MECHANICAL REVIEW**");
                        System.out.println("The Mechanical review its current");
                        documentsCode+= "The Mechanical review code is: DONT HAVE MECHANICAL REVIEW" + "\n";
                    }

                    
                    //if to verify if the property card its current
                    if(propertyC.getYear()!=0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The property card its current");
                        System.out.println(" ");
                        documentsCode+= "The property card code is: " + propertyC.getCode() + "\n";

                    }else if(propertyC.getYear()==0){
                        System.out.println(" ");
                        System.out.println("**PROPERTY CARD**");
                        System.out.println("The Property card its not current");
                        documentsCode+= "The Property card code is: DONT HAVE PROPERTY CARD " + "\n";
                    }

                } 
                
                

            }
                System.out.println("");                                   
                System.out.println("**THE DOCUMENTS CODES**");
                System.out.println(documentsCode);

        }



    }
    
    /**
     * Description: This method print the parking with the ocupation percentage
     */

    public void printParkingLot(){
        String parking ="___________ ___________ ___________ ___________ ___________\n"+
                        "|   2014   ||   2013   ||   2012   ||   2011   ||   <2011  |\n"+
                        "----------- ----------- ---------- ----------- -----------\n";
        boolean comparate=false;
        int fourteen=0, thirdteen=0, twelve=0, eleven=0, elevenLow=0;
        double ocupationPercentage=0;

        for(int i=0; i<vehicules.size(); i++){

            //2014
            if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2014 && fourteen!=10){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    fourteen++;
                    
                }
        
            }

            //2013
            if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2013 && thirdteen!=10){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    thirdteen++;
                    
                }
        
            }

            //2012
            if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2012 && twelve!=10){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    twelve++;
                    
                }
        
            }

            //2011
            if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2011 && eleven!=10){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    eleven++;
                    
                }
        
            }

            //-2011
            if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()<2011 && elevenLow!=10){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    elevenLow++;
                    
                }
            }
        }

        //calculate the ocupation percentage
        ocupationPercentage=fourteen+thirdteen+twelve+eleven+elevenLow;
        ocupationPercentage=ocupationPercentage/50;
        ocupationPercentage=ocupationPercentage*100;
        


        for(int i=0; i<10; i++){

            //2014
            if(fourteen>0){
                parking+="|    C     |";
                fourteen--;
            }else{
                parking+="|          |";
            }

            //2013
            if(thirdteen>0){
                parking+="|    C     |";
                thirdteen--;
            }else{
                parking+="|          |";
            }

            //2012
            if(twelve>0){
                parking+="|    C     |";
                twelve--;
            }else{
                parking+="|          |";
            }

            //2011
            if(eleven>0){
                parking+="|    C     |";
                eleven--;
            }else{
                parking+="|          |";
            }

            //-2011
            if(elevenLow>0){
                parking+="|    C     |\n"+"----------- ----------- ---------- ----------- -----------\n";
                elevenLow--;
            }else{
                parking+="|          |\n"+"----------- ----------- ---------- ----------- -----------\n";
            }  

        }

        System.out.println(parking);
        
        System.out.println("");
        if(ocupationPercentage<100){
        System.out.println("The ocupation percentage of the parking is: " + ocupationPercentage+"%");
        }else{
            System.out.println("The ocupation percentage of the parking is: " + ocupationPercentage+"%\n"+"The parking need a expansion");
        }
         
        
    }

    /**
     * Description: This method receives two years and between then search cars in the parking to print they information
     * @param year1
     * @param year2
     */

    public void vehiclesByYearRange(int year1, int year2){

        int necesaryYears=year1-year2;
        if(necesaryYears==0){
            necesaryYears=1;
        }
        int fourteen=0, thirdteen=0, twelve=0, eleven=0, elevenLow=0;
        
        for(int j =0; year2<=year1;year2++){
            
            if(year2>2015 || year2==0){
                System.out.println("");
                System.out.println("The parking dont have cars of the model: " + year2);
            }  
            for(int i=0; i<vehicules.size();i++){ 

                
                if(year2==2014){

                    //2014
                    if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2014 && fourteen!=10){

                        if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                        || vehicules.get(i) instanceof Hybrid ){
                            System.out.println("");
                            System.out.println("The 2014 car information: \n"+vehicules.get(i).toString());
                            
                        fourteen++;   
                            
                        }
                
                    }
                }

                if(year2==2013){            
                    //2013
                    if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2013 && thirdteen!=10){

                        if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                        || vehicules.get(i) instanceof Hybrid ){
                            System.out.println("");
                            System.out.println("The 2013 car information: \n"+vehicules.get(i).toString());
                            
                            thirdteen++;
                            
                        }
                
                    }
                }

                if(year2==2012){ 
                    //2012
                    if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2012 && twelve!=10){

                        if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                        || vehicules.get(i) instanceof Hybrid ){
                            System.out.println("");
                            System.out.println("The 2012 car information: \n"+vehicules.get(i).toString());
                            
                            twelve++;
                            
                        }
                
                    }
                }

                if(year2==2011){ 
                    //2011
                    if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()==2011 && eleven!=10){

                        if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                        || vehicules.get(i) instanceof Hybrid ){
                            System.out.println("");
                            System.out.println("The 2011 car information: \n"+vehicules.get(i).toString());
                
                            eleven++;
                            
                        }
                
                    }
                }

                if(year2<2011){ 
                    //-2011
                    if(vehicules.get(i).getType()==TYPEVEHICULE.USED && vehicules.get(i).getModel()<2011 && elevenLow!=10){

                        if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                        || vehicules.get(i) instanceof Hybrid ){
                            System.out.println("");
                            System.out.println("The under 2011 car information: \n"+vehicules.get(i).toString());
               
                            elevenLow++;
                            
                        }
                    }
                }
             }

 

        }





        

    }

    /**
     * Description: This method search the oldest car in the parking used a for 
     */

    public void theOldsCarInTheParking(){
        String printer="";
        int numModel=-1;

        for(int i=0; i<vehicules.size() && i<50; i++){
            if(vehicules.get(i)!=null && vehicules.get(i).getType()==TYPEVEHICULE.USED){

                if(vehicules.get(i) instanceof Gasoline || vehicules.get(i) instanceof Electric 
                || vehicules.get(i) instanceof Hybrid ){
                    if(vehicules.get(i).getModel()<numModel || numModel==-1){
                        numModel=vehicules.get(i).getModel();
                        printer="The olds car in the parking is the car with the id: \n"+ vehicules.get(i).toString();

                    }

                }

            }

        }

        System.out.println(printer);

    }



}
