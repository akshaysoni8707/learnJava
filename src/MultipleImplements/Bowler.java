package MultipleImplements;

interface bowlerInterface{
    int getWickets();
    void setWickets(int wickets);
}


public class Bowler extends Cricketer implements bowlerInterface{
    int wickets;

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
