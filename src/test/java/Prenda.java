import java.util.ArrayList;
import java.util.List;

public class Prenda {
  private Tipo tipo;
  private Categoria categoria;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario = null;

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario) {
    this.tipo = tipo;
    this.categoria = categoria;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario; // --> ver como poner opcional
  }

  public Tipo getTipo() {
    return tipo;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

}

