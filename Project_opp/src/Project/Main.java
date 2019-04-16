package Project;

public class Main {

	public static void main(String[] args) {
		 Person person=new Person();
		 
		 person.setID(1);
		 person.setName("Aiswarja");
		 person.setGender("Female");
		 person.setAge(24);
		 person.setAddress("Shegun Bagicha");
		 
		
		  System.out.println(person.getID()+" "+
		  person.getName()+" "+person.getGender()+" " +person.getAge()+
		  " "+person.getAddress());
		 
		 
		  /*
		 * System.out.println(person1.getID()+" "+person1.getName()+" "+person1.
		 * getGender()+" " +person1.getAge()+ " "+person1.getAddress());
		 */
		  
		  Person person1=new Person(2,"Ana","Aftabnagar",25,"Female");
		 System.out.println(person1.toString());
		 
		 Human human=new Human(2,"Ana","Aftabnagar",25,"Female","kind","Low","Good");
		 System.out.println(human.toString());
		 System.out.println(human.study());
		 
		 Employee_details e_d=new Employee_details();
		 System.out.println(e_d.salary());

	}

}
