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
    private String faceBook;
    private String github;
    private String reddit;
    private String youtube;
    private String bio;

    public Profile(JSONObject object) {
        setSkype(object.getString("skype"));
        setSteam(object.getString("steam"));
        setTwitter(object.getString("twitter"));
        setTwitch(object.getString("twitch"));
        setFaceBook(object.getString("facebook"));
        setGithub(object.getString("github"));
        setReddit(object.getString("reddit"));
        setYoutube(object.getString("youtube"));
        setBio(object.getString("bio"));
    }

}
