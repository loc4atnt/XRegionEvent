package loc4atnt.xlibs.external.XRegionEvent;

import org.bukkit.plugin.java.JavaPlugin;

import loc4atnt.xlibs.external.wgrevent.WGREvent;

public class XRegionEvent extends JavaPlugin {

	private static XRegionEvent inst;

	private VersionManager verMnger;

	public static XRegionEvent getInst() {
		return inst;
	}

	@Override
	public void onEnable() {
		inst = this;

		verMnger = new VersionManager();
		new WGREvent().register();
	}

	public VersionManager getVersionManager() {
		return verMnger;
	}
}
