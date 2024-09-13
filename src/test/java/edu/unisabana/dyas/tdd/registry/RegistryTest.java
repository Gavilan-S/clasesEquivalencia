package edu.unisabana.dyas.tdd.registry;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RegistryTest {
  Registry example = new Registry();

  @Test
  public void edadRegisterTest() {
    // Given
    Person persona = new Person("Juan",1,20,Gender.MALE,true);   

    // When
    RegisterResult result = example.edadRegister(persona);

    // Then
    assertEquals(RegisterResult.VALID, result);
  }

  @Test
  public void edadRegisterTestDos() {
    // Given
    Person persona = new Person("JuanDos",1,-10,Gender.MALE,true);   

    // When + Then
    assertThrows(IllegalArgumentException.class, () -> {
      example.edadRegister(persona); 
    });
  }

  @Test
  public void menorRegisterTest() {
    // Given
    Person persona = new Person("Sofía",2,20,Gender.FEMALE,true);   

    // When
    RegisterResult result = example.menorRegister(persona);

    // Then
    assertEquals(RegisterResult.VALID, result);
  }

  @Test
  public void menorRegisterTestDos() {
    // Given
    Person persona = new Person("SofíaDos",2,10,Gender.FEMALE,true);   

    // When + Then
    assertThrows(IllegalArgumentException.class, () -> {
      example.menorRegister(persona); 
    });
  }

  @Test
  public void muertoRegisterTest() {
    // Given
    Person persona = new Person("Santiago",3,30,Gender.MALE,true);

    // When
    RegisterResult result = example.muertoRegister(persona);

    // Then
    assertEquals(RegisterResult.VALID, result);
  }

  @Test
  public void muertoRegisterTestDos() {
    // Given
    Person persona = new Person("Santiago",2,10,Gender.FEMALE,false);   

    // When + Then
    assertThrows(IllegalArgumentException.class, () -> {
      example.muertoRegister(persona); 
    });
  }

  @Test
  public void duplicadoRegisterTest() {
    // Given
    Person personaUno = new Person("Santiago",1,10,Gender.FEMALE,false);   
    Person personaDos = new Person("Santiago",2,10,Gender.FEMALE,false);   
    ArrayList<Person> personaLista = new ArrayList<>();
    personaLista.add(personaUno);

    // When
    RegisterResult result = example.duplicadoRegister(personaLista, personaDos);

    // Then
    assertEquals(RegisterResult.VALID, result);

  }

@Test
  public void duplicadoRegisterTestDos() {
    // Given
    Person personaUno = new Person("Santiago",1,10,Gender.FEMALE,false);   
    Person personaDos = new Person("Santiago",1,10,Gender.FEMALE,false);   
    ArrayList<Person> personaLista = new ArrayList<>();
    personaLista.add(personaUno);

    // When + Then
    assertThrows(IllegalArgumentException.class, () -> {
      example.duplicadoRegister(personaLista, personaDos); 
    });
  }

  @Test
  public void registerVoter() {
    // Given
    Person persona = new Person("Mommy",3,40,Gender.FEMALE,true);

    // When
    Person result = example.registerVoter(persona);

    // Then
    assertTrue(result instanceof Person);
  }
  @Test
  public void registerVoterDos() {
    // Given
    Person persona = new Person("Mommy",3,40,Gender.FEMALE,false);

    // When
    Person result = example.registerVoter(persona);

    // Then
    assertFalse(result instanceof Person);
  }
}
