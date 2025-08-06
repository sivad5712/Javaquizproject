import java.util.Scanner;

public class quizapp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "What is 5 x 3?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?",
            "What language is used to build Android apps?",
            "Which data type is used to store decimal numbers in Java?",
            "What keyword is used to define a class in Java?",
            "Which symbol is used for single-line comments in Java?",
            "What does RAM stand for?",
            "What company originally developed Java?"
        };

        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. 8", "2. 15", "3. 10", "4. 20"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
            {"1. William Wordsworth", "2. William Shakespeare", "3. Charles Dickens", "4. J.K. Rowling"},
            {"1. Kotlin", "2. Python", "3. Swift", "4. C++"},
            {"1. int", "2. String", "3. double", "4. char"},
            {"1. define", "2. object", "3. new", "4. class"},
            {"1. //", "2. ##", "3. <!--", "4. **"},
            {"1. Random Access Memory", "2. Read Access Mode", "3. Run Active Memory", "4. Ready Access Memory"},
            {"1. Google", "2. Oracle", "3. Microsoft", "4. Sun Microsystems"}
        };

        int[] answers = {3, 2, 2, 2, 1, 3, 4, 1, 1, 4};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct was: " + answers[i] + "\n");
            }
        }

        System.out.println("You scored: " + score + "/" + questions.length);
        scanner.close();
    }
}
