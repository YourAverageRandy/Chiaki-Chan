package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by Randy on 7/23/2016.
 */
public class showOff implements Command{
    private String help = "Usage: ~showoff";
    private String message0 = "I'm Chiaki Nanami, but you can call me Chiaki!";
    private String message1 = "I'm a student at Hope's Peak Academy!";
    private String message2 = "I like all kinds of games, so they call me the Ultimate Gamer.";
    private String message3 = "I'm 160cm, 48kg, and my bust is 88cm. My favourite game is Gala Omega!";
    private String chiaki = "http://static.zerochan.net/Nanami.Chiaki.full.1391230.jpg";
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(chiaki);
        event.getTextChannel().sendMessage(message0);
        event.getTextChannel().sendMessage(message1);
        event.getTextChannel().sendMessage(message2);
        event.getTextChannel().sendMessage(message3);
    }

    @Override
    public String help() {
        return help;
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        return;
    }
}
