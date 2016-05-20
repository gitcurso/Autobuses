package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Incidencia {
  private int codigo;
  private String nombre;

  private ArrayList<TurnoNoche> turnoNoche;

  public Incidencia(int codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;

    turnoNoche = new ArrayList<>();
  }
}
