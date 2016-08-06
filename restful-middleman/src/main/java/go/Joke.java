package go;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {

    private String type;
    private Value value;

    public Joke() {
    }

    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.getJoke();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
