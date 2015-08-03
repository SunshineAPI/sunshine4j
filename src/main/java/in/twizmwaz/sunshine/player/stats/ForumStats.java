package in.twizmwaz.sunshine.player.stats;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents forum statistics of a {@link in.twizmwaz.sunshine.player.SunshinePlayer}
 */
@Data
public class ForumStats {

    private int posts;
    private int topics;

    public ForumStats(JSONObject object) {
        setPosts(object.getInt("posts"));
        setTopics(object.getInt("topics"));
    }

}
