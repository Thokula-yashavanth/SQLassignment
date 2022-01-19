package com.addressbook;

	public class TestAddressBook {
		AddressBook addressList = new AddressBook();
		public  void populteBook() {
			SingleAddress singleaddress = new SingleAddress("yashwanth","Kumar","SRR Thota","Warangal","telangana","India",506002);
			SingleAddress singleaddress1 = new SingleAddress(",masna","Kumar","SRR Thota","Warangal","telangana","India",506002);
			SingleAddress singleaddress2 = new SingleAddress("ranjith","Kumar","SRR Thota","Warangal","telangana","India",506002);
			SingleAddress singleaddress3 = new SingleAddress("Ganesh","Kumar","SRR Thota","Warangal","telangana","India",506002);
			SingleAddress singleaddress4 = new SingleAddress("saiakhil","Kumar","SRR Thota","Warangal","telangana","India",506002);
			SingleAddress singleaddress5 = new SingleAddress("varun","Kumar","SRR Thota","Warangal","telangana","India",506002);
			addressList.listOfAddress.add(singleaddress);
			addressList.listOfAddress.add(singleaddress1);
			addressList.listOfAddress.add(singleaddress2);
			addressList.listOfAddress.add(singleaddress3);
			addressList.listOfAddress.add(singleaddress4);
			addressList.listOfAddress.add(singleaddress5);
			System.out.println(singleaddress.toString());
		}
	public static void main(String[] args) {
		TestAddressBook testBook = new TestAddressBook();
		testBook.populteBook();
		System.out.println(testBook.addressList.listOfAddress);
		SingleAddress singleaddress = new SingleAddress("reryut","Kumar","SRR Thota","Warangal","telangana","India",506002);
	     try {
			testBook.addressList.addNewAddress(singleaddress);
		} catch (DuplicateAddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println(testBook.addressList.listOfAddress);
	     testBook.addressList.removeAddress(singleaddress);
	     System.out.println(testBook.addressList.listOfAddress);
	     System.out.println(testBook.addressList.toString(singleaddress));
		
	}
	}


}
