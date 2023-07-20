package quotesredo;

public class Lab {

    String height;
    String hair_color;
    String birth_year;
    String name;

    public Lab(String height, String hair_color, String birth_year, String name) {
        this.height = height;
        this.hair_color = hair_color;
        this.birth_year = birth_year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "height='" + height + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class starwarsPersonResult{
    Lab properties;
    String description;

    public starwarsPersonResult(Lab properties, String description) {
        this.properties = properties;
        this.description = description;
    }

    @Override
    public String toString() {
        return "starwarsPersonResult{" +
                "properties=" + properties +
                ", description='" + description + '\'' +
                '}';
    }
}

class StarwarsPerson{
    starwarsPersonResult result;

    public StarwarsPerson(starwarsPersonResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "StarwarsPerson{" +
                "result=" + result +
                '}';
    }
}

