package in.twizmwaz.sunshine;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import in.twizmwaz.sunshine.auth.AuthToken;
import in.twizmwaz.sunshine.player.SunshinePlayer;
import in.twizmwaz.sunshine.team.SunshineTeam;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A controller object for SunshineAPI, allowing quick access to objects.
 */
@Data
@AllArgsConstructor
public class Sunshine {

    private final String protocol;
    private final String host;
    private final int port;

    public SunshinePlayer getPlayer(String name) throws RuntimeException {
        try {
            URL url = new URL(getProtocol(), getHost(), getPort(), "/players/" + name);
            JSONObject object = Unirest.get(url.toString()).asJson().getBody().getObject();
            return new SunshinePlayer(object);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public SunshineTeam getTeam(String name) throws RuntimeException {
        try {
            String url = new URL("http", getHost(), getPort(), "/teams/" + name).toString();
            JSONObject object = Unirest.get(url).asJson().getBody().getObject();
            return new SunshineTeam(object);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }

    public AuthToken getAuthToken(String email, String password) throws RuntimeException {
        try {
            URL url = new URL(getProtocol(), getHost(), getPort(), "/players/auth");
            JSONObject response = Unirest.post(url.toString())
                    .field("email", email).field("password", password).asJson().getBody().getObject();
            return new AuthToken(response);
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (JSONException e) {
            throw new RuntimeException("Incorrect username and password", e);
        }
    }

}
