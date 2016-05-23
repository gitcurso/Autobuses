package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Asignacion {
  private float horas;

  private ConductorPracticas practicas;
  private Linea lineas;

  public Asignacion(float horas, ConductorPracticas conductorPracticas, Linea linea) throws Exception {
    if (horas <= 100){
      throw new Exception();
    }

    this.horas = horas;
    this.practicas = conductorPracticas;
    this.lineas = linea;
  }
}
