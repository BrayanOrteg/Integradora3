package model;

public class Motorcycle extends Vehicule implements iCalculateTotalSoldPrice {

            
	/**
    *  Description: this var its the type of the motorcycle
    * */
    private TYPEMOTORCYCLE typeMotorcycle;
            
	/**
    *  Description: this var its the capacity of gasoline
    * */
    private double capacityGasoline;
            
	/**
    *  Description: this var its the consumption of the motorcycle
    * */
    private double consumption;
    
    private Soat soat;

    private Document propertyC;

    private MechanicalReview mechanical;



            
	/**
    *  Description: Method constructor
    	 * @param id <int>, must be initialized
	 * @param basePrice <double>, must be initialized 
	 * @param soldPrice <double>, must be initialized
	 * @param mark <String>, must be initialized
	 * @param model <String>, must be initialized 
	 * @param cylinderCapacity <double>, must be initialized
	 * @param milage <double>, must be initialized
     * @param plate <String>, must be initialized
     * @param propertyC <Document>, must be initialized
     * @param soat <Soat>, must be initialized
     * @param mechanical <MechanicalReview>, must be initialized
     * @param typeMotorcycle <TYPEMOTORCYCLE>, must be initialized
     * @param capacityGasoline <double>, must be initialized
     * @param consumption <double>, must be initialized
    * */

    public Motorcycle(int id, double basePrice, double soldPrice, String mark, int model, double cylinderCapacity,
            double milage, TYPEVEHICULE type, String plate, Document propertyC, Soat soat, MechanicalReview mechanical, TYPEMOTORCYCLE typeMotorcycle, double capacityGasoline, double consumption) {
            super(id, basePrice, soldPrice, mark, model, cylinderCapacity, milage, type, plate, propertyC, soat, mechanical);

        this.typeMotorcycle=typeMotorcycle;
        this.capacityGasoline=capacityGasoline;
        this.consumption=consumption;
        this.soat=soat;
        this.propertyC=propertyC;
        this.mechanical=mechanical;
        
    }
    
    /**
     * Description: Method to calculate the total sold price
     * @return<String>
     */
    
    @Override
    public String totalSoldPrice(){
        double totalSold=0;
        int yearSoatt=documents[1].getYear();
        int yearMechanical=documents[2].getYear();
        
        if (yearSoatt==0 || yearMechanical==0){
            totalSold+=500000;
        }
        
        if(type==TYPEVEHICULE.USED){
            basePrice=basePrice-(basePrice*0.02);
        }

        totalSold+=basePrice+(basePrice*0.04);


        return "The total sold price is: "+ totalSold;

    }

    public Soat getSoat(){
        return soat;
    }

    public Document getPropertyC(){
        return propertyC;
    }

    public MechanicalReview getMechanical(){
        return mechanical;
    }

    

    @Override
    public String toString(){
        return super.toString() + "\nThe type of the motorcyle is: " + typeMotorcycle + "\nThe capacity of the gasoline is: " + capacityGasoline +
         "\nThe consumption is: " + consumption + "\n"+ "\n"+totalSoldPrice()+"\nThe id of the vehicule is: " + super.getId();
    }

    
}