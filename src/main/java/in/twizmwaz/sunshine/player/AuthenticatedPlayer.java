package in.twizmwaz.sunshine.player;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents a {@link SunshinePlayer} who has been authenticated
 */
@Data
public class AuthenticatedPlayer extends SunshinePlayer {

    private String authToken;

    public AuthenticatedPlayer(JSONObject object, String authToken) {
        super(object);
        setAuthToken(authToken);
    }

}
