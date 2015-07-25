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
    private int friends;
    private Profile profile;
    private Stats stats;

    public SunshinePlayer(JSONObject object) {
        setSelf(object.getString("links.self"));
        setName(object.getString("data.name"));
        setStatus(object.getString("data.status"));
        setFriends(object.getInt("data.friends"));
        setProfile(new Profile(object.getJSONObject("data.profile")));
        setStats(new Stats(object.getJSONObject("data.stats")));
    }

}
