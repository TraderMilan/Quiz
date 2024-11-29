import lib.Answer;
import lib.Question;
import lib.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Question question1 = new Question("Kolko je 4^3? ", 1, new ArrayList<>(), "c");
        Question question2 = new Question("Ako dostaneme 8? ", 2, new ArrayList<>(), "ab" );
        Question question3 = new Question("8 krat kolko je 64? ", 1, new ArrayList<>(), "a");
        Question question4 = new Question("Ktory vyraz je pravdivy?", 3,new ArrayList<>(), "abd");

        Answer answer1 = new Answer ("a) 12");
        Answer answer2 = new Answer("b) 16");
        Answer answer3 = new Answer("c) 64");
        question1.addAnswer(answer1);
        question1.addAnswer(answer2);
        question1.addAnswer(answer3);

        Answer answer1Q2 = new Answer ("a) 2^3");
        Answer answer2Q2 = new Answer ("b) 4*2");
        Answer answer3Q2 = new Answer ("c) 4^2");
        question2.addAnswer(answer1Q2);
        question2.addAnswer(answer2Q2);
        question2.addAnswer(answer3Q2);

        Answer answer1Q3 = new Answer ("a) 8");
        Answer answer2Q3 = new Answer ("b) 4");
        Answer answer3Q3 = new Answer ("c) 64");
        question3.addAnswer(answer1Q3);
        question3.addAnswer(answer2Q3);
        question3.addAnswer(answer3Q3);

        Answer answer1Q4= new Answer ("a) 2^0 = 1");
        Answer answer2Q4= new Answer ("b) -5 > -15");
        Answer answer3Q4 = new Answer ("c) 2+2 = 22");
        Answer answer4Q4 = new Answer ("d) 8^2 = 64");

        question4.addAnswer(answer1Q4);
        question4.addAnswer(answer2Q4);
        question4.addAnswer(answer3Q4);
        question4.addAnswer(answer4Q4);

        ArrayList<Question> listOfQuestions = new ArrayList<>();

        Quiz quiz = new Quiz(listOfQuestions);

        listOfQuestions.add(question1);
        listOfQuestions.add(question2);
        listOfQuestions.add(question3);
        listOfQuestions.add(question4);

        System.out.println("Welcome to Math Quiz! ");
        System.out.println("Can you solve these 4 questions? ");

        int count = 0;
        int playerPoints = 0;
        while (count != listOfQuestions.size()) {
            quiz.printQuestion(listOfQuestions.get(count));

            System.out.println("Type your guess! ");
            String guess = scanner.nextLine();
            if (guess.trim().equals(listOfQuestions.get(count).getRightAnswer())) {
                playerPoints++;
            }
            count++;
        }
        System.out.println("Uspesnost tvojich odpovedi bola: " + playerPoints + " zo 4");
    }
}
