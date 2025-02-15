public class MiniMidlet {
    public void startApp() {
        System.out.println("MIDlet started!");
    }

    public void pauseApp() {
        System.out.println("MIDlet paused.");
    }

    public void destroyApp(boolean unconditional) {
        System.out.println("MIDlet destroyed.");
    }
}