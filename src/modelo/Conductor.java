package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Conductor {
  private String dni;
  private String nombre;

  private ArrayList<BusTurno> busTurno;

  public Conductor(String dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;

    busTurno = new ArrayList<>();
  }
}