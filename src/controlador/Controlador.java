package controlador;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

import modelo.Conductor;
import modelo.Linea;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

public class Controlador {

  private HashMap<String, Conductor> conductores;
  private HashMap<Integer, Linea> lineas;

  public Controlador() {
    this.conductores = new HashMap<>();
    this.lineas = new HashMap<>();
  }

  public void addConductor(String dni, String nombre) throws Exception {
    this.conductores.put(dni, new Conductor(dni, nombre));
  }

  public void addLinea(int numLinea) throws Exception {
    if (lineas.get(numLinea) != null) { // Ya existe una linea con este numero
      throw new Exception();
    }

    this.lineas.put(numLinea, new Linea(numLinea));
  }

}
