package ui;
import model.Concessionaire;

import java.util.Random;
import java.util.Scanner;

/** Main Class - Development of the problem
 * @author BrayanOrtega
 * 
 * */

public class Main{


   private Concessionaire concessionaireCall;
   private Scanner scan;
   
   /**
    * Description: The constructor of the class
    * */
   public Main() {
    Init init = new Init();
      concessionaireCall = new Concessionaire (init.initVehicules());
      scan= new Scanner(System.in);
   }

    public static void main (String [] args) {


      System.out.println("Start the aplication");
      
      Main principal= new Main();
      
      int option=0;
      
      do{
         option= principal.showMenu();
         principal.executeOperation(option);
         
      }while (option!=0);
      
   }


   
   /**
    * Description: Method to do a instruction of the user
    * @param operation <int>
    * */
   public void executeOperation(int operation) {
      
      switch(operation) {
      case 0:
         System.out.println("Bye!");
         break;
      case 1:
        addVehicule();
      
         break;
      case 2:
        printInformation(); 
        
         break;

      case 3:
        printDocumentsInformationForId();

        break;

        case 4:
        printParking();

        break;

        case 5:
        informationBetweenYears();

        break;

        case 6:
        theOldestCar();

        break;


        
      
      default:
         System.out.println("Error, option no valid");
      
      }
   }


   /**
    * Description: method to add a vehicule in the concessionaire
    * */

   public void addVehicule(){

    int id=0, model=0 ,typeMotorcy=0,typeCombustible=0,carOrMoto=0,typeVehicule=0, typeAutomobil=0, typeGasolin=0,typeCharge=0, yearReview=0, numOfDoors=0, yearProperty=0, yearSoat=0;
    double basePrice=0, soldPrice=0, cylinderCapacity=0, milage=0, tankCapacity=0, priceProperty=0, priceSoat=0, coverageSoat=0, priceReview=0, gasLevesReview=0, capacityGasoline=0,
            duration=0, consumptionElectric=0, consumptionGas=0, consumption=0;
    String mark="", plate="", polarized="";

        System.out.println("Register a vehicule");
        System.out.println("Insert the type of the vehicule of add"+"\n (1)Car || (2)Motorcycle");
        carOrMoto=scan.nextInt();
        scan.nextLine();

        id=(int) (Math.random() * 2000);

        //Switch case for if is a car or moto
        switch(carOrMoto){

            //car
            case 1: 
                System.out.println("The vehicule is new(1) or used(2)?");
                typeVehicule=scan.nextInt();
                scan.nextLine();

                //Switch case for if is a new car or used car
                switch(typeVehicule){

                    //new car
                    case 1:

                        // dont ask about milage and plate and others document like soat and property card
                        System.out.println("");
                        System.out.println("Insert the type of automobil: "+ "\n (1)Sedan || (2)Pickup");
                        typeAutomobil=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the base price of the car: ");
                        basePrice=scan.nextDouble();
                        scan.nextLine();


                        System.out.println("");
                        System.out.println("What is the mark of the car?");
                        mark=scan.next();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the model of the car. Example(2001)");
                        model=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the cylinder capacity of the car");
                        cylinderCapacity=scan.nextDouble();
                        scan.nextLine();

                        
                        System.out.println("");
                        System.out.println("Insert the num of doors of the car");
                        numOfDoors=scan.nextInt();
                        scan.nextLine();

                        
                        System.out.println("");
                        System.out.println("The car is polarized? (yes) or (no)");
                        polarized=scan.next();
                        scan.nextLine();



                        System.out.println("");
                        System.out.println("**Documentation of the car:**");
                        System.out.println("Mechanical review");
                        System.out.println("Insert the price:");
                        priceReview=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the year of emission:");
                        yearReview=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the gas leves emissions of the car");
                        gasLevesReview=scan.nextDouble();
                        scan.nextLine();


                        System.out.println("");
                        System.out.println("Insert the type of gasoline: "+ "\n (1) Gasoline || (2) Electric || (3) Hybrid");
                        typeCombustible=scan.nextInt();
                        scan.nextLine();


                        //Switch case for if is a Gasoline, Electric or Hybrid car
                        switch(typeCombustible){

                            //Gasoline car
                            case 1:

                                System.out.println("");
                                System.out.println("Insert the tank capacity of the car");
                                tankCapacity=scan.nextDouble();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the type of galosine"+"\n (1) Extra || (2)Current || (3)Diesel");
                                typeGasolin=scan.nextInt();
                                scan.nextLine();

                                consumptionGas=tankCapacity*(cylinderCapacity/150);

                                concessionaireCall.addGasolineAutomobile(id, typeVehicule, typeAutomobil, typeGasolin, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, tankCapacity, consumptionGas, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);

                            break;
                            
                            //Electric car
                            case 2:

                                System.out.println("");
                                System.out.println("Insert the type of charger"+ "\n (1)Fast || (2)Normal");
                                typeCharge=scan.nextInt();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the duration of the car");
                                duration=scan.nextDouble();
                                scan.nextLine();

                                if(typeCharge==1){
                                    consumptionElectric=(duration+13)*(cylinderCapacity/100);
                                    }else{
                                        consumptionElectric=(duration+18)*(cylinderCapacity/100);
    
                                    }


                                concessionaireCall.addElectricAutomobile(id, typeVehicule, typeAutomobil, typeCharge, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, duration, consumptionElectric, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);
                            

                            break;

                            //Hybrid car
                            case 3:

                            
                                System.out.println("");
                                System.out.println("Insert the tank capacity of the car");
                                tankCapacity=scan.nextDouble();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the type of galosine"+"\n (1) Extra || (2)Current || (3)Diesel");
                                typeGasolin=scan.nextInt();
                                scan.nextLine();

                                consumptionGas=tankCapacity*(cylinderCapacity/180);

                                
                                System.out.println("");
                                System.out.println("Insert the type of charger"+ "\n (1)Fast || (2)Normal");
                                typeCharge=scan.nextInt();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the duration of the car");
                                duration=scan.nextDouble();
                                scan.nextLine();
                                scan.nextLine();

                                if(typeCharge==1){
                                consumptionElectric=duration*(cylinderCapacity/200);
                                }else{
                                    consumptionElectric=(duration+7)*(cylinderCapacity/200);

                                }

                                concessionaireCall.addHybridAutomobile(id, typeVehicule, typeAutomobil, typeCharge, typeGasolin, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, duration, consumptionElectric, tankCapacity, consumptionGas, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);



                            break;

                            default:
                            System.out.println("Error, option no valid");

                        }

                    break;

                    //Used car
                    case 2:
                    

                        System.out.println("");
                        System.out.println("Insert the type of automobil: "+ "\n (1)Sedan || (2)Pickup");
                        typeAutomobil=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the base price of the car: ");
                        basePrice=scan.nextDouble();
                        scan.nextLine();


                        System.out.println("");
                        System.out.println("What is the mark of the car?");
                        mark=scan.next();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the model of the car. Example(2001)");
                        model=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the cylinder capacity of the car");
                        cylinderCapacity=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the milage of the car");
                        milage=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the plate of the car");
                        plate=scan.next();
                        scan.nextLine();

                        
                        System.out.println("");
                        System.out.println("Insert the num of doors of the car");
                        numOfDoors=scan.nextInt();
                        scan.nextLine();

                        
                        System.out.println("");
                        System.out.println("The car is polarized? (yes) or (no)");
                        polarized=scan.next();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("***Documentation of the car:***");
                        System.out.println("Mechanical review");
                        System.out.println("Insert the price:");
                        priceReview=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the year of emission:");
                        yearReview=scan.nextInt();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the gas leves emissions of the car");
                        gasLevesReview=scan.nextDouble();
                        scan.nextLine();

                        
                        if(yearReview<2021){
                            priceReview=0;
                            yearReview=0;
                            gasLevesReview=0;

                            System.out.println("The Mechanical Review is expired, the values convert to 0");

                        }

                        System.out.println("");
                        System.out.println("**Soat**");

                        System.out.println("");
                        System.out.println("The vehicule have soat?  (1)Yes || (2)No");
                        int jaja=scan.nextInt();
                        scan.nextLine();

                        if(jaja==1){
                            
                            System.out.println("Insert the price:");
                            priceSoat=scan.nextDouble();
                            scan.nextLine();
    
                            System.out.println("Insert the year of emission");
                            yearSoat=scan.nextInt();
                            scan.nextLine();
    
    
                            System.out.println("");
                            System.out.println("Insert the coverage");
                            coverageSoat=scan.nextDouble();
                            scan.nextLine();
    
                            
                            if(yearSoat<2021){
                                priceSoat=0;
                                coverageSoat=0;
                                yearSoat=0;
    
                                System.out.println("The soat is expired");
                            }
    
                        }


                        System.out.println("");
                        System.out.println("**Property card**");
                        System.out.println("Insert the price");
                        priceProperty=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("");
                        System.out.println("Insert the year of emission");
                        yearProperty=scan.nextInt();
                        scan.nextLine();



                        System.out.println("");
                        System.out.println("Insert the type of gasoline: "+ "\n (1) Gasoline || (2) Electric || (3) Hybrid");
                        typeCombustible=scan.nextInt();
                        scan.nextLine();


                        //Switch case for if is a Gasoline, Electric or Hybrid car
                        switch(typeCombustible){

                            //Gasoline car
                            case 1:

                                System.out.println("");
                                System.out.println("Insert the tank capacity of the car");
                                tankCapacity=scan.nextDouble();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the type of galosine"+"\n (1) Extra || (2)Current || (3)Diesel");
                                typeGasolin=scan.nextInt();
                                scan.nextLine();

                                consumptionGas=tankCapacity*(cylinderCapacity/150);

                                concessionaireCall.addGasolineAutomobile(id, typeVehicule, typeAutomobil, typeGasolin, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, tankCapacity, consumptionGas, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);

                            break;
                            
                            //Electric car
                            case 2:

                                System.out.println("");
                                System.out.println("Insert the type of charger"+ "\n (1)Fast || (2)Normal");
                                typeCharge=scan.nextInt();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the duration of the car");
                                duration=scan.nextDouble();
                                scan.nextLine();

                                if(typeCharge==1){
                                    consumptionElectric=(duration+13)*(cylinderCapacity/100);
                                    }else{
                                        consumptionElectric=(duration+18)*(cylinderCapacity/100);
    
                                    }

                                concessionaireCall.addElectricAutomobile(id, typeVehicule, typeAutomobil, typeCharge, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, duration, consumptionElectric, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);
                            

                            break;

                            //Hybrid car
                            case 3:

                            
                                System.out.println("");
                                System.out.println("Insert the tank capacity of the car");
                                tankCapacity=scan.nextDouble();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the type of galosine"+"\n (1) Extra || (2)Current || (3)Diesel");
                                typeGasolin=scan.nextInt();
                                scan.nextLine();

                                consumptionGas=tankCapacity*(cylinderCapacity/180);

                                
                                System.out.println("");
                                System.out.println("Insert the type of charger"+ "\n (1)Fast || (2)Normal");
                                typeCharge=scan.nextInt();
                                scan.nextLine();

                                System.out.println("");
                                System.out.println("Insert the duration of the car");
                                duration=scan.nextDouble();
                                scan.nextLine();

                                if(typeCharge==1){
                                consumptionElectric=duration*(cylinderCapacity/200);
                                }else{
                                    consumptionElectric=(duration+7)*(cylinderCapacity/200);

                                }

                                concessionaireCall.addHybridAutomobile(id, typeVehicule, typeAutomobil, typeCharge, typeGasolin, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, numOfDoors, polarized, duration, consumptionElectric, tankCapacity, consumptionGas, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);



                            break;

                            default:
                            System.out.println("Error, option no valid");

                        }

                    break;

                    default:
                    System.out.println("Error, option no valid");

                }


            break;

            //Motorcycle
            case 2:

            System.out.println("The vehicule is new(1) or used(2)?");
            typeVehicule=scan.nextInt();
            scan.nextLine();

            //Switch case for if is a new car or used car
            switch(typeVehicule){

                //new motorcycle
                case 1:

                    // dont ask about milage and plate and others document like soat and property card
                    System.out.println("");
                    System.out.println("Insert the type of motorcycle: "+ "\n (1)Standard || (2)Sporty || (3)Scooter || (4)Cross");
                    typeMotorcy=scan.nextInt();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the base price of the motorcycle: ");
                    basePrice=scan.nextDouble();
                    scan.nextLine();


                    System.out.println("");
                    System.out.println("What is the mark of the motorcycle?");
                    mark=scan.next();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the model of the motorcycle. Example(2001)");
                    model=scan.nextInt();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the cylinder capacity of the motorcycle");
                    cylinderCapacity=scan.nextDouble();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the capacity of gasoline");
                    capacityGasoline=scan.nextDouble();
                    scan.nextLine();
                    
                    consumption=capacityGasoline*(cylinderCapacity/75);
                    

                    System.out.println("");
                    System.out.println("**Documentation of the motorcycle:**");
                    System.out.println("Mechanical review");
                    System.out.println("Insert the price:");
                    priceReview=scan.nextDouble();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the year of emission:");
                    yearReview=scan.nextInt();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the gas leves emissions of the motorcycle");
                    gasLevesReview=scan.nextDouble();
                    scan.nextLine();

                    concessionaireCall.addMotorVehicule(id, typeVehicule, typeMotorcy, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, capacityGasoline, consumption, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);

                    break;
                
                //used motorcycle
                case 2:
                
                    // dont ask about milage and plate and others document like soat and property card
                    System.out.println("");
                    System.out.println("Insert the type of motorcycle: "+ "\n (1)Standard || (2)Sporty || (3)Scooter || (4)Cross");
                    typeMotorcy=scan.nextInt();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the base price of the motorcycle: ");
                    basePrice=scan.nextDouble();
                    scan.nextLine();


                    System.out.println("");
                    System.out.println("What is the mark of the motorcycle?");
                    mark=scan.next();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the model of the motorcycle. Example(2001)");
                    model=scan.nextInt();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the cylinder capacity of the motorcycle");
                    cylinderCapacity=scan.nextDouble();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the capacity of gasoline");
                    capacityGasoline=scan.nextDouble();
                    scan.nextLine();
                    
                    consumption=capacityGasoline*(cylinderCapacity/75);
                    
                    

                    System.out.println("");
                    System.out.println("**Documentation of the motorcycle:**");
                    System.out.println("Mechanical review");
                    System.out.println("Insert the price:");
                    priceReview=scan.nextDouble();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the year of emission:");
                    yearReview=scan.nextInt();
                    scan.nextLine();


                    System.out.println("");
                    System.out.println("Insert the gas leves emissions of the motorcycle");
                    gasLevesReview=scan.nextDouble();
                    scan.nextLine();

                    
                    if(yearReview<2021){
                        priceReview=0;
                        yearReview=0;
                        gasLevesReview=0;

                        System.out.println("The Mechanical Review is expired, the values convert to 0");

                    }

                    System.out.println("");
                    System.out.println("**Soat**");

                    System.out.println("");
                    System.out.println("The vehicule have soat?  (1)Yes || (2)No");
                    int jaja=scan.nextInt();
                    scan.nextLine();

                    if(jaja==1){
                            
                        System.out.println("Insert the price:");
                        priceSoat=scan.nextDouble();
                        scan.nextLine();

                        System.out.println("Insert the year of emission");
                        yearSoat=scan.nextInt();
                        scan.nextLine();


                        System.out.println("");
                        System.out.println("Insert the coverage");
                        coverageSoat=scan.nextDouble();
                        scan.nextLine();

                        
                        if(yearSoat<2021){
                            priceSoat=0;
                            coverageSoat=0;
                            yearSoat=0;

                            System.out.println("The soat is expired");
                        }

                    }


                    System.out.println("");
                    System.out.println("**Property card**");
                    System.out.println("Insert the price");
                    priceProperty=scan.nextDouble();
                    scan.nextLine();

                    System.out.println("");
                    System.out.println("Insert the year of emission");
                    yearProperty=scan.nextInt();
                    scan.nextLine();

                    concessionaireCall.addMotorVehicule(id, typeVehicule, typeMotorcy, basePrice, soldPrice, mark, model, cylinderCapacity, milage, plate, capacityGasoline, consumption, priceProperty, yearProperty, priceSoat, yearSoat, coverageSoat, priceReview, yearReview, gasLevesReview);

                break;


            default:
            System.out.println("Error, option no valid");

            }
        }




    

   }

   
   /**
    * Description: method to print the information of the vehicule
    * */
    public void printInformation(){

        int typeVehicule=0 , typeCombustible=0;


        System.out.println("");
        System.out.println("To consult the information of a vehicule");
        System.out.println("Insert the type of vehicule\n"+ "(1)Car || (2)Motorcycle");
        typeVehicule=scan.nextInt();
        scan.nextLine();

        if(typeVehicule==1){
            System.out.println("");
            System.out.println("Insert the type of combustible\n" + "(1)Gasoline || (2)Electric || (3)Hybrid");
            typeCombustible=scan.nextInt();
            scan.nextLine();

        }

        concessionaireCall.printVehiculeInformation(typeVehicule, typeCombustible);

   }

   /**
    * Description: This method ask for the id and called the method showDocumentsStateForId
    */

   public void printDocumentsInformationForId(){
       int id=0;
        System.out.println(" ");
        System.out.println("CONSULT DOCUMENT INFORMATION BY ID");
        System.out.println("Insert the id of the car");
        id=scan.nextInt();
        scan.nextLine();

        concessionaireCall.showDocumentsStateForId(id);


   }

   
   /**
    * Description: This method call the method printParkingLot in the controler
    */

   public void printParking(){
       concessionaireCall.printParkingLot();
   }

    /**
    * Description: This method call the method vehiclesByYearRange in the controler and ask for the values 
    */

   public void informationBetweenYears(){
       int year1=0, year2=0;
    System.out.println(" ");
    System.out.println("Car information between a range of years");

    System.out.println(" ");
    System.out.println("Insert major year");
    year1=scan.nextInt();
    scan.nextLine();

    System.out.println(" ");
    System.out.println("Insert minor year");
    year2=scan.nextInt();
    scan.nextLine();

    concessionaireCall.vehiclesByYearRange(year1,year2);


    
   }

   /**
    * Description: This method call the method theOldsCarInTheParking in the controler
    */

   public void theOldestCar(){
       concessionaireCall.theOldsCarInTheParking();
   }



   /**
    * Description: Method of the menu option
    * */
       public int showMenu() {
      int option=0;

      System.out.println(
            "\n"+
            "Select a option to start\n" +
            "(1) to add a vehicule\n" +
            "(2) to print the information of the vehicules\n"+
            "(3) Consult documents information of a car by id\n"+
            "(4) Print the parking\n"+
            "(5) Car information between a range of years\n"+
            "(6) The oldest car in the parking\n"+
            "(0) to exit\n"
            );
      option= scan.nextInt();
      scan.nextLine();
      return option;
      }
}