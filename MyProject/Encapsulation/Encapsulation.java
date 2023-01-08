package Encapsulation;

public class Encapsulation {
	private int rollno;
	private String name;
	private int age;
	
	//getter and setter method we can use for data modification
	public int getRollno()  ///data view
	{
		return rollno;
	}
	public void setRollno(int rollno) { //data modify
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
    }
	public static void main(String[] args) {
		//Encapsulation-Wapping up of data /variable and code/methods into a single unit is know as encapsulation
		//Ti is also known as Data Hiding
		//Variable is always declare as private
		//getter and setter method are always public in nature
		//private data member/variable we can cnot access direclly form another calss
		//To provide the security in java we use encapsulation
	
		Encapsulation stu=new Encapsulation();
		stu.setRollno(102);
		stu.setName("Hello");
		stu.setAge(20);
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAge());

}
}
