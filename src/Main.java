import lib.Questions;
import lib.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("a) 12");
        answers1.add("b) 16");
        answers1.add("c) 64");
        ArrayList<String> answers2 = new ArrayList<>();
        answers2.add("a) 2^3");
        answers2.add("b) 4*2");
        answers2.add("c) 4^2");
        ArrayList<String> answers3 = new ArrayList<>();
        answers3.add("a) 8");
        answers3.add("b) 4");
        answers3.add("c) 64");
        ArrayList<String> answers4 = new ArrayList<>();
        answers4.add("a) 2^0 = 1");
        answers4.add("b) -5 > -15");
        answers4.add("c) 2+2 = 22");
        answers4.add("d) 8^2 = 64");


        Questions question1 = new Questions("Kolko je 4^3? ", "c", 1, answers1);
        Questions question2 = new Questions("Ako dostaneme 8? ", "ab", 2, answers2);
        Questions question3 = new Questions("8 krat kolko je 64? ", "a", 1, answers3);
        Questions question4 = new Questions("Ktory vyraz je pravdivy?", "abd", 3, answers4);

        ArrayList<Questions> listOfQuestions = new ArrayList<>();

        Quiz quiz = new Quiz(listOfQuestions);
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);

        System.out.println("Welcome to Math Quiz! ");
        System.out.println("Can you solve these 4 questions? ");

        int count = 0;
        int playerPoints = 0;
        while (count != listOfQuestions.size()) {
            quiz.printQuestion(listOfQuestions.get(count));

            System.out.println("Type your guess! ");
            String guess = scanner.nextLine();
            if (guess.trim().equals(listOfQuestions.get(count).getRightAnswers())) {
                playerPoints++;
            }
            count++;
        }
        System.out.println("Uspesnost tvojich odpovedi bola: " + playerPoints + " zo 4");


    }

}
