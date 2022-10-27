package lab5;

public class Ex3 {
	

	    public static void main(String[] args) {
	        // MyString1
	    	
	        MyString1 s = new MyString1("StringOne1234");
	        int x = 430;
	        
	        System.out.println(s.length());
	        System.out.println(s.charAt(8));
	        System.out.println(s.equals(new MyString1("StringNotOne1234")));
	        System.out.print(MyString1.valueOf(x));
	    }
	}
