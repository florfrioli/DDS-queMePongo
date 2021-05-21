package dds.frba.utn.edu.ar.prendas;

import java.util.ArrayList;

public class Atuendo {
  private ArrayList<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<>();
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }
}
