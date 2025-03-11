import java.util.Scanner;

public class QuestionServices {
    Question question[] = new Question[10];
    String scoreDetails[] = new String[10];
    Scanner scanner = new Scanner(System.in);
    int score = 0;

    public QuestionServices() {
        Utility.loadQuestionsFromFile("question.txt", question);
    }

    public int displayQuestions() {
        for (Question q : question) {
            if (q != null && q.getQuestion() != null) {
                System.out.println(q.getQuestion());
                System.out.println("A. " + q.getOption1());
                System.out.println("B. " + q.getOption2());
                System.out.println("C. " + q.getOption3());
                System.out.println("D. " + q.getOption4());
                System.out.println("Enter your answer: ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(q.getAnswer())) {
                    score += 3;
                    scoreDetails[Integer.parseInt(q.getId()) - 1] = "Given Answer: " + answer + " | Correct Answer: "
                            + q.getAnswer() + " | Awarded Score: 3 | Total Score: " + score;
                } else {
                    score--;
                    scoreDetails[Integer.parseInt(q.getId()) - 1] = "Given Answer: " + answer + " | Correct Answer: "
                            + q.getAnswer() + " | Awarded Score: -1 | Total Score: " + score;
                }
                System.out.println();
            }
        }
        for (String s : scoreDetails) {
            if (s != null) {
                System.out.println(s);
            }
        }
        return score;
    }
}
