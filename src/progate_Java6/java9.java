package progate_Java6;

public class java9 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
	    bicycle1.printData();
	    System.out.println("-----------------");
	    
	    
	    System.out.print("走る距離を入力してください：");
	    int bicycle1Distance = scanner.nextInt();
	    bicycle1.run(bicycle1Distance);
	    System.out.println("=================");
	    
	    
	    Car car1 = new Car("フェラーリ", "赤");
	    System.out.println("【車の情報】");
	    car1.printData2();
	    System.out.println("-----------------");
	    System.out.print("走る距離を入力してください：");
	    int car1Distance = scanner.nextInt();
	    car1.run(car1Distance);
	    
	    System.out.println("-----------------");
	    System.out.print("給油する量を入力してください：");
	    int car1Charge = scanner.nextInt();
	    car1.charge(car1Charge);
	  }

}
