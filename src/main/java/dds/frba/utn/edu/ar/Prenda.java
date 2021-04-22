package dds.frba.utn.edu.ar;
public class Prenda {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario = null;

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrimario, Color colorSecundario) {
    try{
      this.chequearPrendaCompleta(categoria, tipo, material, colorPrimario);
      this.chequearTipo(categoria, tipo);
      this.tipo = tipo;
      this.material = material;
      this.colorPrimario = colorPrimario;
      this.colorSecundario = colorSecundario;
      System.out.println("Se creo la prenda!");
    }catch(Exception exception){
      System.out.println(exception);
    }
  }

  private void chequearPrendaCompleta(Categoria categoria, Tipo tipo, Material material, Color color) throws Exception {
    if(categoria == null || tipo == null || material== null || color == null){
      throw new Exception("Prenda incompleta");
    }
  }

  private void chequearTipo(Categoria categoria, Tipo tipo) throws Exception {
    if(!tipo.esCategoriaValida(categoria)){
      throw new Exception("Categoria no es válida");
    }
  }


  public Tipo getTipo() {
    return tipo;
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

