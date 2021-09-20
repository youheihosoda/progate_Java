package progate_Java6;

public class java9_1 {
	private String name;
	  private String color;
	  private int distance = 0;
	  private int fuel = 100;
	  private int charge = 0;
	  
	  Car(String name, String color){
	    this.name = name;
	    this.color = color;
	  
	  }
	  
	  public void printData2(){
	    
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離："+ this.distance + "km");
	    System.out.println("ガソリン量:" + this.fuel + "L");
	  }
	  
	  public void run(int distance){
	    System.out.println(distance + "km走ります");
	    
	    
	    if(this.fuel >= distance){
	      this.distance += distance;            
	      this.fuel -= distance;
	      System.out.println("走行距離：" + distance + "km");
	    }else{
	      System.out.println("ガソリンが足りません");
	      System.out.println("走行距離:0km" );
	    }
	    
	     System.out.println("ガソリン量：" + this.fuel + "L");
	  }
	  
	  public void charge(int charge){
	    if(charge < 0){
	      System.out.println(charge + "L給油します");
	      System.out.println("給油できません");
	      System.out.println("ガソリン量:" + this.fuel + "L");
	    }else if(charge + this.fuel > 100){
	      System.out.println(charge + "L給油します");
	      System.out.println("満タンまで給油します");
	      System.out.println("ガソリン量:100L");
	    }else{
	      System.out.println(charge + "L給油します");
	      fuel = this.fuel + charge;
	      System.out.println("ガソリン量:" + fuel + "L");
	    }
	    
	  }

}
