import java.util.Scanner;

public class Uti {
    public double score = 0;
    public void create_mcq(String name, String op1, String op2, String op3, String op4, int CO) {
        System.out.println("Q: "+name + ": \n");
        System.out.println("Option 1: " + op1);
        System.out.println("Option 2: " + op2);
        System.out.println("Option 3: " + op3);
        System.out.println("Option 4: " + op4+"\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice(number only): ");
        int choice = in.nextInt();

        if (choice == CO){
            System.out.println("Correct!");
            score+=1;
        }
        else{
            System.out.println("Wrong answer, (correct: "+CO+") (u might have also entered choice out of valid range.)");
            score -= 0.5;
        }

    }

    public void create_fib(String q, String ans){
        System.out.println("Q: "+q);
        System.out.println("Enter answer: ");
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void print_score(){
        System.out.println(score);
    }
}
