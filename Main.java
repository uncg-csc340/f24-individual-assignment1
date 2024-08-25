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

        User bennett = new User("Bennett Scott",
                """
                    I am a student of Computer Science pursuing his BS at the University of North Carolina at 
                    Greensboro. I am also an IT Innovations Team intern at AAA, where I design prototypes and build 
                    websites. It's my duty to write software that is optimized, efficient, and useful to the 
                    end-user. I truly believe in the Unix philosophy, which is to avoid complexity in software
                    projects by building specific applications that are each designed to solve one specific problem 
                    well, rather than filling them with bloat by trying to solve multiple problems at once. Software 
                    I am a student of Computer Science pursuing his BS at the University of North Carolina at 
                    development is my true calling; I want to build as many applications as I can in my lifetime.
                    One day, I want to be able to confidently see myself as one of the new-age architects of digital 
                    spaces that we call software engineers.
                        
                    I also like playing Dungeons & Dragons.
                    """
        );
        classList.add(bennett);

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
