public class test{


public static void main(String[] args) {
//	string n1 = args[0];
	int id= Integer.parseInt(args[0]);
	double gr= Double.parseDouble(args[1]);
//	string ad= args[3];


	 Undergrad u1= new Undergrad(id,gr);
	 Grad g1 = new Grad(id,gr);	
	boolean	i= u1.isPassed(gr);

	if(i== true)
		System.out.println("Undergrad student is Passed");
	else
		System.out.println("Undergrad student is Failed");

	boolean ii= g1.isPassed(gr);	
	if(ii== true)
		System.out.println("Grad student is Passed");
	else
		System.out.println("Grad student is Failed");
}
}
