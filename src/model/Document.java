package model;

import java.util.ArrayList;
import java.lang.Math;

public class Document {
                        
	/**
    *  Description: this var its the price of the document
    * */
    protected double price;
                            
	/**
    *  Description: this var its the year of the document
    * */
    protected int year;
                            
	/**
    *  Description: this var its the image of the document
    * */
    protected int[][] image;

    protected String code;

                        
	/**
    *  Description: Method constructor
	 * @param price <double>, must be initialized 
	 * @param year <int>, must be initialized
    * */
    public Document(double price, int year){
        this.price=price;
        this.year=year;
        this.code=code;
  

        image= new int[4][4];
        for (int i=0;i<4;i++) {
            for (int c=0;c<4;c++ ) {
                image[i][c] = (int)(Math.random()*(100)+1);
            }				
        }
    }

    public String printImage(int[][] numbers) {
		String print ="";
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length
			for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
				print += numbers[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}

    public String propertyCardCode(int[][] numbers){
        code ="";


        for(int i=numbers.length-1; i<numbers.length && i !=-1; i--){
            for(int j=numbers[0].length-1; j<numbers[0].length && j != -1; j--){
                if(i==0 && j==numbers[0].length-2){
                    code+= numbers[i][j] + " ";
                }
                if(i % 2==0 && j % 2 == 0 && i !=0){
                    code+= numbers[i][j] + " ";

                }
                if(i % 2!=0 && j %2 !=0){
                    code+= numbers[i][j] + " ";
                }

            }
        }




        return code;

    }

    public String getCode(){
        return code;
    }

    



    public int getYear(){
        return year;
    }
    

    public String toString(){
        if(year !=0){
        return "\n"+"**PROPERTY CARD**\n"+"\nThe price of the document is: "+ price + "\nThe year is: " + year + "\nThe image= \n"+ "\n"+printImage(image) + 
        "\nThe number of the propertycard is: "+ propertyCardCode(image);
        }else{
            return "Dont have property card";
        }
    }



    
}