package de.armani;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;

public class App {

    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "";

        DiscordApi api = new DiscordApiBuilder().setToken(token)
        .addIntents(Intent.MESSAGE_CONTENT)
        .login()
        .join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });


    }
    
}

