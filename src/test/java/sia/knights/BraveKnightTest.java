package sia.knights;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest=mock(Quest.class);
        BraveKnight braveKnight=new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}