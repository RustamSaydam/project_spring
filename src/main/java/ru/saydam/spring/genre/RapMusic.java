package ru.saydam.spring.genre;
import ru.saydam.spring.Music;

public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "Pick Up ";
    }
}
