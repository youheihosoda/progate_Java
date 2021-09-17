package progate_Java6;

public class java5 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Bicycle bicycle1 = new Bicycle("ビアンキ","緑");
	    bicycle1.printData();
	    System.out.println("-----------------");
	    
	    
	    System.out.print("走る距離を入力してください：");
	    int bicycle1Distance = scanner.nextInt();
	    bicycle1.run(bicycle1Distance);
	    
	  }

}
