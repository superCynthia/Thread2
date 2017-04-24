package whr.main;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//模式角色：Manipulator(负责维护ImmutableObject所建模的现实世界实体状态的变更,当相应的实体状态改变时，负责生成新的ImmutableObject实例)
public class VehicleTracker {
	
	private Map<String, Location> locMap = new ConcurrentHashMap<String, Location>();

	public void updateLocation(String vehicleID, Location newLocation) {
		locMap.put(vehicleID, newLocation);
	}
}
