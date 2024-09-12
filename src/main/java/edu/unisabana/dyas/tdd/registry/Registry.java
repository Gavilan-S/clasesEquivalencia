package edu.unisabana.dyas.tdd.registry;

import java.util.ArrayList;
import java.util.List;

public class Registry {
  private List<Person> personaLista;

  public Person registerVoter(Person persona) {
    try {
      edadRegister(persona);
      menorRegister(persona);
      muertoRegister(persona); 
    } catch (Exception e) {
      System.err.println("Error en el registro de: " + persona.getName());
    } 
    return persona;
  }

  // Edad Invalida
  public RegisterResult edadRegister(Person persona) {

    if(persona.getAge() <= 0) {
      throw new IllegalArgumentException(persona.getName() + " edad invalida");
    } else {
      return RegisterResult.VALID;
    }
  }

  // Menor de eddd
  public RegisterResult menorRegister(Person persona) {

    if(persona.getAge() < 18) {
      throw new IllegalArgumentException(persona.getName() + " menor de edad");
    } else {
      return RegisterResult.VALID;
    }
  }

  // Muerto
  public RegisterResult muertoRegister(Person persona) {
    if(persona.isAlive() == false) {
      throw new IllegalArgumentException(persona.getName() + " registrado como muerto");
    } else {
      return RegisterResult.VALID;
    }
  }

}
