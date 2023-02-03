package javavariables;
public class Datavaraibles {
	int b=40;//instance variable
static int empid=101;	
public void m1() {
//DT Var VV----To Represent data
int a=10;//local variables	
System.out.println("M1 Executed");
//        int string
System.out.println(a +  "local variable");//10
System.out.println(empid +  "static variable");
}
public void m2() {
System.out.println("M2 Executed");
System.out.println(b+"instance variable");
System.out.println(empid+"static variable");
}
public void m3() {
System.out.println("M3 Executed");
System.out.println(b+"instace variable");
}
public static void main(String args[]) {
System.out.println("Main method excuted");
Datavaraibles m=new Datavaraibles ();
m.m1();
m.m2();
m.m3();

}
}
