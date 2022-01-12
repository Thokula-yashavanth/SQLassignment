
package javatraining;

public class gst {
	
	int ProID;
	 String ProName;
	 double Price; 
	double GST;
	
	public double ProPrice() {
		return Price + GST;
	}
	
	
	
	public static void main(String[] args) {
	
		 gst p1 = new gst();
		 p1.ProID = 21507;
		 p1.ProName="vivo";
		 p1.Price=10000;
		 p1.GST= p1.Price/10;
		
		 System.out.println(" the product ID is " + p1.ProID + " "+ "the product name is " + p1.ProName + " "+  "the price of phone is " +  p1.Price);
		System.out.println( "the price of phone After adding the GST Tax Price  is " +  p1.ProPrice());
	}
}

