package in.twizmwaz.sunshine.team;

import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a team from the SunshineAPI
 */
@Data
public class SunshineTeam {

    private String self;
    private String id;
    private String name;
    private TeamStats stats;
    private int memberCount;
    private List<TeamMember> players;

    public SunshineTeam(JSONObject object) {
        setSelf(object.getString("links.self"));
        setId(object.getString("data.id"));
        setName(object.getString("data.name"));
        setStats(new TeamStats(object.getJSONObject("stats")));
        setMemberCount(object.getInt("member_count"));
        players = new ArrayList<TeamMember>();
        JSONArray array = object.getJSONArray("players");
        for (int i = 0; i < array.length(); i++) {
            players.add(new TeamMember(array.getJSONObject(i)));
        }
    }

}
