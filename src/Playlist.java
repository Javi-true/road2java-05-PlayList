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

        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(7);
        desertIslandPlaylist.remove(8);
        desertIslandPlaylist.remove(9);
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(4);



        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        //11.
        int SongA = desertIslandPlaylist.indexOf("Nina - el gas");
        int SongB = desertIslandPlaylist.indexOf("Alex - la diez");
        System.out.println(SongA);
        System.out.println(SongB);

        String tempA = "SongA";

        desertIslandPlaylist.set(1,"Alex - la diez" );
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(4,tempA);
        System.out.println(desertIslandPlaylist);
    }
}
