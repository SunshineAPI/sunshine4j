package in.twizmwaz.sunshine.tournament;

import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Data
public class TournamentTeam {

    String name;
    String id;
    String leader;
    int memberCount;
    List<String> members;
    int registrationId;
    String registrationStatus;
    String registrationDate;

    public TournamentTeam(JSONObject object) {
        setName(object.getString("name"));
        setId(object.getString("id"));
        setLeader(object.getString("leader"));
        setMemberCount(object.getInt("member_count"));
        setMembers(new ArrayList<String>());
        JSONArray members = object.getJSONArray("members");
        for (int i = 0; i < members.length(); i++) this.members.add(members.getString(i));
        setRegistrationId(object.getJSONObject("tourney").getInt("id"));
        setRegistrationStatus(object.getJSONObject("tourney").getString("status"));
        setRegistrationDate(object.getJSONObject("tourney").getString("registered"));
    }

}
