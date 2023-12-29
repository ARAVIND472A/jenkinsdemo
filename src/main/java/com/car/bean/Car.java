package com.car.bean;

public class Car {
	
	 private String carNo;
	    private String manufacturer;
	    private String model;
	    private int kmsRan;
	    private int priceExpected;
	    private int noOfOwners;
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Car(String carNo, String manufacturer, String model, int kmsRan, int priceExpected, int noOfOwners) {
			super();
			this.carNo = carNo;
			this.manufacturer = manufacturer;
			this.model = model;
			this.kmsRan = kmsRan;
			this.priceExpected = priceExpected;
			this.noOfOwners = noOfOwners;
		}
		public String getCarNo() {
			return carNo;
		}
		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getKmsRan() {
			return kmsRan;
		}
		public void setKmsRan(int kmsRan) {
			this.kmsRan = kmsRan;
		}
		public int getPriceExpected() {
			return priceExpected;
		}
		public void setPriceExpected(int priceExpected) {
			this.priceExpected = priceExpected;
		}
		public int getNoOfOwners() {
			return noOfOwners;
		}
		public void setNoOfOwners(int noOfOwners) {
			this.noOfOwners = noOfOwners;
		}

	   

}
