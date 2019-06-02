package pl.infoshare.acedemy.workshop12;

public class Address {

    private final String street;
    private final int number;
    private final String city;

    public Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public static class AddressBuilder {

        private String street;
        private int number;
        private String city;

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public Address createAddress() {
            return new Address(street, number, city);
        }
    }
}
