package DecoratorPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
           tempList.add(i);
        }
        
        TrackingComparator trackingComparator = new TrackingComparator();
        Collections.sort(tempList, trackingComparator);
        System.out.println(trackingComparator.getComparisonCount());
    }
}
