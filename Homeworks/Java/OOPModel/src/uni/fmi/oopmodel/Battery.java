package uni.fmi.oopmodel;

public class Battery {
    private String manufacturer;
    private BatteryType type;
    private double hoursIdle;
    private double hoursTalk;

    public Battery(String manufacturer, BatteryType type,
                   double hoursIdle, double hoursTalk) {
        this.setManufacturer(manufacturer);
        this.setType(type);
        this.setHoursIdle(hoursIdle);
        this.setHoursTalk(hoursTalk);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private void setManufacturer(String manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Battery manufacturer cannot be null.");
        } else if (manufacturer.length() < 2) {
            throw new IllegalArgumentException("Battery manufacturer cannot be less than 2 symbols.");
        }

        this.manufacturer = manufacturer;
    }

    public BatteryType getType() {
        return type;
    }

    private void setType(BatteryType type) {
        this.type = type;
    }

    public double getHoursIdle() {
        return hoursIdle;
    }

    private void setHoursIdle(double hoursIdle) {
        if (hoursIdle < 0) {
            throw new IllegalArgumentException("Battery hours idle cannot be a negative number.");
        }

        this.hoursIdle = hoursIdle;
    }

    public double getHoursTalk() {
        return hoursTalk;
    }

    private void setHoursTalk(double hoursTalk) {
        if (hoursTalk < 0) {
            throw new IllegalArgumentException("Battery hours talk cannot be a negative number");
        }

        this.hoursTalk = hoursTalk;
    }

    @Override
    public String toString() {
        String info = String.format("Battery Manufacturer: %s, Battery Type: %s, Battery Hours Idle: %.2f, Battery Hours talk: %.2f",
                this.manufacturer, this.type, this.hoursIdle, this.hoursTalk);
        return info;
    }
}
