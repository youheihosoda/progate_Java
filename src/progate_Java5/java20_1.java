package progate_Java5;

public class java20_1 {
	private static int count = 0;
	  private String firstName;
	  private String middleName;
	  private String lastName;
	  private int age;
	  private double height;
	  private double weight;
	  // インスタンスフィールド「job」を追加してください
	  private String job;
	  
	  // コンストラクタを書き換えてください
	  Person(String firstName, String lastName, int age, double height, double weight, String job) {
	    Person.count++;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	    this.job = job;
	  }
	  
	  // コンストラクタを書き換えてください
	  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
	    this(firstName, lastName, age, height, weight, job);
	    this.middleName = middleName;
	    this.job = job;
	  }

	  public String getMiddleName() {
	    return this.middleName;
	  }
	  
	  // jobのゲッターを定義してください
	  public String getJob(){
	    return this.job;

}
