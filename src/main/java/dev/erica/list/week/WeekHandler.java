package dev.erica.list.week;
  
import java.util.ArrayList;
import java.util.List;

public class WeekHandler {

    public List<String> dayList = new ArrayList<>();
 
    public void createList() {
        
        dayList.add("Monday");
        
        dayList.add("Tuesday");
        
        dayList.add("Wednesday");
        
        dayList.add("Thursday");
        
        dayList.add("Friday");
        
        dayList.add("Saturday");

        dayList.add("Sunday");
        
    }
    public List<String> getDayList() {
        return dayList;
    }
    
    public int getSizeList() {
        return dayList.size();
    }

    
}

