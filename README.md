# Playlist Program

This Java program is designed to practice working with `ArrayList` and basic Java functionality such as arrays, loops, and data manipulation. The program simulates creating a playlist of favorite songs and then refining it to a "Desert Island Playlist" — a smaller list of must-have songs.

## Features
- Create an array of favorite songs
- Print individual songs from the array
- Add songs to an `ArrayList`
- Remove specific songs from the playlist
- Swap songs within the playlist using the `set()` method
- Practice the use of the `size()`, `remove()`, and `indexOf()` methods for `ArrayList`

## How It Works
1. **Favorite Songs Array**: The program begins by creating a `String[]` array of favorite songs. It prints a few of the songs from this array.

2. **Desert Island Playlist**: An `ArrayList` called `desertIslandPlaylist` is created, initially populated with a few songs. Then, songs from the `favoriteSongs` array are added to this playlist using `addAll()`.

3. **Modifying the Playlist**: Several songs are removed from the playlist using the `remove()` method to simulate reducing the playlist for a desert island scenario.

4. **Swapping Songs**: Finally, the program demonstrates how to swap two songs by finding their indices with `indexOf()` and using `set()` to replace the songs in the playlist.