package uni.fmi.oopmodel;

public class MobilePhone {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery battery;
    private Display display;

    public MobilePhone(String model, String manufacturer, double price, String owner,
                       Battery battery, Display display) {
        this.setModel(model);
        this.setManufacturer(manufacturer);
        this.setPrice(price);
        this.setOwner(owner);
        this.setBattery(battery);
        this.setDisplay(display);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException("Model of mobile phone cannot be null.");
        } else if (model.trim().equals("")) {
            throw new IllegalArgumentException("Model of mobile phone cannot be empty");
        }

        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private void setManufacturer(String manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Manufacturer of mobile phone cannot be null.");
        } else if (manufacturer.length() < 2) {
            throw new IllegalArgumentException("Manufacturer of mobile phone cannot be less than 2 symbols.");
        }

        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price of mobile phone cannot be a negative number");
        }

        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner == null) {
            throw new IllegalArgumentException("Owner of mobile phone cannot be null");
        }

        this.owner = owner;
    }

    public Battery getBattery() {
        return battery;
    }

    private void setBattery(Battery battery) {
        if (battery == null) {
            throw new IllegalArgumentException("Battery of mobile phone cannot be null.");
        }

        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    private void setDisplay(Display display) {
        if (display == null) {
            throw new IllegalArgumentException("Display of mobile phone cannot be null.");
        }

        this.display = display;
    }

    @Override
    public String toString() {
        String info = String.format("Mobile Phone Model: %s, Manufacturer: %s, Price: %.2f, Owner: %s, %s, %s",
                this.model, this.manufacturer, this.price, this.owner, this.battery.toString(), this.display.toString());
        return info;
    }
}
