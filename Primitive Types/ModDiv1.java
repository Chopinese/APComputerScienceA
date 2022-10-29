public class ModDiv1 {
    public static void main(String args[])
    {
        long totalMilliSeconds = System.currentTimeMillis();
        long hours;
        boolean newday = false;;
        if (((totalMilliSeconds/3600000)%24) - 4 < 0)
        {
            hours = 12 + (((totalMilliSeconds/3600000)%24) - 4);
            newday = true;
        }
        else
        {
            hours = ((totalMilliSeconds/3600000)%24) - 4;
        }
        
        long minutes = (totalMilliSeconds%3600000)/60000;
        if (minutes < 10)
        {
            if (newday == true)
            {
                System.out.println(hours + ":0" + minutes + " pm");
            }
            else if (hours < 12)
            {
                System.out.println(hours + ":0" + minutes + " am");
            }
            else 
            {
                hours-=12;
                System.out.println(hours + ":0" + minutes + " pm");
            }
        }
        else
        {
            if (newday == true)
            {
                System.out.println(hours + ":" + minutes + " pm");
            }
            else if (hours < 12)
            {
                System.out.println(hours + ":" + minutes + " am");
            }
            else 
            {
                hours-=12;
                System.out.println(hours + ":" + minutes + " pm");
            }
        }


    }
}
