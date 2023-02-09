import java.util.Scanner;
public class GuessMovie {

    public String getMovie(int totalMovies, Scanner movieFile){
        int randNum = (int) (Math.random() * totalMovies);
        for(int i =0 ; i < randNum; i++){
            movieFile.nextLine();
        }
        return movieFile.nextLine();
    }

    public String buildBlank(String movie){
        String blank = "";
        int movieLen = movie.length();
        for (int i = 0; i < movieLen; i++) {
            char letter = movie.charAt(i); // current character evaluated is assigned to letter
            if (letter == ' ') { // if letter is a " ",
                blank += " "; // add a space to blank String
            } else { // for everything else
                blank += "_"; // add an "_"
            }
        }
        return blank;
    }
}