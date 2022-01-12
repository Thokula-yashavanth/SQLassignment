	public static void main(String[] args) {
	
		 gst p1 = new gst();
		 p1.ProID = 21490;
		 p1.ProName="phone";
		 p1.Price=12000;
		 p1.GST= p1.Price/18;
		
		 System.out.println(" the product ID is " + p1.ProID + " "+ "the product name is " + p1.ProName + " "+  "the price of phone is " +  p1.Price);
		System.out.println( "the price of phone After adding the GST Tax Price  is " +  p1.ProPrice());
	}
}
 