public class Eagle implements Fly{
    private final String name;
    private int altitude;

    public Eagle(String name, int altitude) {
        this.name = name;
        this.altitude = 0;
    }

    @Override
    public void takeOff() {
    System.out.println(name + "takes off in the sky");
    }

    @Override
    public void flyUp(int altitude) {
   this.altitude += altitude;
   System.out.println(name + "flies upward, altitude: " + this.altitude);
    }

    @Override
    public void glide() {
    System.out.println("glides into  the air");
    }

    @Override
    public void flyDown(int altitude) {
    this.altitude -= altitude;
        System.out.println(name + " flies downward, altitude: " + this.altitude);
    }
    @Override
    public void land() {
    if (this.altitude > 1) {
        System.out.println(name + "is too high, it can't land.");
    } else {
     System.out.println(name + "lands on the ground");
    }
    }
}



