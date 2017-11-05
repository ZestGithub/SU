package com.zest.Stories;



import com.zest.Stories.Commands.Storiesmode_GUI;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.logging.Logger;

public final class Stories extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

          getCommand("sm").setExecutor(new Storiesmode_GUI());

        logger.info(pdfFile.getName() + "has been enabled(v."
                       + pdfFile.getVersion() +")" );

    }

    @Override
    public void onDisable() {
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        logger.info(pdfFile.getName() + "has been disabled(v."
                + pdfFile.getVersion() + ")");
    }





}
