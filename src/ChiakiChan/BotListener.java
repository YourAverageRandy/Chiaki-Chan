package ChiakiChan;

import net.dv8tion.jda.events.ReadyEvent;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

/**
 * Created by Randy on 7/21/2016.
 */
public class BotListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getMessage().getContent().startsWith("~") && event.getMessage().getAuthor().getId() != event.getJDA().getSelfInfo().getId()) {
            Main.handleCommand(Main.parser.parse(event.getMessage().getContent().toLowerCase(), event));
        }
    }
    @Override
    public void onReady(ReadyEvent event) {
        //Main.log("Status", "Logged in as:" + event.getJDA().getSelfInfo().getUsername());
    }
}
