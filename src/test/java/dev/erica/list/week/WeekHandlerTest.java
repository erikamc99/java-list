/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package dev.erica.list.week;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Erica
 */
public class WeekHandlerTest {

    @Test
    @DisplayName("Test para crear la semana")
    public void testCreateList() {
        WeekHandler days = new WeekHandler();
        days.createList();

        assertThat(days.getDayList(), containsInAnyOrder(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    
    }
/*
    @Test
    @DisplayName("Test para obtener los días de la semana")
    public void testGetDayList() {
            WeekList days = new WeekList();
            
    }

    @Test
    @DisplayName("Test para obtener la longitud de la lista")
    public void testGetSizeList() {
            WeekList days = new WeekList();
            
    }

    @Test
    @DisplayName("Test para oeliminar un día de la semana")
    public void testDeleteDay() {
            WeekList days = new WeekList();
            
    }

    public void testGetSpecificDay() {
        @Test
        @DisplayName("Test para obtener un día específico día de la semana")
            WeekList days = new WeekList();
            
    }

    @Test
    @DisplayName("Test para comprobar que existe un día concreto de la semana")
    public void testDayExists() {
            WeekList days = new WeekList();
            
    }

    public void testSortList() {
        @Test
        @DisplayName("Test para ordenar alfabéticamente la lista")
            WeekList days = new WeekList();
            
    }

    @Test
    @DisplayName("Test para vaciar la lista")
    public void testCleanList() {
            WeekList days = new WeekList();
            
    }
 */
}
