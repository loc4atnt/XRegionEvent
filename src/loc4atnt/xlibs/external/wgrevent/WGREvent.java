package loc4atnt.xlibs.external.wgrevent;

import org.bukkit.plugin.Plugin;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

import loc4atnt.xlibs.external.XRegionEvent.XRegionEvent;

public class WGREvent {

	private WGREventListener listener;
	public static WorldGuardPlugin wgPlugin;

	public void register() {
		wgPlugin = getWGPlugin();
		if (wgPlugin == null) {
			XRegionEvent.getInst().getLogger().warning("Could not find WorldGuard, disabling WorldGuardEvent - DOL.");
			return;
		}
		this.listener = new WGREventListener();
		XRegionEvent.getInst().getServer().getPluginManager().registerEvents(this.listener, XRegionEvent.getInst());
	}

	private WorldGuardPlugin getWGPlugin() {
		Plugin plugin = XRegionEvent.getInst().getServer().getPluginManager().getPlugin("WorldGuard");
		if ((plugin == null) || (!(plugin instanceof WorldGuardPlugin))) {
			return null;
		}
		return (WorldGuardPlugin) plugin;
	}
}