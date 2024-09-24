import java.util.*;
public class TypeSpeedTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tWelcome ");
        String s="The quick brown fox jumps over the lazy dog while the sun sets in the west, painting the sky with beautiful shades of orange and pink";
        System.out.println("Type the below sentence :");
        System.out.println(s);
        long Starttime=System.currentTimeMillis();
        String ss=sc.nextLine();
        long Endtime=System.currentTimeMillis();
        //Time in seconds
        long total_time=(Endtime-Starttime)/1000;
        //Find the time in minutes
        double total_time_minute=total_time/60.0;
        System.out.println("The time taken to type the words :"+total_time+" S");
        System.out.printf("The time taken to type the words : %.2f Min%n",total_time_minute);
        String []Given_text=s.split(" ");
        String []User_typedtext=ss.split(" ");
        int correct_word=0;
        int wrong_word=0;
        int correctchars=0;
        for(int i=0;i<Integer.min(Given_text.length,User_typedtext.length);i++){
            if(Given_text[i].equals(User_typedtext[i])){
                correct_word++;
                correctchars+=User_typedtext[i].length();
            }
            else{
                wrong_word++;
            }
        }
        wrong_word+=Math.max(0,User_typedtext.length-Given_text.length);
         //Typing speed is measured in words per minute (WPM). 
        //one word is defined as 5 characters (including spaces and punctuation)
        double speed=((correctchars/5.0)/total_time_minute );
        System.out.printf("Your typing speed is: %.2f WPM%n", speed);
        System.out.println("The correct word you typed are : "+correct_word);
        System.out.println("The incorrect word you typed are : "+wrong_word);
    }  
}
