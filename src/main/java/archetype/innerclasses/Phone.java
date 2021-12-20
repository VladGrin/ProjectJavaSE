package archetype.innerclasses;

import lombok.ToString;

@ToString
public class Phone {

    private final int id;
    private final String model;
    private final String country;
    private final String company;
    private final double cost;
    private final int rem;
    private final double display;

    private Phone(PhoneBuilder phoneBuilder) {
        this.id = phoneBuilder.id;
        this.model = phoneBuilder.model;
        this.country = phoneBuilder.country;
        this.company = phoneBuilder.company;
        this.cost = phoneBuilder.cost;
        this.rem = phoneBuilder.rem;
        this.display = phoneBuilder.display;
    }

    static class PhoneBuilder{
        private int id;
        private String model;
        private String country;
        private String company;
        private double cost;
        private int rem;
        private double display;

        public PhoneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PhoneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PhoneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PhoneBuilder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public PhoneBuilder setRem(int rem) {
            this.rem = rem;
            return this;
        }

        public PhoneBuilder setDisplay(double display) {
            this.display = display;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
