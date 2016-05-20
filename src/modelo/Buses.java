package modelo;

import java.util.ArrayList;

/**
 * Creado por Andrés
 */

public class Buses {
  private String  matricula;
  private int plazas;

  private Lineas lineas;
  private ArrayList<BusTurno> busTurnos;

  public Buses(String matricula, int plazas, Lineas lineas) {
    this.matricula = matricula;
    this.plazas = plazas;
    this.lineas = lineas;

    busTurnos = new ArrayList<>();
  }

}
