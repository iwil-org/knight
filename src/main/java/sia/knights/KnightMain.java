package sia.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sia.knights.config.KnightConfig;

import java.io.PrintStream;

/**
 * Created by wding on 5/1/2015.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception{
        //use the configuration in xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        //use the configuration in KnightConfig
        AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
        context1.register(KnightConfig.class);
        context1.refresh();
        Knight knight1=context1.getBean(Knight.class);
        knight1.embarkOnQuest();


        Knight knight2=new DamselRescuingKnight();
        knight2.embarkOnQuest();

        //not use any configuration at all
        PrintStream stream=System.out;
        Knight knight3=new BraveKnight(new SlayDragonQuest(stream));
        knight3.embarkOnQuest();

        context.close();
        context1.close();
    }
}
