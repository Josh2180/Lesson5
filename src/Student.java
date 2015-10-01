
public class Student {
    private String name;
    private int mark1, mark2, mark3;
    
    public Student(){
//        name="unknown";
//        mark1=0;
//        mark2=0;
//        mark3=0;
        this("unknown",0,0,0);
    }
    
    public Student(String n,int a,int b, int c){
        name=n;
        mark1=a;
        mark2=b;
        mark3=c;
    }
    
    public Student(Student other){
        name=other.getName();
        mark1=other.getMark(1);
        mark2=other.getMark(2);
        mark3=other.getMark(3);
    }
    
    public void setName(String n){
        name=n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setMark(int which, int score){
        if(which==1) mark1=score;
        else if(which==2) mark2=score;
        else mark3=score;
    }
    
    public int getMark(int which){
        if(which==1) return mark1;
        else if(which==2) return mark2;
        else return mark3;
    }
    
    public int getAverage(){
        return(mark1+mark2+mark3)/3;
    }
    
    public int getHighScore(){
        int hs=mark1;
        if(mark2>hs)hs=mark2;
        if(mark3>hs)hs=mark3;
        return hs;
    }
    
    public String validateData(){
        String em=null;
        if(name.length()<2)em="Name is required.";
        if(mark1<0||mark1>100||mark2<0||mark2>100||mark3<0||mark3>100)
            if(em==null)
                em="At least 1 mark is out of acceptable range.";
            else
                em+="\nAt least 1 mark is out of acceptable range.";
        if(em!=null)
            em+="\nPlease re-enter all the data";
        return em;
    }
    
    public String toString(){
        String str="Name:\t"+name;
        str+="\nMark 1:\t"+mark1;
        str+="\nMark 2:\t"+mark2;
        str+="\nMark 3:\t"+mark3;
        str+="\nAverage:\t"+getAverage();
        str+="\nHighScore:\t"+getHighScore();
        return str;
    }
}
