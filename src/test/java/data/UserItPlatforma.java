package data;

public enum UserItPlatforma {

    login ("George"),
    password ("ITtest2020");




    private final String value;


    UserItPlatforma(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
