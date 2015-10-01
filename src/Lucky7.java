import java.util.Random;

public class Lucky7 {
    
    public int randomNumber(int min, int max){
        Random rn=new Random();
        int random;
        int randomNum = rn.nextInt((max - min) + 1) + min;
        return randomNum;
    }   
}
