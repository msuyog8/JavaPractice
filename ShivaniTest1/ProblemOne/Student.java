abstract  class Student {
//private string name;
private int ID;
private double grade;
//private string address;


Student( int ID1, double grade1){
// name=name1;
 ID=ID1;
 grade=grade1;
// address=address1;
}
/*public string getName(){return name;}

public int getID(){return ID;}

public double getGrade(){return grade;}

public string getAddress(){return address;}

public void setName(string value){ name = value;}

public void setID(int value){ ID = value;}

public void setGrade(double value){ grade = value;}

public void setAddress (string address){ address = value;}
*/
public abstract boolean isPassed(double grade);



}
