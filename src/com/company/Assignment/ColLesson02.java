package com.company.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {
        String[] hako = new String[2];
        String[] str = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");

        int i=0;
        while(i<10) {
            str[i] =sc.nextLine();
            if(Arrays.asList(str).contains("e")){
                System.out.println("終了します");
                System.out.println("下記の通り"+i+"件の単語が登録されました。");
                break;
            }
            i++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");

        }
        int n=0;
        for (n=0; n<i ;n++){
            try{
                hako = str[n].split(" ");
                Word words = new Word();
                words.setting(hako[0],hako[1]);
                System.out.print(words.toString());
            }catch(NullPointerException e){
                System.out.println("リストが終了しました");
                break;
            }

        }
        System.out.println(n+"件登録しています");
    }
}

