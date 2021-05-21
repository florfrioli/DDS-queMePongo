package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.sugerencias.Sugerencia;

import java.util.List;

public interface GeneradorSugerencias {
  public List<Sugerencia> generarSugerenciasDesde(List<Prenda> prendasAptas);
}
