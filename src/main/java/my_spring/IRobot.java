package my_spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    private Speaker speaker = (Speaker)ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = (Cleaner) ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.speak("Я начал уборку");
        cleaner.clean();
        speaker.speak("Я закончил уборку");
    }
}
