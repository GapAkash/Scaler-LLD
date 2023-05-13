package design_pattern.singleton_139;

public enum SingletonEnum {
    INSTANCE;

    private String data;

    SingletonEnum() {
        // Initialize the singleton instance
        data = "Initial data";
    }

    public void setData(String newData) {
        // Set the data of the singleton instance
        data = newData;
    }

    public String getData() {
        // Get the data of the singleton instance
        return data;
    }

    // Additional methods and fields can be included here
    // ...

    public static void main(String[] args) {
        // Access the singleton instance
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        // Use the singleton instance
        System.out.println("Data: " + singleton.getData()); // Output: Initial data

        // Update the data of the singleton instance
        singleton.setData("New data");

        // Use the updated data of the singleton instance
        System.out.println("Data: " + singleton.getData()); // Output: New data
    }
}

