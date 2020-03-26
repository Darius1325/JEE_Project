package launch;

import user.User;

import java.util.ArrayList;

import tools.SQL;
import user.Game;


/**
 * This class links the client's and the server's sides
 * @author Sébastien HERT
 */
public class Manager{

    private static User currentUser;
    private static Game currentGame;
    private static User observedUser;

    /**
     Sets the current user
     * @param user
     * @author Sébastien HERT
     */
    public static void setCurrentUser(User user){
        currentUser = user;
    }

    /**
     * Gets the current user
     * @return currentUser
     * @author Sébastien HERT
     */
    public static User getCurrentUser(){
        return currentUser;
    }

    /**
     * Sets the current game
     * @param game
     * @author Sébastien HERT
     */
    public static void setCurrentGame(Game game){
        currentGame = game;
    }

    /**
     * Gets the current game
     * @return currentGame
     * @author Sébastien HERT
     */
    public static Game getCurrentGame(){
        return currentGame;
    }

    /**
     Sets the observed user (by admin)
     * @param user
     * @author Sébastien HERT
     */
    public static void setObservedUser(User user){
        observedUser= user;
    }

    /**
     * Gets the observed user (by admin)
     * @return observedUser
     * @author Sébastien HERT
     */
    public static User getObservedUser(){
        return observedUser;
    }

    /**
     * Alternate version of the toString method for ArrayList<String>.
     * @param list List to make a String out of.
     * @return A String containing all the elements of the list, separated by ";".
     * @author Dejan PARIS
     */
    public static String listToString(ArrayList<String> list)
    {
        String s = "";
        for (int i=2 ; i<list.size() ; i++)
            s = s + list.get(i) + ";";
        return s;
    }

    /**
     * Creates the list of games of the current player : favorite games first, then the rest.
     * @return A String containing all of the games and player numbers, separated by ";".
     * @author Dejan PARIS
     */
    public static String makeGamesList()
    {
        ArrayList<String> all = SQL.allGames();
        ArrayList<String> favs = SQL.gameList(getCurrentUser().getPseudo());
        for (int i=0 ; i<favs.size() ; i++)
        {
            int index = all.indexOf(favs.get(i));
            String game = all.remove(index); // Removes favorite games from the list
            String nbPlayers = all.remove(index);
            all.add(2, nbPlayers); // Adds back the favorites to the head of the list
            all.add(2, game);
        }
        return listToString(all);
    }

    /**
     * Returns number of games in the database.
     * @return 
     * @author Thomas LEPERCQ
     */
    public static int getGamesListLength()
    {
        ArrayList<String> favs = SQL.gameList(getCurrentUser().getPseudo());
        int len = favs.size();
        return len;
    }
}