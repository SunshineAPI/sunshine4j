package in.twizmwaz.sunshine;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import in.twizmwaz.sunshine.player.SunshinePlayer;
import in.twizmwaz.sunshine.team.SunshineTeam;
import lombok.Data;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A controller object for SunshineAPI, allowing quick access to objects.
 */
@Data
public class Sunshine {

    private String server;
    private int port;

    public String getServer(){
        return this.server;
    }
    public int getPort(){
        return this.port;
    }

    public Sunshine(String server, int port){
        setServer(server);
        setPort(port);
    }

    public SunshinePlayer getPlayer(String name) throws RuntimeException {
        try {
            String url = server  + "/players/" + name;
            JSONObject object = Unirest.get(url).asJson().getBody().getObject();
            return new SunshinePlayer(object);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public SunshineTeam getTeam(String name) throws RuntimeException {
        try {
            String url = new URL("http", server, port, "/teams/" + name).toString();
            JSONObject object = Unirest.get(url).asJson().getBody().getObject();
            System.out.print(object.toString());
            return new SunshineTeam(object);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }

}
