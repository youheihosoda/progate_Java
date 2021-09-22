package progate_Java6;

public class java9 {
	abstract class Vehicle {
		  private String name;
		  private String color;
		  protected int distance = 0;

		  Vehicle(String name, String color) {
		    this.name = name;
		    this.color = color;
		  }

		  public String getName() {
		    return this.name;
		  }
		  public String getColor() {
		    return this.color;
		  }
		  public int getDistance() {
		    return this.distance;
		  }
		  public void setName(String name) {
		    this.name = name;
		  }
		  public void setColor(String color) {
		    this.color = color;
		  }
		  public void printData() {
		    System.out.println("名前：" + this.name);
		    System.out.println("色：" + this.color);
		    System.out.println("走行距離：" + this.distance + "km");
		  }
		  
		  // 抽象メソッドrunを定義してください
		  abstract public void run(int distance);
		    
		  
		  
		}

}
