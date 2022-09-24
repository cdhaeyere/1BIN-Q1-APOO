public class TestSite {

    public static void main(String[] args) {

        Film avengers = new Film("The avengers", "action", 143);

        try {
            Film mauvaisEndgame = new Film("Avengers Endgame", "superhéros", 181, 27980000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Site superContent = new Site("www.supercontent.com");
            Film endgame = new Film("Avengers Endgame", "action", 181, 27980000);
            Serie bigbang = new Serie("The Big Bang Theory", "action",279);

            System.out.println(superContent);

            superContent.ajouter(endgame);
            superContent.ajouter(bigbang);

            System.out.println(superContent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
