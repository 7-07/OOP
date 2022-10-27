package lab1;

	class A {
	    public A(){
	        System.out.println("good luck");
	    }
	}

	class B extends A {
	    public B(){
	        System.out.println("dw");
	    }
	}
	
	class D extends B {
		public D() {
			System.out.println("3rd");	}
	}

	public class C {
	    public static void main(String[] args) {
	        D b = new D();
	    }
	}

