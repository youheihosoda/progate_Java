package progate_Java6;

public class java6 {
	class Main {
		  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
		    bicycle1.printData();
		    System.out.println("-----------------");
		    
		    
		    System.out.print("走る距離を入力してください：");
		    int bicycle1Distance = scanner.nextInt();
		    bicycle1.run(bicycle1Distance);
		    System.out.println("=================");
		    
		    
		    Car car1 = new Car("フェラーリ", "赤", 0);
		    car1.printData();
		  }

}
