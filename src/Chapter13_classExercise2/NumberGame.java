
package Chapter13_classExercise2;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

public class NumberGame {
    private int upperLimit;
    private int number;
    private int guessCount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    
    public NumberGame() {
        this(50);        
    }
    
    public  NumberGame(int upperLimit) {
        this.upperLimit = upperLimit;
        Random random = new Random();
        number = random.nextInt(upperLimit - 1) + 1;
        guessCount = 1;
        
    }

    public int getNumber() {
        return number;
    }

    public int getGuessCount() {
        return guessCount;
    }
    
    public int getUpperLimit() {
        return upperLimit;
    }
    
    public void incrementGuessCount() {
        guessCount = guessCount + 1;
    }
    
  
    
    public  long timeGap(){
        
        long startSeconds = startTime.toInstant(ZoneOffset.UTC).getEpochSecond();
        long endSeconds = endTime.toInstant(ZoneOffset.UTC).getEpochSecond();
        long elapsedTime = (endSeconds - startSeconds);
       
       return elapsedTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * @return the endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    
}
