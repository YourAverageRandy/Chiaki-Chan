package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import static ChiakiChan.Utilities.Credentials.isOwner;


/**
 * Created by Randy on 7/21/2016.
 */
public class greet implements Command{
    private String[] greetings = {"Hello ", "Hi ", "Hai "};
    private String message;
    private String help = "Usage: ~greet";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        message = greetings[(int)(Math.random() * 3)];
        if(isOwner(event.getAuthor().getId())) {
            event.getTextChannel().sendMessage(message + event.getAuthor().getAsMention() + "! May I be of service?");
        }
        else {
            event.getTextChannel().sendMessage(message + event.getAuthor().getAsMention() + "!");
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
