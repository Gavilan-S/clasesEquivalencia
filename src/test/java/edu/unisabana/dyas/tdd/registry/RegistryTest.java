package edu.unisabana.dyas.tdd.registry;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
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

}
