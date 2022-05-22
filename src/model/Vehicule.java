package model;


public abstract class Vehicule{

        
    private int id;
	/**
    *  Description: this var its the base price
    * */
    protected double basePrice;
        
	/**
    *  Description: this var its the sold price
    * */
    protected double soldPrice;
        
	/**
    *  Description: this var its the mark of the vehicule
    * */
    private String mark;
        
	/**
    *  Description: this var its the model of vehicule
    * */
    private int model;
        
	/**
    *  Description: this var its the Cylinder capacity
    * */
    private double cylinderCapacity;
        
	/**
    *  Description: this var its the milage of the vehicule
    * */
    private double milage;
        
	/**
    *  Description: this var its the type
    * */
    protected TYPEVEHICULE type;
        
	/**
    *  Description: this var its the plate of vehicule
    * */
    private String plate;
        
	/**
    *  Description: this var its the array of documents of the vehicule
    * */
    protected Document [] documents;




        
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
    * */


    public Vehicule(int id, double basePrice, double soldPrice, String mark, int model, double cylinderCapacity,
            double milage, TYPEVEHICULE type, String plate, Document propertyC, Soat soat, MechanicalReview mechanical) {

        this.basePrice = basePrice;
        this.id=id;
        this.soldPrice = soldPrice;
        this.mark = mark;
        this.model = model;
        this.cylinderCapacity = cylinderCapacity;
        this.milage = milage;
        this.type = type;
        this.plate = plate;
        documents= new Document[3];

        documents[0]=propertyC;
        documents[1]=soat;
        documents[2]=mechanical;

        
    }

    public int getId(){
        return id;
    }
    
    public int getModel(){
        return model;
    }

    
    public TYPEVEHICULE getType(){
        return type;
    }

    public String toString(){
        String docMsg="";
        
        
        docMsg+= "\n"+ documents[0].toString() + "\n";

        docMsg+= ((Soat)documents[1]).toString() + "\n";
            
        docMsg+= ((MechanicalReview)documents[2]).toString() + "\n";
            
            

        return "\nThe base price of the vehicule is: "+ basePrice + "\nthe mark is: " + mark + "\nThe model is: "+ model + 
        "\nThe cylinder capacity is: " + cylinderCapacity + "\nThe milage is: " + milage + "\nThe type of the vehicule is: " + type + 
        "\nThe plate is: " + plate + "\n" +"\n**The documents*** " +"\n"+ docMsg;    
    }

}