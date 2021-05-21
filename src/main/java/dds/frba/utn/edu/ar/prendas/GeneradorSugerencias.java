package dds.frba.utn.edu.ar.prendas;

import java.util.List;

public interface GeneradorSugerencias {
  public List<Sugerencia> generarSugerenciasDesde(List<Prenda> prendasAptas);
}
