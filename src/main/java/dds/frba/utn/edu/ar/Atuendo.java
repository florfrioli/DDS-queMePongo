package dds.frba.utn.edu.ar;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  private List<Prenda> prendas = new ArrayList<>();

  public Atuendo(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(List<Prenda> prendas) {
    this.prendas = prendas;
  }
}
