package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Conductor {
  private String dni;
  private String nombre;

  private ArrayList<Turno> busTurno;

  public Conductor(String dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;

    busTurno = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public String toString() {
    return "Nombre: " + this.nombre + ", DNI: " + this.dni;
  }

}
