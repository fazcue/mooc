
import java.util.ArrayList;

/**
 *
 * @author facu
 */
public class PointList {
    private ArrayList<Integer> list;
    private int passingGrade;
    private int[] grades;
    
    public PointList() {
        this(new ArrayList(), 50);
    }
    
    public PointList(ArrayList<Integer> list, int passingGrade) {
        this.list = list;
        this.passingGrade = passingGrade;
        this.grades = new int[6];
    }
    
    protected void add(int point) {
        list.add(point);
    }
    
    protected int getSum() {
        int sum = 0;
        
        for (int point : list) {
            sum += point;
        }
        
        return sum;
    }
    
    protected double getAverage() {
        return 1.0 * getSum() / list.size();
    }
    
    protected double getAveragePassing() {
        int sum = 0;
        int count = 0;
        
        for (int point : list) {
            if (point >= passingGrade) {
                sum += point;
                count++;
            }
        }
        
        if (count > 0) {
            return 1.0 * sum / count;
        }
        
        return -1;
    }
    
    protected double getPassPercentage() {
        int totalPassing = 0;
        
        for (int point : list) {
            if (point >= passingGrade) {
                totalPassing++;
            }
        }
        
        return 100 *  1.0 * totalPassing / list.size();
    }
    
    protected void calculateGrades() {
        for (int point : list) {
            if (point < 50) {
                grades[0]++;
                continue;
            }
            
            if (point < 60) {
                grades[1]++;
                continue;
            }
            
            if (point < 70) {
                grades[2]++;
                continue;
            }
            
            if (point < 80) {
                grades[3]++;
                continue;
            }
            
            if (point < 90) {
                grades[4]++;
                continue;
            }
            
            if (point >= 90) {
                grades[5]++;
            }
        }
    }
    
    protected int[] getGrades() {
        calculateGrades();
        return grades;
    }
}
