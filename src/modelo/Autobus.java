package modelo;

import java.util.ArrayList;

/**
 * Creado por Andrés
 */

public class Autobus{
  private String  matricula;
  private int plazas;

  private Linea linea;
  private ArrayList<BusTurno> busTurnos;


  public Autobus(String matricula, int plazas, Linea linea) throws Exception {
    if(matricula== null || plazas<0 || linea==null) {
      throw new Exception();

    }
    this.matricula = matricula;
    this.plazas = plazas;
    this.linea = linea;

    busTurnos = new ArrayList<>();
  }

  public void addTurno ( BusTurno turno) throws Exception {
    if (turno==null) {
      throw new Exception();
    }
    busTurnos.add(turno);


  }
}
