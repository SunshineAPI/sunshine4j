package in.twizmwaz.sunshine;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import in.twizmwaz.sunshine.player.SunshinePlayer;
import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A controller class for the SunshineAPI, allowing quick access to objects.
 */
@Getter
@Setter
public class Sunshine {

    private static String server;
    private static int port;

    private Sunshine() {
    }

    public static SunshinePlayer getPlayer(String name) throws RuntimeException {
        try {
            String url = new URL("http", server, port, "/players/name").toString();
            JSONObject object = Unirest.get(url).asJson().getBody().getObject();
            return new SunshinePlayer(object);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }

}
