/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsfinal;
import java.util.*;
/**
 *
 * @author Chad Kim
 */
public class APCSFinal {
public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Welcome to Verba Suscitata");
        System.out.println("Please choose a number 1-5: ");
        int storyNumber = number.nextInt();
        if(storyNumber == 1)
        {
            mary();
        }
        else if(storyNumber == 2)
        {
            scary();
        }
        else if(storyNumber == 3)
        {
            gen();
        }
        else if(storyNumber == 4)
        {
            haik();
        }
        else if(storyNumber == 5)
        {
            nan();
        }
    }

    public static void mary() {
        System.out.println("Mary Had a Little ____");
        System.out.println("----------------------");
        Scanner console = new Scanner(System.in);
        System.out.print("Input a noun: ");
        String nounOne = console.next();
        System.out.print("Another noun: ");
        String nounTwo = console.next();
        System.out.print("Input Adjective: ");
        String adjective = console.next();
        System.out.print("Input a past-tense verb: ");
        String verb = console.next();
        System.out.println();
        System.out.println("Mary had a little " + nounOne);
        System.out.println("Its " + nounTwo + " was " + adjective + " as snow");
        System.out.println("And everywhere that Mary " + verb);
        System.out.println("The " + nounOne + " was sure to go.");
    }

    /**
     * The original Mad Lib example
     */
    public static void scary() {
        System.out.println("The Car Story");
        System.out.println("-------------");
        Scanner console = new Scanner(System.in);
        System.out.print("Input an exclamation: ");
        String exclamation = console.next();
        System.out.print("Input an adverb: ");
        String adverb = console.next();
        System.out.print("Input a noun: ");
        String noun = console.next();
        System.out.print("Input an adjective: ");
        String adjective = console.next();
        System.out.println();
        System.out.print(exclamation + "! he said " + adverb);
        System.out.println(" as he jumped into his convertible");
        System.out.println(noun + " and drove off with his " + adjective + " wife.");
    }
     public static void gen() {
        System.out.println("Simple Sentences");
        System.out.println("-----------------");
        Scanner gen = new Scanner(System.in);
        System.out.print("Input an Adjective: ");
        String ad1 = gen.next();
        System.out.print("Input an Animal: ");
        String an1 = gen.next();
        System.out.print("Input an Verb: ");
        String verb1 = gen.next();
        System.out.print("Input a Preposition: ");
        String prep1 = gen.next();
        System.out.print("Input an Adjective: ");
        String ad2 = gen.next();
        System.out.print("Input an Animal : ");
        String an2 = gen.next();
        System.out.print("Input an Noun : ");
        String noun1 = gen.next();
        System.out.print("Input an Noun : ");
        String noun2 = gen.next();
        System.out.print("Input an Perfect Passive Participle : ");
        String ppp = gen.next();
        System.out.print("Input an Plural Noun : ");
        String noun3 = gen.next();
        System.out.print("Input an Adjective : ");
        String ad3 = gen.next();
        System.out.print("Input an Profession : ");
        String prof = gen.next();
        System.out.print("Input an Animal : ");
        String an3 = gen.next();
        System.out.print("Input an Name ending in 'O' : ");
        String nam = gen.next();
        System.out.println("");
        System.out.println("The " + ad1 + " " + an1 + " " + verb1 + " " + prep1 + " the " + ad2 + " " + an2 + ".");
        System.out.println("");
        System.out.println("Four score and seven years ago our " + noun1 + " brought forth on this continent, a new " + noun2 + " , " + ppp + " in Liberty, and dedicated to the proposition that all " + noun3 + " are created " + ad3 + ".");
        System.out.println("");
        System.out.println("There was a " + prof + " who had a " + an3 + ",");
        System.out.println("And " + nam + " was his name-O.");
        System.out.println(nam);
        System.out.println(nam);
        System.out.println(nam);
        System.out.println("And " + nam + " was his name-O!");
     }
     public static void haik(){
        System.out.println("Haiku Generator");
        System.out.println("-----------------");
        System.out.println(" ");
        Scanner haik = new Scanner(System.in);
        System.out.print("Input a 2 Syllabele Noun: ");
        String n1 = haik.next();
        System.out.print("Input a 2 Syllabele Verb: ");
        String v1 = haik.next();
        System.out.print("Input a 1 Syllabele Noun: ");
        String n2 = haik.next();
        System.out.print("Input a 1 Syllabele Verb that takes infinitive: ");
        String v3 = haik.next();
        System.out.print("Input a 2 Syllabele Noun: ");
        String v4 = haik.next();
        System.out.print("Input a 1 Syllabele Noun: ");
        String n3 = haik.next();
        System.out.println("");
        System.out.println("The " + n1 + v1 + ".");
        System.out.println("A " + n2 + " to " + v3 + " sun as well.");
        System.out.println("Who " + v4 + " the " + n3 + ".");
     }
     public static void nan(){
     System.out.println("Man From Nantucket");
     System.out.println("------------------");
     Scanner nan = new Scanner(System.in);
     System.out.print("Input a Noun: ");
     String no1 = nan.next();
     System.out.print("Input a Noun: ");
     String no2 = nan.next();
     System.out.print("Input a Adjective: ");
     String a1 = nan.next();
     System.out.print("Input a Verb: ");
     String v1 = nan.next();
     System.out.print("Input a Verb: ");
     String v2 = nan.next();
     System.out.print("Input a Present Participle: ");
     String p1 = nan.next();
     System.out.print("Input a Noun: ");
     String no3 = nan.next();
     System.out.print("Input a Noun: ");
     String no4 = nan.next();
     System.out.print("Input a Verb: ");
     String vo3 = nan.next();
     System.out.println("");
     System.out.println("There once was a " + no1 + " from Nantucket");
     System.out.println("Who's " + no2 + " was so " + a1 + " he could " + v1 + " it ");
     System.out.println("He " + v2 + " with a grin ");
     System.out.println("While " + p1 + " his chin ");
     System.out.println("If my " + no3 + " were a " + no4 + " i could " + vo3 + " it."); 
     }
    
}
