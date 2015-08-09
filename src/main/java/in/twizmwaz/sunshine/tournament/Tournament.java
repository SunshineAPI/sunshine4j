package in.twizmwaz.sunshine.tournament;

import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tournament {

    private String self;
    private String id;
    private String image;
    private String rules;
    private String alert;
    private List<TournamentTeam> teams;

    public Tournament(JSONObject object) {
        setSelf(object.getJSONObject("links").getString("self"));
        JSONObject info = object.getJSONObject("data").getJSONObject("info");
        setId(info.getString("id"));
        setImage(info.getString("image"));
        setRules(info.getString("rules"));
        setAlert(info.getString("alert"));
        setTeams(new ArrayList<TournamentTeam>());
        JSONArray teams = object.getJSONObject("data").getJSONArray("teams");
        for (int i = 0; i < teams.length(); i++)
            this.teams.add(new TournamentTeam(teams.getJSONObject(i)));
    }

}
