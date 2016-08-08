package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.concurrent.TimeUnit;

import static ChiakiChan.Main.Chiaki;
import static ChiakiChan.Utilities.Credentials.isOwner;

/**
 * Created by Randy on 8/3/2016.
 */
public class wakeUp implements Command {
    private String z = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    private String period = "..................................";
    private String help = "Usage: ~wakeup";
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        int random;
        int random1 = (int)(Math.random() * 100);
        if(isOwner(event.getAuthor().getId())) {
            try {
                int random2 = random1 / 10;
                random = (int) (9 * random1 / 10.0);
                TimeUnit.SECONDS.sleep(random2);
                System.out.println("Waking up in " + random + " seconds.");
                if(random1 < 5) {
                    random1 = 5;
                }
                else{
                }
                random2 = random1 - random2 - 5;
                TimeUnit.SECONDS.sleep(random2);
                System.out.println("Waking up in 5 seconds.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Waking up in 4 seconds.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Waking up in 3 seconds.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Waking up in 2 seconds.");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Waking up in 1 second.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            random = (int)(Math.random() * 4);
            switch(random) {
                case 0:
                    event.getTextChannel().sendMessage("*yawn* Good morning my love ~~~ ");
                    break;
                case 1:
                    event.getTextChannel().sendMessage("*yawn* I'm so sleepyyy... I think I'll go back to sleep...");
                    random = (int) (Math.random() * 21 + 4);
                    random1 = (int) (Math.random() * 21 + 4);
                    event.getTextChannel().sendMessage(z.substring(0, random) + period.substring(0, random1));
                    Chiaki.shutdown();
                    break;
                case 2:
                    event.getTextChannel().sendMessage("*yawn* Good morning " + event.getAuthor().getAsMention());
                    break;
                case 3:
                    event.getTextChannel().sendMessage("*yawn* Hi " + event.getAuthor().getAsMention());
                    break;
                default:
                    event.getTextChannel().sendMessage("*yawn* I'm so sleepyyy... I think I'll go back to sleep...");
                    random = (int) (Math.random() * 21 + 4);
                    random1 = (int) (Math.random() * 21 + 4);
                    event.getTextChannel().sendMessage(z.substring(0, random) + period.substring(0, random1));
                    Chiaki.shutdown();
                    break;
        }
    }
    else {
        random = (int) (Math.random() * 21 + 4);
        random1 = (int) (Math.random() * 21 + 4);
        event.getTextChannel().sendMessage("*" + z.substring(0, random) + period.substring(0, random1) + "*");
        event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " who're you?....");
        random = (int) (Math.random() * 21 + 4);
        random1 = (int) (Math.random() * 21 + 4);
        event.getTextChannel().sendMessage("*" + z.substring(0, random) + period.substring(0, random1) + "*");
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
