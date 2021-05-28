package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.prendas.Prenda;

import java.util.List;

public interface GeneradorSugerencias {
  public List<Atuendo> generarSugerenciasDesde(List<Prenda> prendasAptas);
}
