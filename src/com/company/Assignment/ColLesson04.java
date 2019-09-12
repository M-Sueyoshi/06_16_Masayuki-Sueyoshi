package com.company.Assignment;
import java.util.ArrayList;
import java.util.Scanner;


public class ColLesson04 {
    public static void main(String[] args) {
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");
        ArrayList<Word> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index= 0;
        while(!input.equals("e")){
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            try {
                words.add(wd);
            }catch(IndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済のデータは以下になります。");
                break;
            }
            index++;

            input= sc.nextLine();
        }

        int i=0;
        for (i=0; i<index ;i++){
            System.out.println(words.get(i));

        }
        System.out.println(i+"件登録しています");
    }
}

