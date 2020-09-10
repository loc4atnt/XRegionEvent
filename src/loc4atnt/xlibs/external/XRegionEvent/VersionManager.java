package loc4atnt.xlibs.external.XRegionEvent;

import org.bukkit.Location;
import org.bukkit.World;

import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.RegionContainer;

public class VersionManager {

	public RegionManager getWGRegionManager(World world) {
		RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();
		return container.get(BukkitAdapter.adapt(world));
	}

	public ApplicableRegionSet getApplicableRegionSet(Location loca) {
		RegionManager rm = getWGRegionManager(loca.getWorld());
		return rm.getApplicableRegions(BlockVector3.at(loca.getX(), loca.getY(), loca.getZ()));
	}
}
