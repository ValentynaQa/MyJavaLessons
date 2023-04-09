package HW7;

public enum SpeisesHW6 {
    DOG,
    CAT,
    FISH,
    DOMESTIC_CAT,
    UNKNOWN,
    ROBO_CAT;

    private String title;

    void Species(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static SpeisesHW6 fromTitle(String title) {
        for (SpeisesHW6 species : values()) {
            if (species.getTitle().equals(title)) {
                return species;
            }
        }
        return UNKNOWN;
    }
}

