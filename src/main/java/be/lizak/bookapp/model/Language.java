package be.lizak.bookapp.model;

public enum Language {
    DUTCH("nl"), ENGLISH("en"), POLISH("pl"), FRENCH("fr"), ITALIAN("it"), RUSSIAN("ru"), SPANISH("sp");

    private String abbreviation;
    Language(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
