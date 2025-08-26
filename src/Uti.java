import java.util.Scanner;

public class Uti {
    Scanner in = new Scanner(System.in); //initiate scanner

    //initiate score and total
    public double score = 0;
    public double total = 0;

    public void create_mcq(String name, String op1, String op2, String op3, String op4, int CO) {
        total += 1; //increase total by marks awarded for the question

        //print
        System.out.println("Q: "+name + ": \n");
        System.out.println("Option 1: " + op1);
        System.out.println("Option 2: " + op2);
        System.out.println("Option 3: " + op3);
        System.out.println("Option 4: " + op4+"\n");

        //accept
        System.out.println("Enter choice(number only): ");
        int choice = in.nextInt();

        //checking
        if (choice == CO){
            System.out.println("Correct!");
            score+=1;
        }
        else{
            System.out.println("Wrong answer, (correct: "+CO+") (u might have also entered choice out of valid range.)");
        }

    }

    public void create_fib(String q, String ans){
        total += 2; //add marks awarded to score

        //print and accept
        System.out.println("Q: "+q);
        System.out.println("Enter answer: ");
        String ua = in.next();
        //ignore case is good for most questions
        //planning to create new function which is case-sensitive
        if (ans.equalsIgnoreCase(ua)){
            System.out.println("Correct!!");
            score += 2;
        }
        else{
            System.out.println("Wrong!!");
            score -= 0.5;
        }
    }

    //just a failsafe for no particular reason
    public void setScore(double score) {
        this.score = score;
    }

    //useful in future or in other functions like grade()
    public double getScore() {
        return score;
    }

    //display score and grade
    public void print_score(){
        System.out.println(score+"\n");
        System.out.println(grade());
    }
    //determine grade
    // if full marks then A, if between total and total/2 ; B
    //below
    public String grade(){
        double marks = getScore();
        return ((marks ==total)? "Grade: A" : (marks < total && marks >total/2.0) ? "Grade: B": "Grade: C" );
    }
}
