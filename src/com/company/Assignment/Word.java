package com.company.Assignment;

public class Word {
//    英単語、日本語を保持する

    public String word;
    public String meaning;

    public Word(String word, String meaning) {
    this.word =word;
    this.meaning = meaning;
    }

    public String toString(){
        return "単語" + this.word + "意味" + this.meaning;
    }
}


