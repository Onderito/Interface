public class Nature {
    public static void main(String[] args) {
        Eagle hawkeye = new Eagle("Hawkeye", 100);

        hawkeye.takeOff();
        hawkeye.flyUp(120);
        hawkeye.flyUp(30);
        hawkeye.glide();
        hawkeye.flyDown(140);
        hawkeye.land();
        hawkeye.flyDown(9);
        hawkeye.land();
    }
}
