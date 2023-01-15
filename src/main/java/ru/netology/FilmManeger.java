package ru.netology;

public class FilmManeger {
    private String[] films = new String[0];
    private int limit;
    public FilmManeger(){
        this.limit = 10;

    }

    public void addFilm(String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films [i];
            
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }
    public String [] findAll(){
        return films;

    }
    public String [] findLast(){
        int resaultLength;
        if (films.length < 10){
            resaultLength = films.length;

        }else {
            resaultLength = limit;
        }

        String[] tmp = new String[resaultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp [i] = films[films.length - 1 - i];
            
        }
        return tmp;
    }



}
