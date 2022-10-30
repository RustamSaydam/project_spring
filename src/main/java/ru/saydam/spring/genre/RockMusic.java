package ru.saydam.spring.genre;
import ru.saydam.spring.Music;



public class RockMusic implements Music {


    @Override
    public String getSong() {
        return "We well Rock you ";
    }
}

