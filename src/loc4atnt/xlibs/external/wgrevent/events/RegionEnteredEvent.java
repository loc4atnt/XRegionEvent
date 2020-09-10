package loc4atnt.xlibs.external.wgrevent.events;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;

import loc4atnt.xlibs.external.wgrevent.MovementWay;

public class RegionEnteredEvent
  extends RegionEvent
{
  public RegionEnteredEvent(ProtectedRegion region, Player player, MovementWay movement, PlayerEvent parent)
  {
    super(region, player, movement, parent);
  }
}