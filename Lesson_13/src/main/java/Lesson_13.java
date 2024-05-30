import java.util.*;
import java.util.stream.Collectors;


public class Lesson_13 {
    public static void main(String[] args) {
        Manufacturer apple = new Manufacturer("Apple", "USA");
        Manufacturer samsung = new Manufacturer("Samsung", "South Korea");

        Store store1 = new Store(1, "New York", "123 street", "375-1234");
        Store store2 = new Store(2, "Los Angeles", "456 vulica", "375-5678");
        Store store3 = new Store(3, "San Francisco", "789 pomestie", "375-9012");

        List<Product> products = Arrays.asList(
                new Product("iPhone", 999.99, Category.ELECTRONICS, true, Arrays.asList(store1, store2), apple),
                new Product("Galaxy S21", 799.99, Category.ELECTRONICS, true, Arrays.asList(store1, store3), samsung),
                new Product("MacBook", 1299.99, Category.ELECTRONICS, false, Arrays.asList(store2, store3), apple),
                new Product("T-Shirt", 19.99, Category.CLOTHING, true, Arrays.asList(store1), apple),
                new Product("Banana", 0.99, Category.FOOD, true, Arrays.asList(store2), samsung)
        );

        Product mostExpensive = products.stream().max(Comparator.comparingDouble(Product::getPrice)).orElse(null);
        Product cheapest = products.stream().min(Comparator.comparingDouble(Product::getPrice)).orElse(null);
        System.out.println("Most expensive product: " + mostExpensive);
        System.out.println("Cheapest product: " + cheapest);

        List<Product> deliverableProducts = products.stream().filter(Product::isDeliveryAvailable).collect(Collectors.toList());
        System.out.println("Deliverable products: " + deliverableProducts);

        Category targetCategory = Category.ELECTRONICS;
        double averagePrice = products.stream()
                .filter(p -> p.getCategory() == targetCategory)
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Average price of " + targetCategory + " products: " + averagePrice);

        Manufacturer targetManufacturer = apple;
        List<Product> productsByManufacturer = products.stream()
                .filter(p -> p.getManufacturer().equals(targetManufacturer))
                .collect(Collectors.toList());
        System.out.println("Products by " + targetManufacturer.getName() + ": " + productsByManufacturer);

        String targetCountry = "USA";
        Set<String> manufacturersByCountry = products.stream()
                .map(Product::getManufacturer)
                .filter(m -> m.getCountry().equals(targetCountry))
                .map(Manufacturer::getName)
                .collect(Collectors.toSet());
        System.out.println("Manufacturers from " + targetCountry + ": " + manufacturersByCountry);

        String targetCity = "New York";
        List<Store> storesInCity = products.stream()
                .flatMap(p -> p.getStores().stream())
                .filter(s -> s.getCity().equals(targetCity))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Stores in " + targetCity + ": " + storesInCity);

        String targetPhoneNumber = "375-1234";
        String storeAddress = products.stream()
                .flatMap(p -> p.getStores().stream())
                .filter(s -> s.getPhoneNumber().equals(targetPhoneNumber))
                .map(Store::getAddress)
                .findFirst()
                .orElse("Address not found");
        System.out.println("Store address with phone number " + targetPhoneNumber + ": " + storeAddress);

        int targetStoreNumber = 1;
        List<Product> productsInStore = products.stream()
                .filter(p -> p.getStores().stream().anyMatch(s -> s.getNumber() == targetStoreNumber))
                .collect(Collectors.toList());
        System.out.println("Products in store number " + targetStoreNumber + ": " + productsInStore);


        Map<Integer, String> storePhoneMap = products.stream()
                .flatMap(p -> p.getStores().stream())
                .distinct()
                .collect(Collectors.toMap(Store::getNumber, Store::getPhoneNumber));
        System.out.println("Store phone map: " + storePhoneMap);

        boolean allDeliverable = products.stream()
                .filter(p -> p.getCategory() == targetCategory)
                .allMatch(Product::isDeliveryAvailable);
        System.out.println("All " + targetCategory + " products deliverable: " + allDeliverable);

        long storeCount = products.stream()
                .flatMap(p -> p.getStores().stream())
                .distinct()
                .count();
        System.out.println("Number of stores: " + storeCount);

        List<Product> sortedByPrice = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("Products sorted by price : " + sortedByPrice);
    }
}
