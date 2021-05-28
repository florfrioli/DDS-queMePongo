package dds.frba.utn.edu.ar.sugerencias;

import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.usuarios.Guardarropa;
import dds.frba.utn.edu.ar.usuarios.Usuario;

public class RecomendacionAgregar implements Recomendacion{
  private Prenda prenda;
  private Guardarropa guardarropa;

  public RecomendacionAgregar(Prenda prenda, Guardarropa guardarropa) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  @Override
  public void aplicarEn(Usuario usuario) {
    usuario.agregarPrenda(prenda,guardarropa);
  }

  @Override
  public Recomendacion getRecomendacionInversa() {
    return new RecomendacionQuitar(prenda,guardarropa);
  }
}
