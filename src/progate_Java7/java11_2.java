package progate_Java7;

import progate_Java7.java1_2.Bicycle;

public class java11_2 {
	 public static void main(String[] args) {
		    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
		    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

		    Car car = new Car("フェラーリ", "赤");
		    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
		    
		    // buyメソッドを用いて、person1にcarを購入させてください
		    person1.buy(car);
		    
		    // buyメソッドを用いて、person2にbicycleを購入させてください
		    person2.buy(bicycle);

		    System.out.println("【車の情報】");
		    car.printData();
		    System.out.println("-----------------");
		    System.out.println("【車の所有者の情報】");
		    car.getOwner().printData();

		    System.out.println("=================");
		    System.out.println("【自転車の情報】");
		    bicycle.printData();
		    System.out.println("-----------------");
		    System.out.println("【自転車の所有者の情報】");
		    bicycle.getOwner().printData();
		  }

}
