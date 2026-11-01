package com.javarush.khmelov.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;


@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class Question implements AbstractEntity{
    private String text;

    private Long id;

    private Long questId;

    private GameState gameState;

    private final Collection<Answer> answers = new ArrayList<>();

    public String getImage() {
        return "question-" + id;
    }
}
