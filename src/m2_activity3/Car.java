package m2_activity3;

public class Car {

		// Attributes
		private String brand;		
		private String model;
		private String color;
		private String transmission;

		// No-Args Constructor
		public Car() { 
			
		}

		// Parameterized Constructor
		public Car(String brand, String model, String color, String transmission) {
			
				this.brand = brand;
				this.model = model;
				this.color = color;
				this.transmission = transmission;
					
		}

		// Method
		public void showCarInfo() {
			
				System.out.println("\n========= DETAILS =========");
				System.out.println("Brand: " + brand);
				System.out.println("Model: " + model);
				System.out.println("Color: " + color);
				System.out.println("Transmission : " + transmission);
				System.out.println("===========================");
					
		}

		// Getters
		public String getBrand() { 
				
				return brand; 
				
		}
		
		public String getModel() { 
				
				return model; 
				
		}
		
		public String getColor() { 
				
				return color; 
				
		}
		
		public String getTransmission() { 
				
				return transmission; 
				
		}

		// Setters
		public void setBrand(String brand) { 
				
				this.brand = brand; 
				
		}
		
		public void setModel(String model) { 
				
				this.model = model; 
				
		}
		
		public void setColor(String color) { 
				
				this.color = color; 
				
		}
		
		public void setTransmission(String transmission) { 
				
				this.transmission = transmission; 
				
		}

}
