package uni.fmi.oopmodel;

public class MainClass {
    public static void main(String[] args) {
        Battery iPhoneBattery = new Battery("Apple", BatteryType.LiIon, 20, 24);
        Display iPhoneDisplay = new Display(6, 255);
        MobilePhone iPhone = new MobilePhone("X", "Apple", 2000, "None",
                iPhoneBattery, iPhoneDisplay);

        Battery samsungBattery = new Battery("Samsung", BatteryType.LiIon, 20, 24);
        Display samsungDisplay = new Display(6, 255);
        MobilePhone samsungGalaxy = new MobilePhone("Galaxy S10", "Samsung", 2000,
                "None", samsungBattery, samsungDisplay);

        MobilePhone[] phones = new MobilePhone[2];
        phones[0] = iPhone;
        phones[1] = samsungGalaxy;

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i]);
        }
    }
}
