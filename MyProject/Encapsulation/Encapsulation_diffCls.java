package Encapsulation;

public class Encapsulation_diffCls {

	public static void main(String[] args) {
		Encapsulation data=new Encapsulation();
		data.setRollno(102);
		data.setName("Ram");
		data.setAge(17);
		System.out.println(data.getRollno());
        System.out.println(data.getName());
        System.out.println(data.getAge());
	}

}
