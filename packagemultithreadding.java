package multithreadding;
class Line 
{ 
  
    // if multiple threads(trains) trying to access 
    // this synchronized method on the same Object 
    // but only one thread will be able 
    // to execute it at a time. 
    synchronized public void getLine() 
    { 
        for (int i = 0; i < 3; i++) 
        { 
            System.out.println(i); 
            
        } 
    } 
} 
  
class Train extends Thread 
{ 
    // Reference variable of class line Line. 
    Line ref; 
  
    Train(Line ref) 
    { 
        this.ref =ref; 
    } 
  
    @Override
    public void run() 
    { 
        ref.getLine(); 
    } 
} 
public class Synchronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line obj = new Line(); 
		  
        // we are creating two threads which share 
        // same Object. 
        Train train1 = new Train(obj); 
        Train train2 = new Train(obj); 
  
        // both threads start executing . 
        train1.start(); 
        train2.start(); 

	}

}