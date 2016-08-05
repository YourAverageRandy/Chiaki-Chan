package ChiakiChan.Commands;

import ChiakiChan.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

import static ChiakiChan.Utilities.Credentials.*;

/**
 * Created by Randy on 8/3/2016.
 */
public class love implements Command{
    private String yes[] = {", of course I do, my Love <3", ", I love you!", ", of course I do, don't you?", ", we should get married.", ", I love you even if the world turns on you."};
    private String no[] = {", don't be silly.", ", I hate you!", ", go away.", ", I despise your soul.", ", get out of my sight you sick pervert.", ", go back to your anime pr0n anata wa baka hentai!", ", who even are you.", ", I have a boyfriend.", ", JUST LEAVE ME ALONE!"};
    private String noTyler[] = {", fuck off.", ", who even are you.", ", why are you so stupid", ", get away from me you pervert.", ", I have a boyfriend.", ", get out of my sight before I ban you.", ", I hate perverts like you.", ", get good at League like my Master.", ", get good at osu! like my Master.", ", why are you so persistent?! I HATE YOU.", ", JUST LEAVE ME ALONE!", ", I SWEAR TO GOD I WILL BAN YOU"};
    private String help = "Usage: ~doyouloveme";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        if(isOwner(event.getAuthor().getId())) {
            event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + yes[(int)(Math.random()*6)]);
        }
        else if(isTyler(event.getAuthor().getId())){
            event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + noTyler[(int)(Math.random()*12)]);
        }
        else {
            event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + no[(int)(Math.random()*9)]);
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

