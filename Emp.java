// Emp.java
public class Emp {
    private int eid
	private string ename
	private string basicpay
	private string desig
	private double incentives
	private double deductions
	private double netpay

}
// parameterized constructor 
public Emp(int,id,stringname, double basicpay,string design incentives, double deductions){
    eid=id;
	ename=name;
	this.basicpay=basicpay;
	this.design=desig;
	this.incentives=incentive;
	this constructor=deductions;
}
 //for each private var we need to write one pairof setter  and getter method
public void setEid(int eid) {
    return eid;
}
public void setEname(string ename) {
    this.ename=ename;
}
public string getEname() {
    return ename;
}
public void calculatesalary {
    netpay=(basicpay+incentive)-deductions;
}
printpayslip() {
    system.out.println("eid:"+eid+"\t\tEnname:"+ename);
	system.out.println("Desig:"+design);
	system.out.println("Incentives:"+incentives);
	system.out.println("Deductions:"+deductions);
	system.out.println("Net pay:"+net pay);
	  
//Empclient 
class Empclient {
    public static void main(string rags[]) {
		scanner sc = new scanner(system.in);
		system.out.print("EID: ");
		int eid=sc.nextInt();
		sc.nextLine();
		system.out.println("Basicpay:");
		double basicpay=sc.nextDouble();
		sc.nextLine();
		system.out.print("Desig:");
		string desig=sc.next();
		system.out.print("Incentives:");
		double incentives=sc.nextDouble();
		sc.nextLine();
		system.out.print("Deductions:");
		double deductions=sc.next();
		sc.nextLine();
		Emp e1=new Emp(eid,ename,basicpay,desig,incentives,deductions);
		e1.calculatesalary();
		e1.printpayslip();
		
		
		
		double basicpay=sc.
	    Emp e1=new Emp();
	}
}