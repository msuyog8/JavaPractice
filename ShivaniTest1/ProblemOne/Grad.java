public class Grad extends Student{
 

	Grad ( int ID1, double grade1 ){
	super(ID1,grade1);
	
	}
	public boolean isPassed(double grade){
	 if(grade >80.0)
		 return true;
	 else 
		 return false;
	}




}
