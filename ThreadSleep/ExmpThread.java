
public class ExmpThread extends Thread {
	 private int suspendCount;
	    public ExmpThread(int count){
	        this.suspendCount = count;
	    }
	    public void run(){
	        for(int i=0;i<50;i++){
	            if(i%suspendCount == 0){
	                try {
	                    System.out.println("Thread Uykuda: " + getName());
	                    Thread.sleep(500);
	                } catch (InterruptedException ex) { }
	            }
	        }
	    }
}
