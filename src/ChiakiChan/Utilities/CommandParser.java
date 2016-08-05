package ChiakiChan.Utilities;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.ArrayList;

/**
 * Created by Randy on 7/22/2016.
 */
public class CommandParser {
    public CommandContainer parse(String rawIn, MessageReceivedEvent event){
        ArrayList<String> split = new ArrayList<String>();
        String rawInput = rawIn;
        String editInput = rawInput.replaceFirst("~","");
        String[] splitInput = editInput.split(" ");
        for(String s : splitInput) {
            split.add(s);
        }
        String invoke = split.get(0);
        String[] args = new String[split.size() - 1];
        split.subList(1,split.size()).toArray(args);

        return new CommandContainer(rawInput, editInput, splitInput, invoke, args, event);
    }
    public class CommandContainer {
        public final String rawInput;
        public final String editInput;
        public final String[] splitInput;
        public final String invoke;
        public final String[] args;
        public final MessageReceivedEvent event;

        public CommandContainer(String rawIn, String editInput, String[] splitInput, String invoke, String[] args, MessageReceivedEvent event) {
            this.rawInput = rawIn;
            this.editInput = editInput;
            this.splitInput = splitInput;
            this.invoke = invoke;
            this.args = args;
            this.event = event;
        }
    }
}
