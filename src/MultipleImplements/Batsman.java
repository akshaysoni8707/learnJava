package MultipleImplements;

interface batsmanInterface{
int getRuns();
void setRuns(int runs);
}


public class Batsman extends Cricketer implements batsmanInterface
{
int runs;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}
