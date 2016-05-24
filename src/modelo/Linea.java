package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linea {
  // Atributos
  private int numLinea;

  // Resultado de la normalización
  private ArrayList<Asignadas> asignaciones;
  private ArrayList<ConductorVeterano> conductorVeteranos;
  private ArrayList<Autobus> autobuses;
  private ArrayList<ParadaEnLinea> paradas;

  public Linea(int numLinea) throws Exception {
    if (numLinea < 0) {
      throw new Exception();
    }

    this.numLinea = numLinea;

    asignaciones = new ArrayList<>();
    conductorVeteranos = new ArrayList<>();
    autobuses = new ArrayList<>();
    paradas = new ArrayList<>();
  }
}
