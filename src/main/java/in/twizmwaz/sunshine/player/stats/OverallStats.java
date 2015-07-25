package in.twizmwaz.sunshine.player.stats;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.json.JSONObject;

/**
 * Represents overall statistics of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}'s activity
 */
@Getter
@Setter
@ToString
public class OverallStats extends GameStats {

    private int joins;
    private int raindrops;

    public OverallStats(JSONObject object) {
        super(object);
        setJoins(object.getInt("joins"));
        setRaindrops(object.getInt("raindrops"));
    }

}
