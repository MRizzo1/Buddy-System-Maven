package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void allocate_16() {
      // Arrange
      App app = new App(128);
      int actual = app.RESERVAR("A", 16);
  
      // Assert
      Assert.assertEquals(1, actual);
    } 

    @Test
    public void allocate_32_7_64() {
      // Arrange
      App app = new App(128);
      int actual = app.RESERVAR("A", 32);
      actual += app.RESERVAR("B", 7);
      actual += app.RESERVAR("C", 64);
  
      // Assert
      Assert.assertEquals(3, actual);
    } 

    @Test
    public void allocate_32_7_64_60() {
      // Arrange
      App app = new App(128);
      int actual = app.RESERVAR("A", 32);
      actual += app.RESERVAR("B", 7);
      actual += app.RESERVAR("C", 64);
      actual += app.RESERVAR("D", 60);
  
      // Assert
      Assert.assertEquals(3, actual);
    } 

    @Test
    public void allocate_16_16() {
      // Arrange
      App app = new App(128);
      int actual = app.RESERVAR("A", 16);
      actual += app.RESERVAR("B", 16);
  
      // Assert
      Assert.assertEquals(2, actual);
    } 


    @Test
    public void allocate_more_than_memory_size() {
      // Arrange
      App app = new App(128);
      int actual = app.RESERVAR("A", 200);
  
      // Assert
      Assert.assertEquals(0, actual);
    } 

    @Test
    public void allocate_failure() {
      // Arrange
      App app = new App(128);
      app.RESERVAR("A", 128);
      int actual = app.RESERVAR("B", 16);
  
      Assert.assertEquals(0, actual);
    } 

    @Test
    public void allocate_same_name() {
      // Arrange
      App app = new App(128);
      int actual =app.RESERVAR("A", 16);
      actual += app.RESERVAR("A", 30);
  
      Assert.assertEquals(1, actual);
    } 

    @Test
    public void deallocate_no_name() {
      // Arrange
      App app = new App(128);
      int actual = app.LIBERAR("A");
  
      Assert.assertEquals(0, actual);
    } 

    @Test
    public void deallocate_1() {
      // Arrange
      App app = new App(128);
      app.RESERVAR("A", 16);
      int actual = app.LIBERAR("A");
  
      Assert.assertEquals(1, actual);
    }
    
    @Test
    public void deallocate_4() {
      // Arrange
      App app = new App(128);
      app.RESERVAR("A", 16);
      app.RESERVAR("B", 16);
      app.RESERVAR("C", 16);
      app.RESERVAR("D", 16);
      int actual = app.LIBERAR("A");
      actual += app.LIBERAR("B");
      actual += app.LIBERAR("C");
      actual += app.LIBERAR("D");
  
      Assert.assertEquals(4, actual);
    }     

    @Test
    public void exit_program() {
      // Arrange
      App app = new App(128);
      app.SALIR();
  
      Assert.assertEquals(false, app.getSimulation());
    }     
}
