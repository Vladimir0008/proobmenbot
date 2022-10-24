package com.finance.ProExchangeBot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {

     @Value(value = "${bot.name}")
     String botName;

    @Value(value = "${bot.token}")
    String token;
}
