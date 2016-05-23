package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linea {
  // Atributos
  private int numLinea;

  // Resultado de la normalización
  private ArrayList<Asignacion> asignaciones;
  private ArrayList<Veterano> veteranos;
  private ArrayList<Bus> autobuses;
  private ArrayList<ParadaEnLinea> paradas;

  public Linea(int numLinea) {
    this.numLinea = numLinea;
  }
}