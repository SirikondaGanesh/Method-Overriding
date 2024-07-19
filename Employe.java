//implimenting a java program using method-overriding
//package-declaration
package apjfsa;
//super-class
public class Employe {
	//instance-variable
	int baseSalary;
	//Method to be overridden
	public long totalSalary(){
	 return baseSalary;
	}
}



//sub-class
public class PerminentEmply extends Employe {
	//instance-variable
	String name;
	int empId;
  int benefits;
  long totalSalary;
	//overriding the totalSalary method
  @Override
	public long totalSalary()
	{
  	
  	//Total salary for permanent employee includes benefits
  	return totalSalary=baseSalary+benefits;
	}
	//instance-method
	public void perminentEmplyInfo() {
	System.out.println("Perminent-Employee Details :\n"+"Employee-Name :"+name+"\nEmployee Id:"+empId+"\nBenefits :"+benefits+"\nPermanent-employee Totalsalary :"+totalSalary);
	}
 //main-function
	public static void main(String[] args) {
		//creating object
		PerminentEmply E2=new PerminentEmply(); 
		E2.empId=422;
		E2.name="Ganesh";
		E2.benefits=5000;
		E2.baseSalary=20000;
	    E2.totalSalary();
      E2.perminentEmplyInfo();
      
	}
}

