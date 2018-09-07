package com.swapniljain.jokesprovider;

import java.util.Arrays;
import java.util.List;

public class Joke {

    private List<String> jokes = Arrays.asList(
            "Joke 1",
            "Joke 2",
            "Joke 3",
            "Joke 4",
            "Joke 5",
            "Joke 6",
            "Joke 7",
            "Joke 8",
            "Joke 9");

    public String getJoke() {
        int numberOfJokes = jokes.size();
        int jokeIndex = (int)(Math.random() * 100) % numberOfJokes;

        return jokes.get(jokeIndex);
    }
}
