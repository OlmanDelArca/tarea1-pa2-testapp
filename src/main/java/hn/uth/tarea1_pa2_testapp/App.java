package hn.uth.tarea1_pa2_testapp;
import java.util.Scanner;
public class App

{
	public static double area;
	public static double cuadrado;
	public static double cisculo;
	private static Scanner teclado;
	
	public static void main( String[] args ){
    	double a=0, b=0, res=0;
    	double pi=3.1416;  
    	String sel=null; 
    	teclado = new Scanner(System.in);
        System.out.println( "Selecione una opcion \n" );
        System.out.println( "+: Suma"+"\n-:Resta"+"\n*:Multiplicacion"+"\n/:Division"
        		+"\n1:Circulo"+"\n2:Cuadrado"+"\n3:Rectangulo"+"\n4:Triangulo");
        sel=teclado.next();
        switch(sel) {
        case"+":
        	System.out.println( "Ha seleccionado Suma \n" );
        	System.out.println( "ingrese el primer numero" );
        	a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt(); 
        	res=a+b; 
        	System.out.println(a+"+"+b+"="+res );
        	break;       	
        case"-":
        	System.out.println( "Ha seleccionado Resta \n" );
        	System.out.println( "ingrese el primer numero" );
        	a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=a-b;
        	System.out.println(a+"-"+b+"="+res );
        	break;
        case"*":
        	System.out.println( "Ha seleccionado Multiplicacion \n" );
        	System.out.println( "ingrese el primer numero" );
        	a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=a*b;
        	System.out.println(a+"*"+b+"="+res );
        	break;
        case"/":
        	System.out.println( "Ha seleccionado Division \n" );
        	System.out.println( "ingrese el primer numero" );
        	a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=a/b;
        	System.out.println(a+"/"+b+"="+res );
        	break ;
        case"1":
        	System.out.println( "Ha seleccionado Circulo \n" );
        	System.out.println( "ingrese PI" );
        	 pi=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=pi*b;
        	System.out.println(pi+"*"+b+"="+res );
        	break ;
        case"2":
        	System.out.println( "Ha seleccionado Cuadrado \n" );
        	System.out.println( "ingrese el primer numero" );
        	 a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=a*b;
        	System.out.println(a+"*"+b+"="+res );
        	break ;
        case"3":
        	System.out.println( "Ha seleccionado Rectangulo \n" );
        	System.out.println( "ingrese el primer numero" );
        	 a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	res=a*b;
        	System.out.println(a+"*"+b+"="+res );
        	break ;
        case "4":
        	System.out.println( "Ha seleccionado Triangulo \n" );
        	System.out.println( "ingrese el primer numero" );
        	 a=teclado.nextInt();
        	System.out.println( "ingrese el segundo numero" );
        	b=teclado.nextInt();
        	double h = 2;
			res=a*b/h;
        	System.out.println(a+"*"+b+"/"+h+"="+res );
        	break ;
        	default:
        		System.out.println( "Esa opcion no existe" );
        }
    }
	
	/**
     * Este metodo suma dos numeros decimales y responde otro numero decimal
     * @param primerNumero numero decimal positivo o negativo.
     * @param segundoNumero numero decimal positivo o negativo.
     * @return contiene el resultado de la suma
     */
	public static double sumar(double primerNumero, double segundoNumero) {
		
		return primerNumero+segundoNumero;
	}

	/**
	 * Este metodo resta dos numeros decimales y responde otro numero decimal
	 * @param primerNumero numero decimal positivo o negativo.
	 * @param segundoNumero numero decimal positivo o negativo.
	 * @return contiene el resultado de la resta
	 */
	public static double restar(double primerNumero, double segundoNumero) {

		return primerNumero-segundoNumero;
	}

	/**
	 * Este metodo calcula el area de un circulo
	 * @param object 
	 * @param b
	 * @param i
	 * @return
	 */
	public static  double circulo( double pi, double primerNumero) {

		return pi*primerNumero;
		
	}

/**
 * Este metodo calcula el area de un Cuadrado
 * @param primerNumero
 * @param segundoNumero
 * @return
 */
	public static double cuadrado(double primerNumero, double segundoNumero) {

		return primerNumero*segundoNumero; 
	}

/**
 * Este metodo calcula el area de un rectangulo
 * @param PrimerNumero
 * @param segungoNumero
 * @return
 */
public static double rectangulo(double PrimerNumero, double segungoNumero) {

	return PrimerNumero*segungoNumero;
}

/**
 * Este metodo calcula el area de un triangulo
 * @param area
 * @param base
 * @param haltura
 * @return
 */
public static double triangulo(double area, double base, double haltura) {

	return area*base/haltura;
}

public static double calculadora(double teclado, double newScanner) {
	// TODO Auto-generated method stub
	return teclado+newScanner;
}


}

