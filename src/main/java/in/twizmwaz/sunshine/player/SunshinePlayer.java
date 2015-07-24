package in.twizmwaz.sunshine.player;

import in.twizmwaz.sunshine.player.stats.Stats;
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
    private int kills;
    private int deaths;
    private int friends;
    private double kd;
    private double kk;
    private int joins;
    private double playingTime;
    private String raindrops;
    private Profile profile;
    private Stats stats;

    public SunshinePlayer(JSONObject object) {
        setSelf(object.getString("links.self"));
        setName(object.getString("data.name"));
        setStatus(object.getString("data.status"));
        setKills(object.getInt("data.kills"));
        setDeaths(object.getInt("data.deaths"));
        setFriends(object.getInt("data.friends"));
        setKd(object.getDouble("data.kd"));
        setKk(object.getDouble("data.kk"));
        setJoins(object.getInt("data.joins"));
        setJoins(object.getInt("data.playingtime"));
        setRaindrops(object.getString("data.raindrops"));
        setProfile(new Profile(object.getJSONObject("data.profile")));
        setStats(new Stats(object.getJSONObject("data.stats")));
    }

}
