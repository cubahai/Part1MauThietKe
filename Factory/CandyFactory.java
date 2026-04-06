package candyfactory;

//CandyFactory.java
public class CandyFactory {

 public static Candy createCandy(String type) {

     if (type.equalsIgnoreCase("chocolate")) {
         return new Chocolate();
     } 
     else if (type.equalsIgnoreCase("caramel")) {
         return new Caramel();
     } 
     else {
         throw new IllegalArgumentException("Unknown candy type");
     }
 }
}

