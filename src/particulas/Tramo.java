package particulas;
/* 
 Tramo: Que tendrá como atributos la identificación del tramo
(P1P2 para el primero P2P3 para el segundo etc.), la distancia
del tramo y la velocidad con que Q recorrió el tramo. Con las
siguientes operaciones:

    Constructor: recibirá como parámetros la identificación
        del tramo, la distancia, y la velocidad.
    Método que muestre los valores de los atributos con
        salida formateada.
 */

public class Tramo {
    private String id; // Almacena el identificador del tramo.
    private double distancia; // Almacena la distancia del tramo.
    private double velocidad; // Almacena la velocidad del tramo.

    public Tramo(String id, double distancia, double velocidad) {
        this.id = id; // Asigna el valor del identificador del tramo.
        this.distancia = distancia; // Asigna el valor de la distancia del tramo.
        this.velocidad = velocidad; // Asigna el valor de la velocidad del tramo.
    }

    public void mostrar() {
        // Muestra la información de la posición, incluyendo el identificador, las
        // Distancias, la Velocidad.
        System.out.printf("%-4 %7.2f %7.2f\n", this.id, this.distancia, this.velocidad);
        // %-4: Este marcador de posición indica que el identificador se mostrará
        // justificado a la izquierda en un ancho de 4 caracteres.
        // %7.2f: Este marcador de posición indica que la coordenada x se mostrará en un
        // ancho de 7 caracteres, con 2 decimales.
    }
}
