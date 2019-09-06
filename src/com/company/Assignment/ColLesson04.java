package com.company.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        String[] hako = new String[2];
        ArrayList<String> str= new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("わからなかった単語とその意味をスペースで区切って入力してください");

        int i=0;
        while(i<10) {
            try{
                str.add(sc.nextLine());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済のデータは以下になります。");
                break;
            }
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
                String value = str.get(n);
                hako = value.split(" ");
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

