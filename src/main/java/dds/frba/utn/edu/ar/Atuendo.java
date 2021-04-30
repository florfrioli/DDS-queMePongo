package dds.frba.utn.edu.ar;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  private ArrayList<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<>();
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }
}
