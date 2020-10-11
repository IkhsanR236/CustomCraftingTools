package me.IcanR.EmeraldPickaxe;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.addRecipe(getPickaxeRecipe());

	}

	@Override
	public void onDisable() {

	}
	
	public ShapedRecipe getPickaxeRecipe() {
		
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "*Emerald Pickaxe*");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.YELLOW + "" + ChatColor.BOLD + ">>Contains");
		lore.add("___________________");
		lore.add("");
		lore.add(ChatColor.AQUA + "*  Fortune 3");
		lore.add(ChatColor.AQUA + "*  Efficiency 3");
		lore.add(ChatColor.AQUA + "*  Unbreaking 3");
		lore.add("");
		lore.add("___________________");
		lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "The Emerald Pickaxe");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		item.setItemMeta(meta);
		
		NamespacedKey Key = new NamespacedKey(this, "emerald_pickaxe");
		
		ShapedRecipe recipe = new ShapedRecipe(Key, item);
		
		recipe.shape("EEE", " S ", " S ");
		
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('E', Material.EMERALD_BLOCK);
		
		return recipe;
	}
	
}
