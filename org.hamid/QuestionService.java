package org.hamid;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1,"Capital of India: ","Patna","New Delhi","Mumbai","Lucknow","New Delhi");
        questions[1] = new Question(2,"Capital of Saudi Arabia: ","Jeddah","Dammam","Riyadh","Mecca","Riyadh");
        questions[2] = new Question(3,"Currency Of India: ","Rupee","Dollar","Dinar","Riyal","Rupee");
        questions[3] = new Question(4,"Average Age Of Human: ","50","70","80","60","60");
        questions[4] = new Question(5,"First Prime Minister Of India: ","DR R Prasad","Indira Gandhi","P J Nehru","Abul Kalam","P J Nehru");

    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Answer: ");
            selection[i] = sc.nextLine();
            i++;

        }

        System.out.println("\n-----Here Is Your Result-----\n");
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
