
package Herencia;



public class Principal { 
    public static void main (String[] args)
    {
        Cuadrado cuadrado = new Cuadrado("cuadrado","1.44m","4.80m",1.44,10,0.2f);
        Triangulo triangulo = new Triangulo ("triangulo","210cm","96.34cm",180,60,11,0.3f);
        Linea linea = new Linea ("linea","100cm","50cm",200,12,0.4f);
        Circulo circulo = new Circulo ("circulo", "28.2744cm","18.8496cm",12,13,0.5f);
        
        cuadrado.mostrardatos();
        triangulo.mostrardatos();
        linea.mostrardatos();
        circulo.mostrardatos();
        
         }
}


