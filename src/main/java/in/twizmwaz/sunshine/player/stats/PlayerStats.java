package in.twizmwaz.sunshine.player.stats;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents the stats of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}
 */
@Data
public class PlayerStats {

    private ForumStats forum;
    private OverallStats overall;
    private ObjectiveStats objectives;
    private GameStats projectAres;
    private GameStats blitz;
    private GameStats ghostSquadron;

    public PlayerStats(JSONObject object) {
        setForum(new ForumStats(object.getJSONObject("forum")));
        setOverall(new OverallStats(object.getJSONObject("overall")));
        setObjectives(new ObjectiveStats(object.getJSONObject("objectives")));
        setProjectAres(new GameStats(object.getJSONObject("project_ares")));
        setBlitz(new GameStats(object.getJSONObject("blitz")));
        setGhostSquadron(new GameStats(object.getJSONObject("ghost_squadron")));
    }

}
