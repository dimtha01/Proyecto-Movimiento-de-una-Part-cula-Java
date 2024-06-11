package particulas;
/*
•Coordenadas: Que tendrá como atributos las coordenadas del punto
en forma cartesiana, con las siguientes operaciones:

    Constructor: recibirá como parámetros el tipo de coordenada y
    las coordenadas ya sea en forma cartesiana o polar, mediante
    el tipo se harán las asignaciones correspondientes, en el cado
    de polar se harán las conversiones a cartesiana para hacer la
    posterior asignación.

    Métodos get que permitan recuperar los valores de X e Y.
 */

public class Coordenada {
    private double x; // Almacena el valor de la coordenada x.
    private double y; // Almacena el valor de la coordenada y.

    public Coordenada(int tipo, double x, double y) {
        // Verifica si el valor de "tipo" es igual a 1.
        if (tipo == 1) {
            // Asigna los valores de "x" e "y" a los campos respectivos del objeto.
            this.x = x;
            this.y = y;
        } else {
            // Calcula los valores de "x" e "y" basándose en funciones trigonométricas
            // utilizando los valores dados de "x" e "y".
            double radianes = y * Math.PI / 180;
            this.x = x * Math.cos(radianes);
            this.y = y * Math.sin(radianes);
        }
    }

    public double getX() {
        // Devuelve el valor de la coordenada x.
        return x;
    }

    public double getY() {
        // Devuelve el valor de la coordenada y.
        return y;
    }

}
