package in.twizmwaz.sunshine.player;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import in.twizmwaz.sunshine.Sunshine;
import in.twizmwaz.sunshine.player.stats.PlayerStats;
import lombok.Data;
import org.json.JSONObject;

/**
 * Represents a player from the SunshineAPI
 */
@Data
public class SunshinePlayer {

    private String self;
    private String name;
    private String status;
    private int friends;
    private Profile profile;
    private PlayerStats stats;
    private JSONObject json;
    public SunshinePlayer(JSONObject object) {
        setJson(object);
        setSelf(object.getJSONObject("links").getString("self"));
        JSONObject data = object.getJSONObject("data");
        setName(data.getString("username"));
        setStatus(data.getString("status"));
        setFriends(data.getJSONObject("friends").getInt("count"));
        setProfile(new Profile(data.getJSONObject("profile")));
        setStats(new PlayerStats(data.getJSONObject("stats")));
    }
    public AuthenticatedPlayer authenticate(String email, String password) throws UnirestException{
        Sunshine CurrentSunshine = new Sunshine("https://heroku.sunshine-api.com",8080);
        JSONObject object = Unirest.post(CurrentSunshine.getServer()+"/players/auth").field("email",email).field("password",password).asJson().getBody().getObject();
        return new AuthenticatedPlayer(this,object.getString("token"));
    }
    public String toString(){
        return json.toString(1);
    }
}
