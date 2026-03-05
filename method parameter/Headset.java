class Headset{
 public static String getBrand(){
 
 //if we use the void here than no need of the retun statement
 //In sop it was mainly used to print but "return" is used to return the statement 
   System.out.println("Getbrand() invoked");
   System.out.println("Noise");   
	  return "noise";
	  }
	/*public static void getBrand(){
 // if it is void than this return works but we cant return anything like return "Noise"    if it is String than it gives the error as incompatible return type
 //if we use the void here than no need of the retun statement
 //In sop it was mainly used to print but "return" is used to return the statement 
   System.out.println("Getbrand() invoked");
   System.out.println("Noise");   
	  return ;
	  }
	*/    
	  
	  
	  
   public static double getPrice(){
      System.out.println("getPrice()  Invoked");
       
        return 999.39;

}
public static String getColour(){
      System.out.println("getcolour() Invoked");
       
        return "White";

}

}