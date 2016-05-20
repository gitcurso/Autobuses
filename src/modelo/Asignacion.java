package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Asignacion {
  private float horas;

  private Practicas practicas;
  private Lineas lineas;

  public Asignacion(float horas, Practicas practicas, Lineas lineas) throws Exception {
    if (horas <= 100){
      throw new Exception();
    }

    this.horas = horas;
    this.practicas = practicas;
    this.lineas = lineas;
  }
}
