package basics;

public class StudenT {
	
		int rollno;
		String name;
		int mark;
		char grade;
		void setGrade()
		{
			if(mark>=90) 
		    System.out.println("A");
			
			else if(90>mark &&mark>=80)
			System.out.println("B");
			
			else if(80>mark && mark>=70)
			System.out.println("C");
			
			else if(70>mark && mark>=60)
				System.out.println("D");
			
			else if(60>mark && mark>=50)
				System.out.println("E");
			else
				System.out.println("F");
		}
		
	


	public static void main(String[] args) {
		StudenT s1=new StudenT();
		s1.rollno=1;
		s1.name="killer";
		s1.mark=98;
		s1.setGrade();
		System.out.println(s1.grade);
		
		StudenT s2=new StudenT();
		s2.rollno=2;
		s2.name="killer";
		s2.mark=60;
		s2.setGrade();
		System.out.println(s2.grade);
		
		
		
		
		
		
	}

}
