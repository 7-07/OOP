package lab6lab;

public class test1 {

	public static void main(String[] args) {
		
				System.out.println("Person: ");
				
		        Person p = new Person("Marriot Andres","4897302", "0442145684", "mariandres@gmail.com");
		        System.out.println(p.toString());

		        System.out.println("\nStudent: ");
		        Student s = new Student("Robin West", "9083671", "0502439345","robwest@outlook.com", "Sophomore");
		        System.out.println(s.toString());

		        System.out.println("\nEmployee: ");
		        Employee e = new Employee("Philippe Julien","2406622", "0954406327", "phjulien@outlook.com", 20000, "room 599");
		        System.out.println(e.toString());

		        System.out.println("\nFaculty: ");
		        Faculty f = new Faculty("Kamal Sulieman", "5533031", "0879870113", "kamalsuli@gmail.com", 25000,"room201", "leader", "9-5");
		        System.out.println(f.toString());

		        System.out.println("\nStaff: ");
		        Staff st = new Staff( "Duo Maxemillian", "9990874", "0246754748", "duomax02@gmail.com", 30000,"room 024", "Headmaster");
		        System.out.println(st.toString());

		    }
		}



