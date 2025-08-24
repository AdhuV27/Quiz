public class Main {
    public static void main(String[] args) {
        Uti quiz = new Uti();

        quiz.create("What is 1+1: ", "3", "2", "6", "4", 2);
        quiz.create("In what year did India gain independence", "1947", "1950", "2012", "1948", 1);

        quiz.print_score();
    }
}