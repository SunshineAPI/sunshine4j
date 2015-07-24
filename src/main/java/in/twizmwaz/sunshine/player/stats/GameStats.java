package in.twizmwaz.sunshine.player.stats;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents game statistics of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}
 */
@Data
public class GameStats {

    private int kills;
    private int deaths;
    private double kd;
    private double kk;
    private double played;
    private double observed;

    public GameStats(JSONObject object) {
        setKills(object.getInt("kills"));
        setDeaths(object.getInt("deaths"));
        setKd(object.getDouble("kd"));
        setKk(object.getDouble("kk"));
        setPlayed(object.getDouble("played"));
        setObserved(object.getDouble("observed"));
    }

}
