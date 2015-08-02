package in.twizmwaz.sunshine.player;

import in.twizmwaz.sunshine.player.stats.PlayerStats;
import lombok.Data;
import org.json.JSONObject;

/**
 * Created by Gil on 8/2/2015.
 */
@Data
public class AuthenticatedPlayer {
    private String self;
    private String name;
    private String status;
    private int friends;
    private Profile profile;
    private PlayerStats stats;
    private String authToken;
    public AuthenticatedPlayer(SunshinePlayer player,String authToken) {
        setSelf(player.getSelf());
        setName(player.getName());
        setStatus(player.getStatus());
        setFriends(player.getFriends());
        setStats(player.getStats());
        setAuthToken(authToken);
    }

}
