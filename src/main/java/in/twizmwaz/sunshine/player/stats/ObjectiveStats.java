package in.twizmwaz.sunshine.player.stats;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents the objective statistics of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}
 */
@Data
public class ObjectiveStats {

    private int monuments;
    private int cores;
    private int wools;

    public ObjectiveStats(JSONObject object) {
        setMonuments(object.getInt("monuments"));
        setCores(object.getInt("cores"));
        setWools(object.getInt("wools"));
    }

}
