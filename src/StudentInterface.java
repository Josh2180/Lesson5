import TerminalIO.KeyboardReader;
import hsa.*;
public class StudentInterface {

    public static void main(String[] args) {
        Console c=new Console();
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        
        String name;
        int score;
        
        while(true){
        c.print("Enter the first students name: ");
        name=c.readLine();
        student1.setName(name);
        for(int i=1; i<=3; i++){
            c.print("Enter the students score: ");
            score=c.readInt();
            student1.setMark(i,score);
        }
        String errorm=student1.validateData();
        if(errorm==null)break;
        else c.print("\n"+errorm+"\n");
        c.getChar();
        }
        while(true){
        c.print("\nEnter the second students name: ");
        name=c.readLine();
        student2.setName(name);
        for(int i=1; i<=3; i++){
            c.print("Enter the students score: ");
            score=c.readInt();
            student2.setMark(i,score);
        }
        String errorm2=student2.validateData();
        if(errorm2==null)break;
        else c.print("\n"+errorm2+"\n");
        c.getChar(); 
        }
        while(true){
        c.print("\nEnter the third students name: ");
        name=c.readLine();
        student3.setName(name);
        for(int i=1; i<=3; i++){
            c.print("Enter the students score: ");
            score=c.readInt();
            student3.setMark(i,score);
        }
        String errorm3=student3.validateData();
        if(errorm3==null)break;
        else c.print("\n"+errorm3+"\n");
        c.getChar(); 
        }
        
        int hswin=student1.getHighScore(), awin=student1.getAverage();
        String win1=student1.getName(), win2=student1.getName();
        
        c.println(""+student1+"\n");
        c.println(""+student2+"\n");
        if(student2.getAverage()>student1.getAverage()){
            awin=student2.getAverage();
            win1=student2.getName();
        }
        if(student2.getHighScore()>student1.getHighScore()){
            hswin=student2.getAverage();
            win2=student2.getName();
        }
        c.println("The Student with the highest average is "+win1+" with an average of "+awin+"%");
        c.println("The Student with the highest score is "+win2+" with an highscore of "+hswin+"%");
        

    }
    
}
