
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top ten players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics of Philadelphia");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Statistics of Philadelphia ordered by points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
