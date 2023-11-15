package naveenSir;


	class student extends Object {
		  public student(){
		    System.out.println("default student");
		  }
		public student(int n){
		System.out.println("in student");
		}
		}

		class teacher extends student{
		 public teacher(){
		   super();
		   System.out.println("default teacher");

		  }
		public teacher(int n){
		  this();
		System.out.println("in teacher");

		  }
		}
		public class Demo {
		  public static void main(String a[]) {
		  teacher s = new teacher(5);
		  }
		}

	

