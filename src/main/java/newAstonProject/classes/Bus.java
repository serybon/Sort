package newAstonProject.classes;

public class Bus implements Comparable<Bus>{
    private final String number;
    private final String model;
    private final int mileage;

    private Bus(BusBuilder busBuilder) {
        this.number = busBuilder.number;
        this.model = busBuilder.model;
        this.mileage = busBuilder.mileage;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }



    public static class BusBuilder {
        private String number;
        private String model;
        private int mileage;

        public BusBuilder setNumber(String number) {
            this.number = number;
            return this;
        }

        public BusBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public BusBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }

    @Override
    public int compareTo(Bus other) {
        int result = this.number.compareTo(other.number);
        if (result == 0) {
            result = this.model.compareTo(other.model);
            if (result == 0) {
                return Integer.compare(this.mileage, other.mileage);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Bus [ number: %-10s model: %-10s mileage: %-7d ]", number, model, mileage);
    }
}
