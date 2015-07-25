package in.twizmwaz.sunshine.team;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents a player in a {@link SunshineTeam}
 */
@Data
public class TeamMember {

    private String username;
    private Role role;
    private String accepted;

    public TeamMember(JSONObject object) {
        setUsername(object.getString("username"));
        setRole(Role.valueOf(object.getString("role").toUpperCase()));
        setAccepted(object.getString(object.getString("accepted")));
    }

}
