package dds.frba.utn.edu.ar.usuarios;

import dds.frba.utn.edu.ar.prendas.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {
 List<Prenda> prendas;

  public Guardarropas() {
    this.prendas = new ArrayList<>();
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarUnaPrenda(Prenda prenda){
    prendas.add(prenda);
  }
}
