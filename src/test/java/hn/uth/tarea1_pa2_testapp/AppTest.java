package hn.uth.tarea1_pa2_testapp;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest { 
	static App calculadora;
	
	private double pi;

	private static Scanner teclado;

	private static String sel;

	private static double pi2;

	@BeforeClass
	public static void  inicializacion() {
		
   System.out.println("Iniciando Aplicacion calculadora");
   calculadora = new App();	
}
	//@AfterClass
	//public static void fin() {
		//System.out.println("Aplicacion finalisada");
		
	//}
	
	@Test 
	public void  sumaEnteroPositivos() {
   assertEquals(App.sumar(25,30),55,01);
		
}
	
	@Test
	public void  sumaEnteroNegativos() {
   assertEquals(App.sumar(-5,-1),-6,01);
		 
}
	@Test
	public void  sumaDecimalesPositivos() {
   assertEquals(App.sumar(10.1,8.3),18.4,01);
		
}
	@Test
	public void  sumaDecimalesNegativos() {
   assertEquals(App.sumar(-0.5,-0.6),-1.1,.01);
		
} 
	@Test
	public void  sumaDecimalesPequenios() {
   assertEquals(App.sumar(3.999999,4.999999), 8.999989,.01);
		
}
	@Test
	public void  sumaCeroPositivos() {
   assertEquals(App.sumar(0,5),5,01);
		
}
	@Test
	public void  restaNumeroPositivos() {
   assertEquals(App.restar(5,1),4,01);
		
}
	@Test
	public void  restaNegativosEnteros() {
   assertEquals(App.restar(-1,-1),0,01);
		
}
	@Test
	public void  restaPositivosDecimales() {
   assertEquals(App.restar(3.4,0.3),3.1,01);
		
}
	@Test
	public void  restaCeroPositivos() {
   assertEquals(App.restar(0,5),-5,01);
		
}
	@Test
	/**
	 * EL AREA DEL CIRCULO ES EN (m)2
	 */
	public void  areaCirculo() {			
		pi = 3.1416;
		assertEquals(App.circulo(3.1416,13),40.84,001);
 	
}
	@Test
	/**
	 * EL AREA DEL CIRCULO ES EN (m)2
	 */
	public void  areaCirculo1() {			
		pi = 3.1416;
		assertEquals(App.circulo(3.1416,5),15.70,001);
 	
}
	@Test
	/**
	 * EL AREA DEL CIRCULO ES EN (cm)2
	 */
	public void  areaCirculo2() {			
		pi = 3.1416;
		assertEquals(App.circulo(3.1416,15),47.12,001);
 	
}	
	@Test
	/**
	 * EL AREA DEL CIRCULO ES EN (m)2
	 */
	public void  areaCirculo3() {			
		pi = 3.1416;
		assertEquals(App.circulo(3.1416,9),28.27,001);	
 	
}
	@Test
	/**
	 * EL AREA DEL CUADRADO ES EN (m)2
	 */
	public void  areaCuadrado0() {			
		 assertEquals(App.cuadrado(6,6),36,01);	
		 	
		}
	@Test
	public void  areaCuadrado1() {			
		 assertEquals(App.cuadrado(5,5),25,01);	
		 	
		}
	@Test
	public void  areaCuadrado2() {			
		 assertEquals(App.cuadrado(3,3),9,01);	
		 	
		} 
	@Test
	public void  areaCuadrado3() {			
		 assertEquals(App.cuadrado(10,10),100,01);	
		 	
		}
	@Test 
	/**
	 * EL AREA DEL RECTANGULO ES EN (m)2
	 */
	public void  arearECTANGULO0() {			
		 assertEquals(App.rectangulo(6,4),24,001);	
		 	
		}
	@Test
	public void  arearECTANGULO1() {			
		 assertEquals(App.rectangulo(6,4),24,001);	
		 	
		}
	@Test
	public void  arearECTANGULO2() {			
		 assertEquals(App.rectangulo(6,4),24,001);	
		 	
		}
	@Test
	public void  arearECTANGULO3() {			
		 assertEquals(App.rectangulo(6,4),24,001);	
		 	
		}
	@Test
	/**
	 * EL AREA DEL TRIANGULO ES EN (m)2
	 */
	public void  areaTriangulo0() {			
		 assertEquals(App.triangulo(6,6,2),18,001);	
		 	
		} 
	@Test
	public void  areaTriangulo1() {			
		 assertEquals(App.triangulo(11,17,2),93.5,001);	
		 	
		} 
	@Test
	public void  areaTriangulo2() {			
		 assertEquals(App.triangulo(8,8,2),32,001);	
		 	 
		} 
	@Test
	public void  areaTriangulo3() {			
		 assertEquals(App.triangulo(9,6,2),27,001);	
		 	
		} 
	@AfterClass
	public static void  calculadora() {	 
		double a=0, b=0, res=0;
    	pi2 = 3.1416; 
    	sel = null;
    	teclado = new Scanner(System.in);
		assertEquals(App.calculadora(a,b),res,001);	
		 	 
		} 
  
	@AfterClass
		public static void fin() {
			System.out.println("Aplicacion finalisada");			
		 
}
}
