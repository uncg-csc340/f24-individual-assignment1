import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE_NAME = "about-me.txt";

    public static void main(String[] args) {
        List<User> classList = new ArrayList<>();

        User sunny = new User("Sunny Ntini",
                """
                        I am a lecturer of Computer Science. I have an MS in Comp Sci from UNCG, and a BS in Computer
                        Science from Indiana University of Pennsylvania. I like (some) superheroes and puzzles. Just
                        like most basic people, I like hiking. I also like history tidbits (ask me about my favorite
                        podcasts). I'm currently reading Failure Is An Option by H. Jon Benjamin (Bob's Burgers)
                        This is the way.
                        """
        );
        classList.add(sunny);

        User nandor = new User("Nandor DeLaurentis",
                """
                        I was a very ferocious warrior in the Ottoman Empire, which meant doing a lot of things. A lot
                        of pillaging. People would say 'hey please don’t pillage me' and I would say 'nooooo, I’m
                        pillaging everyone, you included'. I was relentless. They would call me Nandor The Relentless.
                        Because I just never relent.
                        """
        );
        classList.add(nandor);


        User trinity = new User("Trinity Boler",
                """
                        Hi! I’m a computer science major set to graduate next semester, and I’m excited for what the
                        future holds. In my spare time, I love to read, tackle jigsaw puzzles, and do diamond painting.
                        I’m also currently learning how to crochet, which has been a fun new challenge. When I’m not
                        studying or crafting, you can find me playing Cult of the Lamb on my Switch.
                        """
        );
        classList.add(trinity);
        writeFile(classList);
    }

    private static void writeFile(List<User> classList) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(FILE_NAME);
            for (User user : classList) {
                writer.write(user.toString());
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
