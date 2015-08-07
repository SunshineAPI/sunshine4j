package in.twizmwaz.sunshine.auth;

import lombok.Data;
import org.json.JSONObject;

@Data
public class AuthToken {

    private String token;

    public AuthToken(JSONObject object) {
        setToken(object.getString("token"));
    }

}
