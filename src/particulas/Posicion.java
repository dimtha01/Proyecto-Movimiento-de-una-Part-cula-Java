package particulas;
/* 
•Posicion: Que tendrá como atributos la identificación del punto, un
objeto de la clase coordenadas, las horas y los minutos que tardo en
llegar al punto, con las siguientes operaciones:

    Constructor: recibirá como parámetros la identificación, la
        referencia del objeto coordenadas, las horas y los minutos.
        
    Métodos get: para recuperar la información de cada uno de los
        atributos, y uno para mostrar la información de los mismos con
        salida formateada. 
*/
public class Posicion {
    private String id; // Almacena el identificador de la posición.
    private Coordenada coordenada; // Almacena las coordenadas de la posición.
    private int hora; // Almacena la hora de la posición.
    private int minutos; // Almacena los minutos de la posición.

    public Posicion(String id, Coordenada coordenada, int hora, int minutos) {
        this.id = id; // Asigna el valor del identificador de la posición.
        this.coordenada = coordenada; // Asigna el valor de las coordenadas de la posición.
        this.hora = hora; // Asigna el valor de la hora de la posición.
        this.minutos = minutos; // Asigna el valor de los minutos de la posición.
    }

    public String getId() {
        // Devuelve el identificador de la posición.
        return id;
    }

    public Coordenada getCoordenada() {
        // Devuelve las coordenadas de la posición.
        return coordenada;
    }

    public int getHora() {
        // Devuelve la hora de la posición.
        return hora;
    }

    public int getMinutos() {
        // Devuelve los minutos de la posición.
        return minutos;
    }

    public void mostrar() {
        // Muestra la información de la posición, incluyendo el identificador, las
        // coordenadas, la hora y los minutos.
        System.out.printf("%-4 %7.2f %7.2f %3d %3d\n", id, coordenada.getX(), coordenada.getY(), hora, minutos);
        //%-4: Este marcador de posición indica que el identificador se mostrará justificado a la izquierda en un ancho de 4 caracteres.
        //%7.2f: Este marcador de posición indica que la coordenada x se mostrará en un ancho de 7 caracteres, con 2 decimales.
        //%3d: Este marcador de posición indica que la hora se mostrará en un ancho de 3 caracteres como un número entero.
    }
}
