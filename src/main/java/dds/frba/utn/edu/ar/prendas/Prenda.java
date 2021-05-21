package dds.frba.utn.edu.ar.prendas;
import dds.frba.utn.edu.ar.caracteristicas.*;


public class Prenda {
  private Tipo tipo;
  private Categoria categoria;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Integer temperaturaMaxima;

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario, Integer temperaturaMaxima) {
    this.categoria = categoria;
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public boolean esAptaPara(Integer temperatura) {
    return (temperatura<=temperaturaMaxima);
  }
}

