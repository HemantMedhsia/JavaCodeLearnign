public class Main {
    public static void main(String[] args) {
        QuestionServices questionServices = new QuestionServices();
        int finalScore = questionServices.displayQuestions();
        System.out.println("Your final score is: " + finalScore);
    }
}