package in.twizmwaz.sunshine.player.stats;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents the stats of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}
 */
@Data
public class Stats {

    private ForumStats forum;
    private GameStats projectAres;
    private GameStats blitz;
    private GameStats ghostSquadron;

    public Stats(JSONObject object) {
        setForum(new ForumStats(object.getJSONObject("forum")));
        setProjectAres(new GameStats(object.getJSONObject("project_ares")));
        setBlitz(new GameStats(object.getJSONObject("blitz")));
        setGhostSquadron(new GameStats(object.getJSONObject("ghost_squadron")));
    }

}
