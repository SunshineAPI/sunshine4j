package in.twizmwaz.sunshine.player;

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

    public SunshinePlayer(JSONObject object) {
        setSelf(object.getJSONObject("links").getString("self"));
        JSONObject data = object.getJSONObject("data");
        setName(data.getString("username"));
        setStatus(data.getString("status"));
        setFriends(data.getJSONObject("friends").getInt("count"));
        setProfile(new Profile(data.getJSONObject("profile")));
        setStats(new PlayerStats(data.getJSONObject("stats")));
    }

}
