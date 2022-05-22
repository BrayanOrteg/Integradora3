package model;


public class Soat extends Document{
                            
	/**
    *  Description: this var its the coverage of the soat
    * */
    private double coverage;


                        
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
     * @param coverage <double>, must be initialized
    * */
    public Soat(double price, int year, double coverage) {
        super(price, year);

        this.coverage= coverage;
        
    }

    public String soatCode(int[][] numbers) {
        
        code ="";
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length

            if(i== numbers.length-1){
                for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
                    code += numbers[i][j] + " ";
                }
             }else{
                code += numbers[i][0] + " ";
             }
		}
		return code;

    }

    public String toString(){
        int i=getYear();

        if(i !=0){
        return "**SOAT**\n"+ "\nThe price of the document is: "+ price + "\nThe year is: " + year + "\nThe image= \n"+ "\n"+printImage(image) + "\n"
                +"\nThe Soat number is: "+ soatCode(image)+"\nThe coverage of the soat is: " + coverage + "\n";
        }else{
            return "Dont have Soat";
        }
    }
    
}