package dds.frba.utn.edu.ar;


import dds.frba.utn.edu.ar.caracteristicas.*;
import dds.frba.utn.edu.ar.clima.ServicioMeteorologico;
import dds.frba.utn.edu.ar.excepciones.PrendaOtraCategoriaException;
import dds.frba.utn.edu.ar.prendas.Prenda;
import dds.frba.utn.edu.ar.sugerencias.Atuendo;
import dds.frba.utn.edu.ar.usuarios.Guardarropa;
import dds.frba.utn.edu.ar.usuarios.Usuario;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QueMePongo4Test {
  //Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires
  @Test
  public void condicionesClimaticasDeBuenosAires() {
    Double temperaturaActual = 14.0;
    ServicioMeteorologico servicioMeteorologico = new ServicioMeteorologico("Buenos Aires, Argentina");
    assertEquals(servicioMeteorologico.temperaturaActual(), temperaturaActual, 1);
  }

  //Como usuarie de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una prenda para cada categoría
  @Test
  public void crearUnaSugerencia() {
    Atuendo atuendo = new Atuendo(prendaSuperior(), prendaInferior(), calzado(), accesorio() );
    assertEquals(atuendo.getPrendaSuperior().getCategoria(),Categoria.PARTE_SUPERIOR);
  }

  @Test
  public void noPuedoCrearlaSugerencia() {
    assertThrows(PrendaOtraCategoriaException.class, ()-> new Atuendo(prendaSuperior(), prendaSuperior(), calzado(), accesorio()));
  }

  //Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes a la temperatura actual
  // sabiendo que para cada prenda habrá una temperatura hasta la cual es adecuada.
  @Test
  public void cargarPrendasAlUsuario(){
   Usuario usuario=new Usuario("Pepe", "Buenos Aires, Argentina");
   Guardarropa guardarropa = new Guardarropa();
   usuario.agregarGuardarropa(guardarropa);
   usuario.agregarPrenda(prendaSuperior(),guardarropa);
   usuario.agregarPrenda(prendaInferior(),guardarropa);
   usuario.agregarPrenda(calzado(),guardarropa);
   usuario.agregarPrenda(accesorio(),guardarropa);
   assertEquals(usuario.getPrendas().size(),4);
  }
  @Test
  public void recibirSugerencia(){
    Usuario usuario=new Usuario("Pepe", "Buenos Aires, Argentina");
    Guardarropa guardarropa = new Guardarropa();
    usuario.agregarGuardarropa(guardarropa);
    usuario.agregarPrenda(prendaSuperior(), guardarropa);
    usuario.agregarPrenda(prendaInferior(), guardarropa);
    usuario.agregarPrenda(calzado(),guardarropa);
    usuario.agregarPrenda(accesorio(),guardarropa);
    List<Atuendo> atuendos = usuario.recibirSugerenciaClimatica();
    assertEquals(atuendos.get(0).getPrendaSuperior().getTipo(),prendaSuperior().getTipo());
  }

  Prenda prendaSuperior(){
    return new Prenda(Tipo.CHOMBA, Categoria.PARTE_SUPERIOR,new Material(Trama.LISA, Tela.ALGODON),new Color(255,255,255),null,20.0);
  }

  Prenda prendaInferior(){
    return new Prenda(Tipo.PANTALON, Categoria.PARTE_INFERIOR,new Material(Trama.LISA, Tela.ALGODON),new Color(255,255,255),null,20.0);
  }

  Prenda calzado(){
    return new Prenda(Tipo.ZAPATOS, Categoria.CALZADO,new Material(Trama.LISA, Tela.CUERO),new Color(255,255,255),null,20.0);
  }

  Prenda accesorio(){
    return new Prenda(Tipo.ANTEOJOS_DE_SOL, Categoria.ACCESORIO, new Material(Trama.LISA, Tela.ALGODON),new Color(255,255,255),null,20.0);
  }
}
