import java.util.*;

public class LinearCrashingObjects
{
  public static void main(String[] args)
  {
    Scanner lab = new Scanner(System.in);
    
    System.out.print("m1: ");
    double m1 = lab.nextDouble();
    
    System.out.print("v1_1: "); //object 1 speed 1(speed at the beginning)
    double v1_1 = lab.nextDouble();
    
    System.out.print("m2: ");
    double m2 = lab.nextDouble();
    
    System.out.print("v2_1: "); //object 2 speed 1(speed at the beginning)
    double v2_1 = lab.nextDouble();
    
    double energy1_1 = energy(m1,v1_1);
    double energy2_1 = energy(m2,v2_1);
    double energyFirst = energy1_1 + energy2_1; //calculates energy sums in the beginning
    
    double momentum1_1 = momentum(m1,v1_1);
    double momentum2_1 = momentum(m2,v2_1);
    double momentumFirst = momentum1_1 + momentum2_1; //calculates momentum sums in the beginning
    
    // a*x*x +b*x +c=0
    
    double a= (Math.pow(m1,2)/(2.0*m2)) + (m1/2.0);
    
    double b= -(((momentumFirst)*m1)/m2);
      
    double c=  ((Math.pow(momentumFirst,2))/(2.0*m2)) - energyFirst;
    
    //Discriminant.java
    double delta = Math.pow(b,2)-(4.0*a*c);
    double result1 = (-b + Math.sqrt(delta))/(2.0*a);
    double result2 = (-b - Math.sqrt(delta))/(2.0*a); 
        
    
    System.out.println("x1: " + result1 + "x2: " + result2); //shows v1_2
  }
  
  public static double energy(double m, double v)
  {
    return (1.0/2.0)*m*Math.pow(v,2);
  }
  
    
  public static double momentum(double m, double v)
  {
    return m*v;
  }
  
}