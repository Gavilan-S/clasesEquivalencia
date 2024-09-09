package edu.unisabana.dyas.tdd.registry;

public class Registry {
  public RegisterResult registerVoter(Person person) {

    // Edad Invalida

    if(person.getAge() <= 0) {
      throw new IllegalArgumentException("Edad invalida");
    } 

    // Menor de eddd
    
    if(person.getAge() < 18) {
      throw new IllegalArgumentException(person.getName() + " menor de edad");
    }

    // Muerto

    if(person.isAlive() == false) {
      throw new IllegalArgumentException(person.getName() + " registrado como muerto");
    }

    // Duplicado


    // Valido
    
    return RegisterResult.VALID;
  }
}
