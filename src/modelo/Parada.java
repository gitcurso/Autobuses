package modelo;

import java.util.ArrayList;

public class Parada {
  private String nomParada;
  private Parada posicionParada;

  private ArrayList<Linea> lineas;

  public Parada(String nomParada) {
    this.nomParada = nomParada;

    lineas = new ArrayList<>();
  }

  public void addParadas(Parada posicionParada) {
    this.posicionParada = posicionParada;
  }
}
