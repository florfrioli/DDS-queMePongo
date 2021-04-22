package dds.frba.utn.edu.ar;

public enum Tipo {
  ZAPATOS(Categoria.CALZADO),
  BOTAS(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO),
  CROCS(Categoria.CALZADO),
  CAMISAMANGACORTA(Categoria.PARTESUPERIOR),
  REMERAMANGACORTA(Categoria.PARTESUPERIOR),
  REMERAMANGALARGA(Categoria.PARTESUPERIOR),
  MUSCULOSA(Categoria.PARTESUPERIOR),
  PANTALON(Categoria.PARTEINFERIOR),
  PANUELO(Categoria.ACCESORIO),
  ANTEOJOSDESOL(Categoria.ACCESORIO);

  Categoria categoria;

  Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Boolean esCategoriaValida(Categoria categoria) {
    return this.categoria.equals(categoria);
  }
}

