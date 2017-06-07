package norsys.demo.main;

import norsys.demo.outils.Calculatrice;

public class Main{
    public static void main( String[] args ){
	String helloWorld = "Hello World !";
	Calculatrice calculatrice = new Calculatrice();
        System.out.println( "Hello World! "+calculatrice.somme(1,1));
    }
}
