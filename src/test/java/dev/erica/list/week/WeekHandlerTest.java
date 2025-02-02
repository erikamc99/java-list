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
        WeekHandler week = new WeekHandler();
        days.createList();

        assertThat(week.getDayList(), containsInAnyOrder(
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    
    }
    @Test
    @DisplayName("Test para obtener los días de la semana")
    public void testGetDayList() {
        WeekHandler week = new WeekHandler();
        week.createList();
        List<String> days = week.getDayList();
        assertThat(days, containsInAnyOrder(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));         
    }
            
    @Test
    @DisplayName("Test para obtener la longitud de la lista")
    public void testGetSizeList() {
        WeekHandler week = new WeekHandler();
        week.createList();

        assertThat(week.testGetSizeList(), is(7));
    }
            
    @Test
    @DisplayName("Test para eliminar un día de la semana")
    public void testDeleteDay() {
        WeekHandler week = new WeekHandler();
        week.createList();
        week.deleteDay("Monday");

        assertThat(week.getDayList(), not(hasItem("Monday")));
        assertThat(week.getSizeList(), is(6));    
    }

    @Test
    @DisplayName("Test para obtener un día específico día de la semana")
    public void testGetSpecificDay() {
        WeekHandler week = new WeekHandler();
        week.createList();

        assertThat(week.getSpecificDay("Thursday"), is(equalTo("Thursday")));
         
    }


    @Test
    @DisplayName("Test para comprobar que existe un día concreto de la semana")
    public void testDayExists() {
        WeekHandler week = new WeekHandler();
        week.createList();
        
        assertThat(week.dayExists("Sunday"), is(true));
        asserThat(week.dayExists("Patata"), is(false));
    }

    @Test
    @DisplayName("Test para ordenar alfabéticamente la lista")
    public void testSortList() {
        WeekHandler week = new WeekHandler();
        week.createList();
        week.sortList();

        List<String> sortedList = week.getDayList();
        assertThat(sortedList, contains("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday"));      
    }

    /*
    @Test
    @DisplayName("Test para vaciar la lista")
    public void testCleanList() {
        WeekHandler week = new WeekHandler();
        week.createList();
            
    }
 */
}
