package jackson;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("id")
    private int id;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("avatar")
    private String avatar;

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
