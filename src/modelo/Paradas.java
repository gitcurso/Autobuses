package modelo;

import javax.lang.model.type.ArrayType;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class Paradas {
  private String nomParada;
  private Paradas posicionParada;

  private ArrayList<Lineas> lineas;

  public Paradas(String nomParada) {
    this.nomParada = nomParada;

    lineas = new ArrayList<>();
  }

  public void addParadas(Paradas posicionParada) {
    this.posicionParada = posicionParada;
  }
}
