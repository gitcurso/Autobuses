package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class TipoTurno {
  private ArrayList<Turno> busTurnos;

  public TipoTurno() {
    busTurnos = new ArrayList<>();
  }

  public enum Turno {
    MAÑANA, TARDE, NOCHE;
  }

}
