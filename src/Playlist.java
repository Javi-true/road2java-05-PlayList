import java.util.Arrays;
import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args){

        String[] favoriteSongs = {"Alex - la uno", "Alex - la dos","Alex - la tres","Alex - la cuatro","Alex - la cinco","Alex - la seis","Alex - la siete","Alex - la ocho","Alex - la nueve","Alex - la diez"};

        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("Nina - popo");
        desertIslandPlaylist.add("Nina - pipi");
        desertIslandPlaylist.add("Nina - moloca");
        desertIslandPlaylist.add("Nina - el gas");
        desertIslandPlaylist.add("Nina - churrito");

        System.out.println(desertIslandPlaylist);


        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    }
}
