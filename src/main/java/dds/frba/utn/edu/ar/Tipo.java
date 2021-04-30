package dds.frba.utn.edu.ar;

public enum Tipo {
  ZAPATOS(Categoria.CALZADO),
  BOTAS(Categoria.CALZADO),
  ZAPATILLAS(Categoria.CALZADO),
  CROCS(Categoria.CALZADO),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  REMERA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  REMERA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  MUSCULOSA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  PANUELO(Categoria.ACCESORIO),
  ANTEOJOS_DE_SOL(Categoria.ACCESORIO);

  Categoria categoria;

  Tipo(Categoria categoria) {
    this.categoria = categoria;
  }

  public Boolean esCategoriaValida(Categoria categoria) {
    return this.categoria.equals(categoria);
  }
}

