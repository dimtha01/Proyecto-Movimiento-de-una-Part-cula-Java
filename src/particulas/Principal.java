package particulas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Crear una lista de posiciones y una lista de tramos
        ArrayList<Posicion> pos = new ArrayList<Posicion>();
        ArrayList<Tramo> tram = new ArrayList<Tramo>();
        // Leer los datos de puntos desde un archivo y agregarlos a la lista de
        // posiciones
        Procesos.leerDatosPuntos(pos);
        // Mostrar la lista de posiciones
        Procesos.mostrarListaDePosiciones(pos);
        // Calcular los tramos entre las posiciones y agregarlos a la lista de tramos
        Procesos.listaTramos(pos, tram);
        // Mostrar la lista de tramos con sus respectivas distancias y velocidades
        Procesos.mostrarListaTramos(tram);
    }

}
