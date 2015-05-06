package sia.knights;

import java.io.PrintStream;

/**
 * Created by wding on 4/30/2015.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream=stream;
    }
    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
