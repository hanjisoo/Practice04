package com.javaex.problem05;

public class SoundApp {

    public static void main(String[] args) {
    	Soundable c =  new Cat();
    	Soundable d = new Dog();
    	Soundable s = new Sparrow();
    	Soundable du = new Duck();
    	
    	printSound(c);
        printSound(d);
        printSound(s);
        printSound(du);
    }

    public static void printSound( Soundable soundable ) {
        //구현
    	System.out.println(soundable.sound());
    }
    
}
