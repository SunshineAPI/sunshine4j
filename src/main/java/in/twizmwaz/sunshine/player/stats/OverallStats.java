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
public class OverallStats {

    private int joins;
    private int raindrops;
    private String joinDate;
    private int kills;
    private int deaths;
    private double kd;
    private double kk;
    private double played;
    private double observed;
    public OverallStats(JSONObject object) {
        setKills(object.getInt("kills"));
        setDeaths(object.getInt("deaths"));
        setKd(object.getDouble("kd"));
        setKk(object.getDouble("kk"));
        setPlayed(object.getDouble("played"));
        setObserved(object.getDouble("total_observed"));
        setJoinDate(object.getString("joined"));
        setJoins(object.getInt("joins"));
        //setRaindrops(object.getInt("raindrops"));
    }

}
