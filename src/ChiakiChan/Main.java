package ChiakiChan;

import ChiakiChan.Commands.*;
import ChiakiChan.Utilities.CommandParser;
import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.HashMap;

/**
 * Created by Randy on 7/21/2016.
 */
public class Main {
    public static JDA Chiaki;
    public static final CommandParser parser = new CommandParser();

    public static HashMap<String,Command> commands = new HashMap<String, Command>();
    public static void main(String args[]) throws LoginException, InterruptedException {
        try{
            Chiaki = new JDABuilder().addListener(new BotListener()).setBotToken(ChiakiChan.Utilities.Credentials.token).buildBlocking();
            Chiaki.setAutoReconnect(true);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        commands.put("greet", new greet());
        commands.put("galaomega", new galaOmega());
        commands.put("animequote", new animeQuote());
        commands.put("showoff", new showOff());
        commands.put("zzz", new zzz());
        commands.put("doyouloveme", new love());
        commands.put("wakeup", new wakeUp());
    }
    public static void handleCommand(CommandParser.CommandContainer cmd) {
        if(commands.containsKey(cmd.invoke)) {
            boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);
            if(safe) {
                commands.get(cmd.invoke).action(cmd.args, cmd.event);
                commands.get(cmd.invoke).executed(safe, cmd.event);
            }
            else {
                commands.get(cmd.invoke).executed(safe, cmd.event);
            }
        }
    }
}