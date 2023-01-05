class College implements Runnable{
	String collegename;
	int collegeid;
	int capacity=50;
	int students=48;
	College(String collegename,int collegeid)
	{
		this.collegename=collegename;
		this.collegeid=collegeid;
	}
		
	public void run()
	{
		String name=Thread.currentThread().getName();
		synchronized(this){
		if(students<=capacity)
		{
			System.out.println(name+" got admission in "+collegename+" ("+collegeid+")");
			students++;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
			}
		}
		else
		{
			System.out.println("Sorry adimissions full");
		}
		}
	}
}
class Synchro{
	public static void main(String...args)
	{
		College c=new College("Anna university",2436);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		t1.setName("Arjun");
		t2.setName("Dinesh");
		t3.setName("Sathish");
		t4.setName("Aarya");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}