package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import static ChiakiChan.Main.Chiaki;
import static ChiakiChan.Utilities.Credentials.isOwner;

/**
 * Created by Randy on 7/24/2016.
 */
public class zzz implements Command{
    private String help = "Usage: ~zzz";
    private String z = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    private String period = "..................................";
    private int random;
    private int random1;

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if (isOwner(event.getAuthor().getId())) {
            random = (int) (Math.random() * 21 + 4);
            random1 = (int) (Math.random() * 21 + 4);
            event.getTextChannel().sendMessage(z.substring(0, random) + period.substring(0, random1));
            Chiaki.shutdown();
        }
        else {
            event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + ", you're not my love!");
        }
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