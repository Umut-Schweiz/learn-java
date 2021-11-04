package variables;


public class Variable01 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (char letter = 'a'; letter <= 'f'; letter++) {
                if (letter < 'f') {
                    System.out.println("deneme");
                    continue;
                }
                System.out.println(letter);
            }
        }
    }
}
