package MultipleImplements;

public class AllRounder extends Cricketer  implements batsmanInterface, bowlerInterface {
    int wickets, runs;

    @Override
    public int getRuns() {
        return runs;
    }

    @Override
    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public int getWickets() {
        return wickets;
    }

    @Override
    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
