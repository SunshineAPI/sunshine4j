package in.twizmwaz.sunshine.team;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents statistics for a {@link SunshineTeam}
 */
@Data
public class TeamStats {

    private int wools;
    private int cores;
    private int monuments;
    private double kd;
    private double kk;
    private int kills;
    private int deaths;

    public TeamStats(JSONObject object) {
        setWools(object.getInt("wools"));
        setCores(object.getInt("cores"));
        setCores(object.getInt("monuments"));
        setKd(object.getDouble("kd"));
        setKk(object.getDouble("kk"));
        setKills(object.getInt("kills"));
        setDeaths(object.getInt("deaths"));
    }

}
