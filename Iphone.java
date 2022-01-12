package javatraining;


public class Iphone {
	
	
	int memorysize;
	
	void actualprice() {
		
		if (memorysize==64) {
			System.out.println("actualprice is 40000");
		}
		else if (memorysize==128) {
			System.out.println("actualprice is 70000");
	}
		else if (memorysize==256) {
			System.out.println("actualprice is 90000");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Iphone Ip=new Iphone();
   Ip.memorysize=128;
   Ip.actualprice();
	}

}
