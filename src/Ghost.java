public class Ghost {
    private String name;
    private Integer deathPoints;
    private Integer flightHeight;
    private Integer opacity;

    public Ghost(String name, Integer deathPoints, Integer flightHeight, Integer opacity) {
        this.name = name;
        this.deathPoints = deathPoints;
        this.flightHeight = flightHeight;
        this.opacity = opacity;
    }

    public String getName() {
        return name;
    }

    public Integer getDeathPoints() {
        return deathPoints;
    }

    public Integer getFlightHeight() {
        return flightHeight;
    }

    public Integer getOpacity() {
        return opacity;
    }

}
