package modelo;

import java.util.ArrayList;

/**
 * Creado por Andrés
 */

public class Buses {
  private String  matricula;
  private int plazas;

  private Linea linea;
  private ArrayList<BusTurno> busTurnos;

  public Buses(String matricula, int plazas, Linea linea) {
    this.matricula = matricula;
    this.plazas = plazas;
    this.linea = linea;

    busTurnos = new ArrayList<>();
  }

}
