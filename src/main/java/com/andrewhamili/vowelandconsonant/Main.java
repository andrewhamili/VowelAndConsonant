package com.andrewhamili.vowelandconsonant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrew
 */
public class Main {
    
    private static List<Character> vowelList = new ArrayList<>();
    
    public static void main(String[] args){
        vowelList.add('a');
        vowelList.add('e');
        vowelList.add('i');
        vowelList.add('o');
        vowelList.add('u');
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word:");
        String input = scanner.nextLine();
        
        Count count = countCharacters(input);
        
        System.out.println(count.toString());
        
    }
    
    private static Count countCharacters(String word){
        Count count = new Count();
        count.setConsonant(0);
        count.setVowel(0);
        word = word.replace("\\s", "");
        
        for(Character a: word.toCharArray()){
            if(vowelList.contains(a)){
                count.setVowel(count.getVowel() + 1);
            }else{
                count.setConsonant(count.getConsonant() + 1);
            }
        }
        
        return count;
        
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class Count{
        Integer vowel;
        Integer consonant;
    }
    
}
