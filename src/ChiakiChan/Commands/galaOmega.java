package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by Randy on 7/22/2016.
 */
public class galaOmega implements Command {
    private String help = "Usage: ~galaomega";
    private String message = "It's such an old game!\nIt's a classic, don't you think?\nIt's a total classic right?!\nI've never met someone who's played it before\nWon't you show me how good you are sometime?";
    private String galaga = "https://lh6.googleusercontent.com/-Zpt6v8rZzJY/AAAAAAAAAAI/AAAAAAAAABk/OoxZqtiyb0g/photo.jpg";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage(galaga);
        event.getTextChannel().sendMessage(message);
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
