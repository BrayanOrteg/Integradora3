package model;

public class MechanicalReview extends Document{
                            
	/**
    *  Description: this var its the gas leves of the mechanical review
    * */
    private double gasLeves;

                            
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
     * @param gasLeves <double>, must be initialized
    * */

    public MechanicalReview(double price, int year, double gasLeves) {
        super(price, year);

        this.gasLeves=gasLeves;

    }

    
    public String mechanicalReviewCode(int[][] numbers) {
        
         code ="";
        int p=0, rest=numbers[0].length-1;
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length

            
                for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
                    
                    if (j==numbers[0].length-1){
                        p=1;
                    }

                    if(p==1 && i!=3){
                        j=rest-i;
                        
                    }else{
                        p=0;
                    }
                    code += numbers[i][j] + " ";

                    if(p==1){
                        j=numbers[0].length-1;
                    }
                }
             }
             return code;
		}
		


    public String toString(){
        int i = getYear();
        
        if(i !=0){
        return "**MECHANICAL REVIEW**\n" + "\nThe price of the document is: "+ price + "\nThe year is: " + year + "\nThe image= \n"+ "\n"+printImage(image) + "\n"+ 
                "\nThe Mechanical review number is: "+ mechanicalReviewCode(image)+"\nThe gas leves of the vehicule are: " + gasLeves;
        }else{
            return "Dont have Mechanical review";
        }
    }
    
}