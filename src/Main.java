public class Main {
    public static void main(String[] args) {
        Uti quiz = new Uti();
        quiz.setScore(0);
        //MCQ - 1 mark
        // FIB - 2 marks & 0.5 for wrong

        quiz.create_mcq("What is 1+1: ", "3", "2", "6", "4", 2);
        quiz.create_mcq("In what year did India gain independence", "1947", "1950", "2012", "1948", 1);
        quiz.create_fib("______ + 5 = 8", "3");

        quiz.print_score();
        quiz.grade(4);
    }
}