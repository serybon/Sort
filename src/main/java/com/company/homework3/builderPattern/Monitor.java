package com.company.homework3.builderPattern;

public class Monitor {
    private String vendor;
    private String model;
    private double price;
    private double monitorSize;
    private int refreshRate;

    public Monitor(String vendor, String model, double price, double monitorSize, int refreshRate) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
    }
    public MonitorBuilder toBuilder() {
        return new MonitorBuilder()
                .vendor(this.vendor)
                .model(this.model)
                .price(this.price)
                .monitorSize(this.monitorSize)
                .refreshRate(this.refreshRate);
    }
    public static class MonitorBuilder {
        String vendor;
        String model;
        double price;
        double monitorSize;
        int refreshRate;
        public MonitorBuilder vendor(String vendor) {
            this.vendor = vendor; return this;
        }
        public MonitorBuilder model(String model) {
            this.model = model; return this;
        }
        public MonitorBuilder price(double price) {
            this.price = price; return this;
        }
        public MonitorBuilder monitorSize(double monitorSize) {
            this.monitorSize = monitorSize; return this;
        }
        public MonitorBuilder refreshRate(int refreshRate) {
            this.refreshRate = refreshRate; return this;
        }
        public Monitor build(){
            return new Monitor(vendor,model,price,monitorSize,refreshRate);
        }
    }
    @Override
    public String toString() {
        return "Monitor{" + "vendor='" + vendor + '\'' + ", model='" + model + '\'' + ", price=" + price +
                ", monitorSize=" + monitorSize + ", refreshRate=" + refreshRate +'}';
    }
    public static void main(String[] args) {
        Monitor monitor = new MonitorBuilder()
                .vendor("LG").model("24GS60F-B").price(1000).refreshRate(144).monitorSize(23.8).build();
        System.out.println(monitor);
        Monitor newMonitor = monitor.toBuilder().model("Samsung").model("KL5550").build();
        System.out.println(newMonitor);
    }
}
