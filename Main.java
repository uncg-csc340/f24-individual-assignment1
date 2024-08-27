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

        User Mogoi = new User("Mogoi Matongo",
                """
                        I am Computer Science student at UNCG. I enjoy hanging out with friends and playing sports.
                        I look forward to learning a lot this semester!
                        """
        );
        classList.add(Mogoi);

        User jacob = new User("Jacob DeBroder",
                """
                        I am a senior Computer Science student at the University of North Carolina at Greensboro. I was born in
                        Pfafftown, North Carolina. I enjoy playing video games, hanging out with family and friends, watching 
                        movies and shows, traveling, and eating good food. I also enjoy biology and hope to work in AI or robotics 
                        in the near future!
                        """
        );
        classList.add(jacob);

        User sbarber = new User("Sarah Barber",
                """
                        I'm an undergraduate Computer Science major + IT and English minor here at UNCG. I work at the 
                        UNCG Esports Arena as a PA, and I am currently the president of the burgeoning Game Development Club 
                        here on campus. I love my 3 cats, The Legend of Zelda, and my anime figure collection!
                        I'm currently reading "The King in Yellow" and can't wait to finish it-
                        """);

        classList.add(sbarber);

        User cmitchell = new User("Hunter Cain Mitchell",
                """
                        My name is Cain and I am a computer science major. I was a transfer student from Forsyth tech community college
                        I am currently a senior at UNCG and I am excited to hopefully graduate 
                        in the spring. I live with my fiance and have one dog and one cat.
                        In my free time, what little I have, I like to play video games, go camping, and fishing. I am excited to learn a lot of practical tools\s
                        for my future job and I am hopeful this class will provide it
                        """);

        classList.add(cmitchell);

        User brevelo = new User("Benjamin Revelo",
                """
                        I am a senior Computer Science student at UNCG. I like playing tennis, hanging out with friends, cooking, playing video games,
                        travelling and spending time with family. Recently I've been reading more books, the books I am currently reading are called 
                        "Mindset" and "One Hundred Years of Solitude". I am looking forward to this class!
                        """
        );
        classList.add(brevelo);
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
