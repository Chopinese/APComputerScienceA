public class displaycurrentTime {
    public static void main(String args[])
    {
        long totalMilliSeconds = System.currentTimeMillis();
        long hours = ((totalMilliSeconds/3600000)%24) - 4;
        long minutes = (totalMilliSeconds%3600000)/60000;
        long seconds = ((totalMilliSeconds%3600000)%60000)/1000;
        System.out.println("hours: " + hours + " minutes: " + minutes + " seconds: " + seconds);

    }
}
