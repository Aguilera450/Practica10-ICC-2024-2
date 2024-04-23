package src.fciencias.Punto;
import java.util.Comparator;

/**
 * Clase que modela un punto en R^2.
 * @author Adrian Aguilera Moreno.
 * @version 2.0
 */

public class Punto<T> implements Comparator<T>{
    protected double coorX;
    protected double coorY;
    protected String id;
    
    /**
     * Constructor por omisión que crea un punto en el origen, i.e. crea el punto (0,0).
     */
    public Punto() {
	coorX = 0.0;
	coorY = 0.0;
	id = "O";
    }

    @Override
    public int compare (T p1, T p2) {
	return -1;
    }
    
    /**
     * Constructor por parámetros.
     * @param x Valor de doble precision en la primer entrada en la coordenada.
     * @param y Valor de doble precisión en la segunda entrada en la coordenada.
     * @param id Cadena que representa el nombre del punto.
     */
    public Punto(double x, double y, String id) {
	coorX = x;
	coorY = y;
	this.id = id;
    }
    
    /**
     * Constructor por copia.
     * @param punto {@code Punto} a copiar.
     */
    public Punto(Punto punto) {
	coorX = punto.coorX;
	coorY = punto.coorY;
	id    = punto.id;
    }
    
    /**
     * Método que calcula la distancia entre 2 puntos.
     * @param p Punto respecto al que obtendremos su distancia.
     * @return double - Distancia euclideana entre dos puntos.
     */
    public double distanciaDosPuntos(Punto p) {
	return Math.sqrt(Math.pow(coorX - p.coorX, 2) + Math.pow(coorY - p.coorY, 2));
    }

    /**
     * Método que devuelve el mínimo entre los valores en la primer posición de dos coordenadas.
     * @param p Punto a comparar.
     * @return double - El valor mínimo entre las coordenadas de la abscisa.
     */
    public double minX(Punto p) {
	return min(coorX, p.coorX);
    }
    
    /**
     * Método que devuelve el mínimo entre los valores de la segunda posición de dos cordenadas.
     * @param p Punto a comparar.
     * @return double - El valor mínimo entre las coordenadas de la ordenada.
     */
    public double minY(Punto p) {
	return min(coorY, p.coorY);
    }

    /**
     * Método que devuelve el máximo entre los valores en la primer posición de dos coordenadas.
     * @param p Punto a comparar.
     * @return double - El valor máximo entre las coordenadas de la abcisa.
     */
    public double maxX(Punto p) {
	return max(coorX, p.coorX);
    }

    /**
     * Método que devuelve el máximo entre los valores de la segunda posición de dos coordenadas.
     * @param p Punto a comprar.
     * @return double - El valor máximo entre las coordenadas de la ordenada.
     */
    public double maxY(Punto p) {
	return max(coorY, p.coorY);
    }
    
    /* Devuelve el mínimo entre 2 valores. */
    private double min(double val1, double val2) {
	return (val1 < val2) ? val1 : val2;
    }
    
    /* Devuelve el máximo entre 2 valores. */
    private double max(double val1, double val2) {
	return (val1 > val2) ? val1 : val2;
    }
   
    
    /* toString and equals. */
    
    /**
     * Método que sobre-escribe al método {@code toString} de la clase {@code Object}.
     * @return {@code String} - Representación del punto.
     */
    @Override
    public String toString() {
	return "  " + id + " : (" + coorX + ", " + coorY + ")";
    }
    
    /**
     * Método que implementa al método {@code equals}.
     * @param p {@code Punto} a verificar contra el punto que lo invoca.
     * @return {@code boolean} - {@code true} si el punto que invoca al método es
     *                                 igual que {@code p}. {@code false} en otro caso.
     */
    public boolean equals(Punto p) {
	return (coorX == p.coorX && coorY == p.coorY) ? (id.equals(p.id)) ? true : false : false;
    }    
}
