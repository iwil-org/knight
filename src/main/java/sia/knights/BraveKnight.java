package sia.knights;

/**
* This is only a test for cherry pick command
 * Created by wding on 4/30/2015.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest=quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
