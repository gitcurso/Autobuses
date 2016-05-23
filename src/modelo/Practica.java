package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Practica extends Conductor {

  private ArrayList<Linea> lineas;

  public Practica(String dni, String nombre) throws Exception {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }


}
