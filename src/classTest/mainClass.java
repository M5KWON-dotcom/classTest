package classTest;

public class mainClass {
	public static void main(String[] args) {
		int a = 10;
		int sum;
		
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.hakbun = "20261001";
		student1.grade = 3;
		student1.age =17;
		student1.score =90;
		
		System.out.println(student1.name);
		student1.hello();
		
		student1.average(10,20);
		student1.add(10,20); 
		student1.greeting("김유신님");
		
		Student student2 = new Student();
		student2.hello();
		Student.hello2();//static 메서드는 객체가 선언되지않아도 호출가능
		
		Solider solider1 = new Solider();
		solider1.name ="이순신";
		solider1.number ="20260929";
		solider1.grade = 3;
		solider1.group = "백구";
		
		System.out.println("이름:" + solider1.name);
		System.out.println("부대이름:"+ solider1.group);
		
		
		}
	}


