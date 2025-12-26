package com.survival.core;

import org.bukkit.plugin.java.JavaPlugin;

public class CorePlugin extends JavaPlugin {
    
    private static CorePlugin instance;
    
    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("SurvivalCore habilitado!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("SurvivalCore desabilitado!");
    }
    
    public static CorePlugin getInstance() {
        return instance;
    }
}
