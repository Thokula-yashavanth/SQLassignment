package javatraining;


public class specific {
	
public static void main(String[] args) {
int[] num = {6,7,8,5,4};
int toFind = 9;
boolean found = false; for (int n : num) {
if (n == toFind) {
found = true;
break;
}
}
if(found)
System.out.println(toFind + " is Found.");
else
System.out.println(toFind + " is not Found.");
}
}

