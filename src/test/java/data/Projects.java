package data;

public enum Projects {
    IT_PLATFORMA_MAIN_PAGE("https://it-platforma.website/");



    private final String value;


    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }


}
