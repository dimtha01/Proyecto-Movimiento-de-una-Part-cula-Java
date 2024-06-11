package particulas;
/* 
Procesos: Que tendrá métodos estáticos
    Para leer el archivo “DatosPuntos.txt”, los cuales será
    cargados en un ArrayList de objetos de la clase Posición
    (lo recibe como parámetro)

    Para mostrar el ArrayList de la clase Posición .

    Para crear un ArrayList de la clase Tramo, el cual lo
    recibirá como parámetro así como el ArrayList de la clase
    Posición.

    Para mostrar el ArrayList de la Posición.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesos {
    public static void leerDatosPuntos(ArrayList<Posicion> pos) throws IOException {
        // Abre un archivo "DatosPuntos.txt" para leer los datos de las posiciones.
        Scanner leeArchivo = new Scanner(new File("DatosPuntos.txt"));
        Posicion posicion;
        Coordenada coordenada;
        String id;
        int hora, minutos;
        while (leeArchivo.hasNext()) {
            // Lee el identificador, las coordenadas, la hora y los minutos del archivo.
            id = leeArchivo.next();
            coordenada = new Coordenada(leeArchivo.nextInt(), leeArchivo.nextDouble(), leeArchivo.nextDouble());
            hora = leeArchivo.nextInt();
            minutos = leeArchivo.nextInt();
            // Crea una nueva posición con los datos leídos y la agrega a la lista de
            // posiciones.
            posicion = new Posicion(id, coordenada, hora, minutos);
            pos.add(posicion);
        }
        // Cierra el archivo después de leer los datos.
        leeArchivo.close();
    }

    public static void mostrarListaDePosiciones(ArrayList<Posicion> pos) {
        // Muestra la lista de posiciones con sus respectivos identificadores,
        // coordenadas, horas y minutos.
        System.out.println("id      Coordenadas X       Coordenadas Y       Horas       Minutos");
        for (int i = 0; i < pos.size(); i++) {
            pos.get(i).mostrar();
        }
    }

    public static void listaTramos(ArrayList<Posicion> pos, ArrayList<Tramo> tram) {
        // Inicialización de variables
        int bandera = 0;
        double distancia = 0;
        double velocidad = 0;
        String idTramo = "";
        Double x, y, t;
        Posicion p1 = null, p2 = null;
        Tramo tramo = null;

        // Iteración sobre la lista de posiciones
        for (int i = 0; i < pos.size(); i++) {
            if (bandera == 0) {
                // Establece el primer punto de la posición actual
                p1 = pos.get(i);
                bandera = 1;
            } else {
                // Establece el segundo punto de la posición actual
                p2 = pos.get(i);
                idTramo = p1.getId() + p2.getId();
                // Calcula la diferencia en las coordenadas x e y
                x = Math.pow(p1.getCoordenada().getX() - p2.getCoordenada().getX(), 2);
                y = Math.pow(p1.getCoordenada().getY() - p2.getCoordenada().getY(), 2);
                // Calcula la distancia entre los dos puntos
                distancia = Math.sqrt(x + y);
                // Calcula el tiempo transcurrido entre los dos puntos
                t = (p2.getHora() + (double) p2.getMinutos() / 60.0) - (p1.getHora() + p1.getMinutos() / 60.0);
                // Calcula la velocidad entre los dos puntos
                velocidad = distancia / t;
                // Crea un nuevo tramo con los datos calculados y lo agrega a la lista de tramos
                tramo = new Tramo(idTramo, distancia, velocidad);
                tram.add(tramo);
                // Actualiza el primer punto para el próximo cálculo
                p1 = p2;
            }
        }
    }

    public static void mostrarListaTramos(ArrayList<Tramo> tram) {
        // Imprime el encabezado para la lista de tramos
        System.out.println("\nidTramos  Distancias  Velocidad");
        // Itera sobre la lista de tramos y muestra cada tramo
        for (int i = 0; i < tram.size(); i++) {
            tram.get(i).mostrar();
        }
    }

}
