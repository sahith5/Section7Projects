public class House {
    private int numStories;
    private int numWindows;
    private String color;


    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }
    public void setNumWindows(int numWindowsn) {
        this.numWindows = numWindowsn;
    }
    public void setColor (String color) {
        this.color = color;
    }


    public int getNumStories()
    {
        return  numStories;
    }
    public int getNumWindows()
    {
        return numWindows;
    }
    public String getColor()
    {
        return color;
    }
}
