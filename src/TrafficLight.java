public class TrafficLight {

    private String colour;
    private int duration;

    public TrafficLight(String colour, int duration) {

        setColour(colour);
        setDuration(duration);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // method to change colour
    public static void changeColour(TrafficLight traffic) {

        String newColour = (traffic.isItRed() == true) ? "green" : "red";


        // add delay for the light.
        long expectedTime = System.currentTimeMillis();

        while (true) {//Or any Loops
            while(System.currentTimeMillis() < expectedTime){
                //Empty Loop
            }

            expectedTime += traffic.getDuration();
            traffic.setColour(newColour);
            System.out.println("Traffic light illuminates " + newColour);
        }
    }

    // method to check red or green
    public boolean isItRed() {

        boolean lightCondition = (getColour() == "red");
        if (lightCondition == true) {
            System.out.println("Traffic light illuminates Red");
        } else {
            System.out.println("Traffic light illuminates Green");
        }

        return lightCondition;
    }
}
