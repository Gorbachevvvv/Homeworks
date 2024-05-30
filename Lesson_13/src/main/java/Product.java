import java.util.List;

enum Category {
    ELECTRONICS, CLOTHING, FOOD, BOOKS
}

class Product {
    private String name;
    private double price;
    private Category category;
    private boolean deliveryAvailable;
    private List<Store> stores;
    private Manufacturer manufacturer;

    public Product(String name, double price, Category category, boolean deliveryAvailable, List<Store> stores, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.deliveryAvailable = deliveryAvailable;
        this.stores = stores;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isDeliveryAvailable() {
        return deliveryAvailable;
    }

    public List<Store> getStores() {
        return stores;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", category=" + category + ", deliveryAvailable=" + deliveryAvailable + ", stores=" + stores + ", manufacturer=" + manufacturer + '}';
    }
}

class Manufacturer {
    private String name;
    private String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Manufacturer{name='" + name + "', country='" + country + "'}";
    }
}

class Store {
    private int number;
    private String city;
    private String address;
    private String phoneNumber;

    public Store(int number, String city, String address, String phoneNumber) {
        this.number = number;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Store{number=" + number + ", city='" + city + "', address='" + address + "', phoneNumber='" + phoneNumber + "'}";
    }
}