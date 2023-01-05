import java.util.*;
class Student implements Comparator<Student>{
	String studname;
	int stdid;
	double atd;
	int mark;
	Student(String studname,int stdid,double atd,int mark)
	{
		this.studname=studname;
		this.stdid=stdid;
		this.atd=atd;
		this.mark=mark;
	}
	Student(){}
	public int compare(Student s1,Student s2)
	{
		return s1.studname.compareTo(s2.studname);
	}
	public String toString()
	{
		return "Student name : "+studname+"\n"+"Student id : "+stdid+"\n"+"Student attendance percentage : "+atd+"\n"+"Student mark : "+mark;
	}
}
class Students{
	public static void main(String...args){
		LinkedList<Student> l=new LinkedList<Student>();
	    Student s1=new Student("Zebra",2436,88.9,87);
	    Student s2=new Student("Giri",936,88.7,56);
	    Student s3=new Student("Arjun",3672,96.8,66);
	   
	    l.add(s1);
	    l.add(s2);
	    l.add(s3);
	    
	    Collections.sort(l,new Student());
	    for(Student sort:l)
	    {
		   System.out.println(sort);
	    }
	}
}