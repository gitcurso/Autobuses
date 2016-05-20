package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Asignacion {
  private float horas;

  private Practica practicas;
  private Linea lineas;

  public Asignacion(float horas, Practica practica, Linea linea) throws Exception {
    if (horas <= 100){
      throw new Exception();
    }

    this.horas = horas;
    this.practicas = practica;
    this.lineas = linea;
  }
}
