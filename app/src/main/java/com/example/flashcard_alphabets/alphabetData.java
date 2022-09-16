package com.example.flashcard_alphabets;

public class alphabetData {
    private String alphabetName;
    private Integer alphabetImage;

    public alphabetData(String alphabetName, Integer alphabetImage) {
        this.alphabetName = alphabetName;
        this.alphabetImage = alphabetImage;
    }

    public String getAlphabetName() {
        return alphabetName;
    }

    public void setAlphabetName(String alphabetName) {
        this.alphabetName = alphabetName;
    }

    public Integer getAlphabetImage() {
        return alphabetImage;
    }

    public void setAlphabetImage(Integer alphabetImage) {
        this.alphabetImage = alphabetImage;
    }
}
