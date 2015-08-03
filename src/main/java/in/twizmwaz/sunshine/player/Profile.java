package in.twizmwaz.sunshine.player;

import lombok.Data;
import org.json.JSONObject;

/**
 * Represents the profile of a {@link SunshinePlayer}
 */
@Data
public class Profile {

    private String skype;
    private String steam;
    private String twitter;
    private String twitch;
    private String facebook;
    private String github;
    private String reddit;
    private String youtube;
    private String bio;

    public Profile(JSONObject object) {
        if (!object.isNull("skype")) setSkype(object.getString("skype"));
        if (!object.isNull("steam")) setSteam(object.getString("steam"));
        if (!object.isNull("twitter")) setTwitter(object.getString("twitter"));
        if (!object.isNull("twitch")) setTwitch(object.getString("twitch"));
        if (!object.isNull("facebook")) setFacebook(object.getString("facebook"));
        if (!object.isNull("github")) setGithub(object.getString("github"));
        if (!object.isNull("reddit")) setReddit(object.getString("reddit"));
        if (!object.isNull("youtube")) setYoutube(object.getString("youtube"));
        setBio(object.getString("bio"));
    }

}
