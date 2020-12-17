package org.sber.lesson2.examples;

import java.util.*;

public class Tasks {
    private List<String> words;

    public Tasks(String words) {
        this.words = Arrays.asList(words.split("[\n,.:!?;\'\"—– ]+"));
    }

    public void task1(){
        HashSet<String> setOfWords = new HashSet<>(words);

        System.out.println("Количество слов: "+words.size());
        System.out.println("Количество различных слов: "+setOfWords.size());

        System.out.println(setOfWords);
    }

    public void task2(){

        List<CountWord> countWords = new ArrayList<>();
        //countWords.sort();






    }
    public void task3(){

    }
    public void task4(){}
    public void task5(){}




    public class CountWord implements Comparable<CountWord> {

        private List<String> word;

        public CountWord(List<String> words){
            this.word = words;
        }

        @Override
        public int compareTo(CountWord c) {
            return this.word.size() - word.size();
        }

        @Override
        public String toString() {
            return "CountWord{" +
                    "word=" + word +
                    '}';
        }
    }

}
