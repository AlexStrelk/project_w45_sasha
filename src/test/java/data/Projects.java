package data;

public enum Projects {
    IT_PLATFORMA_MAIN_PAGE("https://it-platforma.website/"),
    IT_PLATFORMA_YOUR_OBJECT_PAGE("https://5element.ua/");



    private final String value;


    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }


}
