package model;

public class Airport {

    private String name;
    private String timezonestr;


    @Override
    public String toString() {
        return getClass().getSimpleName() + "(name=" + name + ", timezonestr=" + timezonestr + ")";
    }

    public void invariant() {
        System.out.println("Check not implemented yet. Make sure both name and timezone are provided.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezonestr() {
        return timezonestr;
    }

    public void setTimezonestr(String timezonestr) {
        this.timezonestr = timezonestr;
    }
    
    
    
}
