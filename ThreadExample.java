import java.io.*;
public class ThreadExample implements Runnable{
	public void run() {
		for(int i=0;i<25;i++) {
			try{Thread.sleep(250);}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println("Welcome to Thread");
		}
		System.out.println("\nSession Timed out !!");
	}
	public static void main(String args[]) {
		ThreadExample te = new ThreadExample();
		Thread t  = new Thread(te);
		t.start();	
	}
}
