public class Undergrad extends Student{
 

	Undergrad ( int ID1, double grade1 ){
	super(ID1,grade1);
	
	}
	public boolean isPassed(double grade){
	 if(grade >70.0)
		 return true;
	 else 
		 return false;
	}




}
