import java.util.Scanner;
import java.util.ArrayList;


public class Lab3 {

    static class Question{
        private String text;
        private String answer;
        private int difficulty;

        Question(){

        }
        Question (String question, String response, int hardness){
            this.text = question;
            this.answer = response;
            this.difficulty = hardness;
        }

        void setText(String question){
            this.text = question;
        }
        void setAnswer(String response){
            this.answer = response;
        }
        void setDifficulty(int hardness){
            this.difficulty = hardness;
        }

        String getText(){
            return this.text;
        }
        String getAnswer(){
            return this.answer;
        }
        int getDifficulty(){
            return difficulty;
        }
    }

    static class Quiz {
        Scanner scan = new Scanner(System.in);
        ArrayList<Question> myQuiz = new ArrayList<Question>();

        Quiz() {

        }

        void add_question() {
            Scanner scanning = new Scanner(System.in);
            String text;
            String response;
            int hardness;
            System.out.println("What is the question Text? ");
            text = scanning.nextLine();
            System.out.println("What is the answer? ");
            response = scanning.nextLine();
            System.out.println("How Difficult (1-3)?");
            hardness = scanning.nextInt();
            myQuiz.add(new Question(text, response, hardness));
        }

        void remove_question() {
            int remove;
            int counter = 0;
            System.out.println("Choose the question to remove?");
            for (Question a : myQuiz) {
                System.out.println((counter++) + ". " + a.getText());
            }
            remove = scan.nextInt();
            myQuiz.remove(remove);
        }

        void modify_question() {
            System.out.println("Chose the question to modify?");
            int modify;
            String text;
            String answer;
            int hardness = 0;
            int counter = 0;
            for (Question a : myQuiz) {
                System.out.println(counter++ + ". " + a.getText());
            }
            Scanner scanMod = new Scanner(System.in);
            modify = scanMod.nextInt();
            scanMod.nextLine();
            System.out.println("What is the question text?");
            text = scanMod.nextLine();
            System.out.println("What is the question answer?");
            answer = scanMod.nextLine();
            System.out.println("How Difficult (1-3)?");
            hardness = scanMod.nextInt();
            myQuiz.set(modify, new Question(text, answer, hardness));
        }

        void give_quiz(){
            int correct = 0;
            String userResponseString;

            for(Question a: myQuiz){
                System.out.println(a.getText());
                userResponseString = scan.nextLine();
                if (userResponseString.equals(a.getAnswer())){
                    System.out.println("Correct");
                    correct++;
                }
                else{
                    System.out.println("Incorrect");
                }
            }
            System.out.println("You got " + correct + " out of " + myQuiz.size());
        }
    }


    public static void main(String [] args){
        String test = "a" + "b" + 7;
        System.out.println(test);
        Scanner sc = new Scanner(System.in);
        int selection = 0;
        Quiz running = new Quiz();
        while (selection != 5){
            System.out.println("1. Add a question to the quiz");
            System.out.println("2. Remove a question from the quiz");
            System.out.println("3. Modify a question in the quiz");
            System.out.println("4. Take the quiz");
            System.out.println("5. Quit");
            selection = sc.nextInt();

            switch (selection){
                case 1: running.add_question();
                break;
                case 2: running.remove_question();
                break;
                case 3: running.modify_question();
                break;
                case 4: running.give_quiz();
                break;
            }
        }

    }
}
