package progate_Java6;

public class java4_1 {
	private String name;
	  private String color;
	  private static int distance = 0;
	  private int run;
	  
	  Bicycle(String name, String color, int run){
	    this.name = name;
	    this.color = color;
	    this.run = run;
	  }
	  
	  public void printData(){
	    System.out.println("【自転車の情報】");
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	    System.out.println("走行距離："+ this.distance + "km");
	  }
	  
	  public void run(){
	    System.out.println(this.run + "km走ります");
	    System.out.println("走行距離：" + this.run + "km");
	  }

}
