import java.util.Scanner;
public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    int i = 0;
    public QuestionService() {
        questions[0] = new Question(1, "Size of int in Java?", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        questions[1] = new Question(2, "Which keyword is used to create a class?", "class", "create", "new", "define", "class");
        questions[2] = new Question(3, "What is the default value of a boolean variable?", "true", "false", "0", "1", "false");
        questions[3] = new Question(4, "Which of the following is not a Java keyword?", "static", "void", "main", "public", "main");
        questions[4] = new Question(5, "What is the output of 10", "10", "20", "30", "40", "10");
    }
    public void playQuiz() {
        for(Question q: questions) {
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getO1());
            System.out.println("2. " + q.getO2());
            System.out.println("3. " + q.getO3());
            System.out.println("4. " + q.getO4());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your answer (1-4): ");
            selection[i] = scanner.nextLine();
            i++;
        }
        for(String s : selection) {
            System.out.println("Your selected option: " + s);
        }
    }
    public void printScore() {
        int score = 0;
        for(int j = 0; j < questions.length; j++) {
            Question q = questions[j];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[j];

            if(actualAnswer.equals(userAnswer)) {
                score++;
            }
        } 
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
