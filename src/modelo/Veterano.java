package modelo;

import javax.sound.sampled.Line;
import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Veterano extends Conductor {
  private ArrayList<Lineas> lineas;

  public Veterano(String dni, String nombre) {
    super(dni, nombre);

    lineas = new ArrayList<>();
  }
}
