public enum PlaneType {
    BOEING737(162),
    BOEING747(524),
    BOEING767(296),
    BOEING777(396),
    BOEING787(280),
    AIRBUS320(180),
    AIRBUS330(277),
    AIRBUS350(325),
    AIRBUS380(650);

    private final int seating;

    PlaneType(int seating) {
        this.seating = seating;
    }

    public int getSeating() {
        return seating;
    }
}
