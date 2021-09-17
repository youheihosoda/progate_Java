package progate_Java6;

public class java2_1 {
	private String name;
	  private String color;
	  
	  Bicycle(String name, String color){
	    this.name = name;
	    this.color = color;
	  }
	  
	  public void printDate(){
	    System.out.println("【自転車の情報】");
	    System.out.println("名前：" + this.name);
	    System.out.println("色：" + this.color);
	  }

}
