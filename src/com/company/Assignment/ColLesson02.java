package com.company.Assignment;
import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");
        Word[] words = new Word[10];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index= 0;
        while(!input.equals("e")){
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0],tmp[1]);
            words[index] = wd;
            index++;

            input= sc.nextLine();
        }

        int i=0;
        for (i=0; i<index ;i++){
            System.out.println(words[i]);

        }
        System.out.println(i+"件登録しています");
    }
}

