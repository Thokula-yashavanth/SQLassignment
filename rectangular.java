package Javatraining;

public class rectangular extends Shape
{
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}
main

package javatraining;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape shape;
        rectangular rect = new rectangular();
        
        shape = rect;
        shape.setValues(40, 5);
        
  
        System.out.println("Area of rectangle : " + shape.getArea());
        
       
        Triangle tri = new Triangle();
        

        shape = tri;
        
                
        shape.setValues(40,3);
             
        System.out.println("Area of triangle : " + shape.getArea());
        
    
        rectangular rect1 = new rectangular();
        
  
        shape = rect1;

        shape.setValues(25, 3);
        
    
        System.out.println("Area of square : " + shape.getArea());
        
    
        square squ1 = new square();
        
            
        shape = squ1;
       
	}

}
