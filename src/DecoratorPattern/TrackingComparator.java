package DecoratorPattern;

import java.util.Comparator;

public class TrackingComparator implements Comparator<Integer> {
    
    private int comparisonCount;

    public int getComparisonCount()
    {
        return comparisonCount;
    }

    public TrackingComparator()
    {
        this.comparisonCount = 0;
    }
    
    @Override
    public int compare(Integer x, Integer y) {
        this.comparisonCount++;
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}