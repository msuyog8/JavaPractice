class Undergrad extends Student{
 

	Undergrad (string name, int ID, double grade , string address){
	super(name,ID,grade,address)
		this.grade= grade;
	}
	public boolean isPassed(double grade){
	 if(grade >70.0)
		 return true;
	 else 
		 return false;
	}




}
