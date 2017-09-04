import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String a[]){
        List<ExmpThread> list = new ArrayList<ExmpThread>();
        for(int i=0;i<4;i++){
            ExmpThread et = new ExmpThread(i+10);
            list.add(et);
            et.start();
        }
        for(ExmpThread et:list){
            try {
                et.join();
            } catch (InterruptedException ex) { }
        }
    }
}
