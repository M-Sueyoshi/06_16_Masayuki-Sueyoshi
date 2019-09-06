package com.company.Assignment;

public class Word {
//    英単語、日本語を保持する

    public String word;
    public String meaning;

    public void setting(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    @Override
public String toString(){
    return "単語:"+word+ "意味"+meaning+"\n";
}
}
