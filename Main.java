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

        User ykpa = new User("Y'Vin Kpa",
                """
                        I am a student at UNCG majoring in Computer Science. During my free time, I like to read books,
                        watch films, and learn new things. When I am not home, I like to take my camera with me to
                        to places and take pictures and videos. In addition, I also like to go fishing, hiking, and do
                        fun activities with my family or friends.
                        """
        );
        classList.add(ykpa);

        User adam = new User("Adam Cichoski",
                """
                        I am a junior in Computer Science at UNCG. I am from Las Vegas, Nevada and lived there until I 
                        started college. I am now married and I have little free time, but when I do get free time I love
                        to play Elden Ring or Lies of P. I am currently reading The Hobbit, and will proceed to read 
                        The Lord of the Rings series when I complete it. 
                        """
        );
        classList.add(adam);

        User sam = new User("Sam Clendenin",
                """
                        I am Computer Science student at UNCG. I am in my last year and going for my Bachelors degree.
                        My coding skills arent the best but im trying hard to improve them. I like video games, music, 
                        and soccer. I hope to learn a lot from this class!
                        """
        );
        classList.add(sam);

        User amclean = new User("Annica McLean",
                """
                        I am currently getting my Computer Science degree form UNCG. I like both listening and 
                        playing music. One of my favorite ways to pass the time is to sleep. I also enjoy reading 
                        and the book I am current reading is "The One Thing" by Gary Keller. 
                        """);

        classList.add(amclean);

        User jsao = new User("Jonathan Sao" ,
                """
                       I am a undergraduate at UNCG. I like to spend my time looking at code and playing games. Besides
                       being indoors all day, I also like to workout and play volleyball or go fishing/hiking.
                       """);
        classList.add(jsao);

        User lchristian = new User("Logan Christian" ,
                """
                       I am a student at UNCG with the major of Computer Science and a minor in Information Technology. I hold 10 internation titles
                       for martial arts within the NBL (National Blackbelt League) and I am a second degree blackbelt. I was at one point ranked 17th
                       internationally for martial arts as well. I also enjoy playing games of any kind board game or video games. I also enjoy time with
                       my fiancee whom I proposed to on August 4th of this year. My top 3 foods are BBQ Ribs, Sushi, and Street Tacos.
                       """);
        classList.add(lchristian);

        /*
        ADD YOURSELF TO THE LIST AS SHOWN ABOVE.
         */                             
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
