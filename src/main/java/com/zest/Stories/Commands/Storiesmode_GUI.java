package com.zest.Stories.Commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.EventListener;

public class Storiesmode_GUI implements CommandExecutor {

    public static Inventory Stories = Bukkit.createInventory(null, 27, ChatColor.GOLD + "Stories");


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player player = (Player) sender;


        boolean success = Storiesmode_GUI.openGUI(player);

        if (!success) {

            player.sendMessage(ChatColor.DARK_RED + "could not open GUI!");

        }



        return true;
    }




    public static boolean openGUI(Player player) {

        ItemStack Unlock = new ItemStack(Material.SLIME_BLOCK);
        ItemMeta unlock = Unlock.getItemMeta();
        unlock.setDisplayName(ChatColor.GREEN + "Unlocked");
        Unlock.setItemMeta(unlock);

        ItemStack Locked = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta locked = Locked.getItemMeta();
        locked.setDisplayName(ChatColor.GREEN + "Locked");
        Locked.setItemMeta(locked);



        Stories.setItem(0, Unlock);
        Stories.setItem(1, Unlock);
        Stories.setItem(2, Unlock);
        Stories.setItem(3, Unlock);
        Stories.setItem(4, Unlock);
        Stories.setItem(5, Unlock);
        Stories.setItem(6, Unlock);
        Stories.setItem(7, Unlock);
        Stories.setItem(8, Unlock);

        Stories.setItem(9, Locked);
        Stories.setItem(10, Locked);
        Stories.setItem(12, Locked);
        Stories.setItem(13, Locked);
        Stories.setItem(14, Locked);
        Stories.setItem(15, Locked);
        Stories.setItem(16, Locked);
        Stories.setItem(17, Locked);

        Stories.setItem(11, Locked);
        Stories.setItem(12, Locked);
        Stories.setItem(13, Locked);
        Stories.setItem(14, Locked);
        Stories.setItem(15, Locked);
        Stories.setItem(16, Locked);
        Stories.setItem(17, Locked);
        Stories.setItem(18, Locked);

        Stories.setItem(19, Locked);
        Stories.setItem(20, Locked);
        Stories.setItem(21, Locked);
        Stories.setItem(22, Locked);
        Stories.setItem(23, Locked);
        Stories.setItem(24, Locked);
        Stories.setItem(25, Locked);
        Stories.setItem(26, Locked);






        player.openInventory(Stories);


        return true;
    }
        @EventHandler



        public void onClick(InventoryClickEvent e){

            Player player = (Player) e.getWhoClicked();


            if (e.getInventory().getTitle().equals(ChatColor.GOLD + "Stories")){


                if(e.getSlot() == 2 )

                    e.setCancelled(true);

                    e.getWhoClicked().sendMessage(ChatColor.DARK_PURPLE + "Coming soon");

                    e.getWhoClicked().closeInventory();
            }
                else if (e.getSlot() == 1) {

                e.setCancelled(true);



                player.sendMessage("Story 1 locked");
                player.closeInventory();

            }
            else {

                return;
            }





        }



}
