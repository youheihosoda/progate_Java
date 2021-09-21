package progate_Java7;

public class java4 {
	 private int fuel = 50;

	  public int getFuel() {
	    return this.fuel;
	  }
	  
	  // printDataメソッドを定義してください
	  public void printData(){
	    System.out.println("名前：" + this.getName());
	    System.out.println("色：" + this.getColor());
	    System.out.println("走行距離：" + this.getDistance() + "km");
	    System.out.println("ガソリン量：" + this.getFuel() + "L");
	  }

	  public void charge(int litre) {29
	    System.out.println(litre + "L給油します");
	    if (litre <= 0) {
	      System.out.println("給油できません");
	    } else if (litre + this.fuel >= 100) {
	      System.out.println("満タンまで給油します");
	      this.fuel = 100;
	    } else {
	      this.fuel += litre;
	    }
	    System.out.println("ガソリン量：" + this.fuel + "L");
	  }

}
