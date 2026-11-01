package com.javarush.khmelov.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Answer implements AbstractEntity{

    private Long id;

    private Long questionId;

    private String text;

    private Long nextQuestionId;


}
