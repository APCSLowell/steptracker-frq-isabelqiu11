import java.util.ArrayList;
public class StepTracker
{
 private int totalsteps, totaldays, activedays, mindays;
 public StepTracker(int min){
   totalsteps = 0;
   totaldays = 0;
   activedays = 0;
   mindays = min;
 }public void addDailySteps(int steps){
  totalsteps+=steps;
  totaldays++;
  if(steps>=mindays){
   activedays++;
  }
 }public int activeDays(){
return activedays;
 }
  public double averageSteps(){
   return (double) totalsteps/totaldays;
   }
} 
