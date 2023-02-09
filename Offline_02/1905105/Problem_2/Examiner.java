import java.util.List;
import java.util.Random;

public class Examiner extends Person{
    Random random = new Random();

    public Examiner(Mediator mediator) {
        super(mediator);
    }

    public void Send(List<Script> scripts, boolean re){
        System.out.println("\nExaminer has got the scripts from Exam Controller for checking");
        for(Script script: scripts){
            int mark = random.nextInt(100);
            if(re){
                if(mark>script.getMarks())
                    script.setMsg("Marks Increased");
                else if(mark<script.getMarks())
                    script.setMsg("Marks Decreased");
                else{
                    script.setMsg("Marks Unchanged");
                }
            }
            System.out.println("Examiner has checked the script of "+script.getId());
            script.setMarks(mark);
        }
        mediator.Send(this, scripts,re);
    }
}
