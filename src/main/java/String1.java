package string;

public class String1
{
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeAbba("Hi", "Bye"));
        System.out.println(s.makeTags("i", "Yay"));
        System.out.println(s.makeOutWord("<<>>", "Yay"));
        System.out.println(s.extraEnd("Hello"));
        System.out.println(s.firstTwo("Hello"));
        System.out.println(s.withoutEnd("Hello"));
        System.out.println(s.comboString("hi", "Hello"));
        System.out.println(s.middleThree("Candy"));
        System.out.println(s.extraFront("Hello"));
        System.out.println(s.left2("Hello"));
        System.out.println(s.hasBad("badxx"));
        System.out.println(s.conCat("abc", "cat"));
        System.out.println(s.minCat("Hello", "Hi"));
        System.out.println(s.withoutX("xHix"));
        System.out.println(s.deFront("Hello"));
        System.out.println(s.firstHalf("WooHoo"));
    }

    public String1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     *  helloName("Bob") --> "Hello Bob!"
     *  helloName("Alice") --> "Hello Alice!"
     *  helloName("X") --> "Hello X!"
     */
    public String helloName(String name) {
        //return unimplemented;
        return "Hello " + name + "!";
    }

    /*
     * Given two strings, a and b, return the result of putting them together in the order abba, 
     * e.g. "Hi" and "Bye" returns "HiByeByeHi".
     * makeAbba("Hi", "Bye") --> "HiByeByeHi"
     * makeAbba("Yo", "Alice") --> "YoAliceAliceYo"
     * makeAbba("What", "Up") --> "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    /*
     * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
     * In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
     * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     * makeTags("i", "Yay") --> "<i>Yay</i>"
     * makeTags("i", "Hello") --> "<i>Hello</i>"
     * makeTags("cite", "Yay") --> "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

    /*
     * Given an "out" string length 4, such as "<<>>", and a word, 
     *      return a new string where the word is in the middle of the out string, 
     *      e.g. "<<word>>". 
     * Note: use str.substring(i, j) to extract the String starting at index i and going up to but 
     * not including index j.
     * makeOutWord("<<>>", "Yay") --> "<<Yay>>"
     * makeOutWord("<<>>", "WooHoo") --> "<<WooHoo>>"
     * makeOutWord("[[]]", "word") --> "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,4);
    }

    /*
     * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
     * The string length will be at least 2.
     * extraEnd("Hello") --> "lololo"
     * extraEnd("ab") --> "ababab"
     * extraEnd("Hi") --> "HiHiHi"
     */
    public String extraEnd(String str) {
        int L = str.length();
        String g = str.substring(L-2,L);
        return g+g+g;
    }

    /*
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
     * If the string is shorter than length 2, return whatever there is, 
     * so "X" yields "X", and the empty string "" yields the empty string "". 
     * Note that str.length() returns the length of a string.
     * firstTwo("Hello") --> "He"
     * firstTwo("abcdefg") --> "ab"
     * firstTwo("ab") --> "ab"
     */
    public String firstTwo(String str) {
        int L = str.length();
        if(L<2)
        {
            return str;
        }
        else
        {
            return str.substring(0,2);
        }
    }

    /*
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".]
     * firstHalf("WooHoo") --> "Woo"
     * firstHalf("HelloThere") --> "Hello"
     * firstHalf("abcdef") --> "abc"
     */
    public String firstHalf(String str) {
        int L = str.length();
        return str.substring(0,(L+1)/2);
    }

    /*
     * Given a string, return a version without the first and last char, so "Hello" yields "ell". 
     * The string length will be at least 2.
     * withoutEnd("Hello") --> "ell"
     * withoutEnd("java") --> "av"
     * withoutEnd("coding") --> "odin"
     */
    public String withoutEnd(String str) {
        int L=str.length();
        return str.substring(1,L-1);
    }

    /*
     * Given 2 strings, a and b, return a string of the form short+long+short, with the 
     * shorter string on the outside and the longer string on the inside. 
     * The strings will not be the same length, but they may be empty (length 0).
     * comboString("hi", "Hello") --> "hiHellohi"
     * comboString("Hello", "hi") --> "hiHellohi"
     * comboString("aaa", "b") --> "baaab"
     */
    public String comboString(String a, String b) {
        int L1 = a.length();
        int L2 = b.length();
        if(L1<L2){
            return a+b+a;
        }
        else
        {
            return b+a+b;
        }
    }

    /*
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". 
     * The string length will be at least 3.
     * middleThree("Candy") --> "and"
     * middleThree("and") --> "and"
     * middleThree("solving") --> "lvi"
     */
    public String middleThree(String str) {
        int L = str.length();
        int h = L-3;
        if(L>3){
        return str.substring(h/2,L-(h/2));
        }
        else{
            return str;
        }
    }

    /*
     * Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
     * The string may be any length. If there are fewer than 2 chars, use whatever is there.
     * extraFront("Hello") --> "HeHeHe"
     * extraFront("ab") --> "ababab"
     * extraFront("H") --> "HHH"
     */
    public String extraFront(String str) {
        int L = str.length();
        if(L>1){
        String j = str.substring(0,2);
        return j+j+j;
    }
    else{
    return str+str+str; 
    }
    }

    /*
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
     * The string length will be at least 2.
     * left2("Hello") --> "lloHe"
     * left2("java") --> "vaja"
     * left2("Hi") --> "Hi"
     */
    public String left2(String str) {
        String t = str.substring(0,2);
        String k = str.substring(2,str.length());
        return k+t;
    }

    /*
     * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
     * such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
     * Note: use .equals() to compare 2 strings.
     * hasBad("badxx") --> true
     * hasBad("xbadxx") --> true
     * hasBad("xxbadxx") --> false
     */
    public boolean hasBad(String str) {
        String p = str.substring(0,3);
        String q = str.substring(1,4);
        if(p.equals("bad")){
            return true;
        }
        else if (q.equals("bad")){
            return true;
        }
        else{
            return false;
        }
       
    }

    /*
     * Given two strings, append them together (known as "concatenation") and return the result. 
     * However, if the concatenation creates a double-char, then omit one of the chars, 
     *     so "abc" and "cat" yields "abcat".
     * conCat("abc", "cat") --> "abcat"
     * conCat("dog", "cat") --> "dogcat"
     * conCat("abc", "") --> "abc"
     */
    public String conCat(String a, String b) {
        if(a.equals("")||b.equals("")){
            return a+b;
        }
        String one = a.substring(a.length()-1);
        String two = b.substring(0,1);
        if(one.equals(two)){
            return a+b.substring(1);
        }
        else{
            return a+b;
        }
    }

    /*
     *Given two strings, append them together (known as "concatenation") and return the result. 
     *However, if the strings are different lengths, omit chars from the longer string 
     *    so it is the same length as the shorter string. 
     *So "Hello" and "Hi" yield "loHi". 
     *The strings may be any length.
     *minCat("Hello", "Hi") --> "loHi"
     *minCat("Hello", "java") --> "ellojava"
     *minCat("java", "Hello") --> "javaello"
     */
    public String minCat(String a, String b) {
        if(a.length()>b.length()){
            String newA = a.substring(a.length()-b.length());
            return newA+b;
        }
        else if(a.length()<b.length()){
            String newB = b.substring(b.length()-a.length());
            return a+newB;
        }
        else{
        return a+b;
        }
        
    }

    /*
     * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
     * and otherwise return the string unchanged.
     * withoutX("xHix") --> "Hi"
     * withoutX("xHi") --> "Hi"
     * withoutX("Hxix") --> "Hxi"aaaax
     */
    public String withoutX(String str) {
        String f = str.substring(0,1);
        String l = str.substring(str.length()-1);
        if(f.equals("x") && l.equals("x")){
            return str.substring(1,str.length()-1);
        }
        else if(f.equals("x")){
            return str.substring(1);
        }
        else if(l.equals("x")){
            return str.substring(0,str.length()-1);
        }
        else{
            return str;
        }
    }

    /*
     * Given a string, return a version without the first 2 chars. 
     * Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
     * The string may be any length. 
     * Harder than it looks.
     * deFront("Hello") --> "llo"
     * deFront("java") --> "va"
     * deFront("away") --> "aay"
     */
    public String deFront(String str) {    
        String a = str.substring(0,1);
        String b = str.substring(1,2);
        boolean aa = a.equals("a");
        boolean bb = b.equals("b");
        if((!aa) && (!bb)){
            return str.substring(2);
        }
        else if((!aa) && (bb)){
            return str.substring(1);
        }
        else if((aa) && (!bb)){
            return a+str.substring(2);
        }
        else{
            return str;
        }
    }

}
