public class stepTracker{
    int daysTracked;
    int totalSteps;
    int dailySteps;
    
    public stepTracker(int minSteps){
        minSteps = minSteps2;
        daysTracked = 0;
        totalSteps = 0;
        dailySteps = 0;
    }
    
    public void addDailySteps(int dailySteps){
        totalSteps += dailySteps;
    }
    
    public double averageSteps{
        return totalSteps / daysTracked;
    }
    
    public int activeDays(){
        if(dailySteps > minSteps2){
            activeDays++;
        }
        return activeDays;
    }
    
}