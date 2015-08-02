package in.twizmwaz.sunshine.player;

import lombok.Data;
import org.json.JSONException;
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
        try {
            if (!object.getString("skype").equals(null)) {
                setSkype(object.getString("skype"));
            }
        }
        catch(JSONException e){

        }
        try{
        if(!object.getString("steam").equals(null)){
            setSteam(object.getString("steam"));
        }}
        catch(JSONException e){

        }
        try{if(!object.getString("twitter").equals(null)){
            setTwitter(object.getString("twitter"));
        }}
        catch(JSONException e){

        }
        try{if(!object.getString("twitch").equals(null)){
            setTwitch(object.getString("twitch"));

        }}
        catch(JSONException e){

        }
        try{if(!object.getString("facebook").equals(null)){
            setFacebook(object.getString("facebook"));
        }}
        catch(JSONException e){

        }
        try{if(!object.getString("github").equals(null)) {
            setGithub(object.getString("github"));
        }}
        catch(JSONException e){

        }
        try{if(!object.getString("reddit").equals(null)){
            setReddit(object.getString("reddit"));
        }}
        catch(JSONException e){

        }
        try{if(!object.getString("youtube").equals(null)){
            setYoutube(object.getString("youtube"));
        }}
        catch(JSONException e){

        }
        setBio(object.getString("bio"));
    }

}
