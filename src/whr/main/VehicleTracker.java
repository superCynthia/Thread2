package whr.main;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//ģʽ��ɫ��Manipulator(����ά��ImmutableObject����ģ����ʵ����ʵ��״̬�ı��,����Ӧ��ʵ��״̬�ı�ʱ�����������µ�ImmutableObjectʵ��)
public class VehicleTracker {
	
	private Map<String, Location> locMap = new ConcurrentHashMap<String, Location>();

	public void updateLocation(String vehicleID, Location newLocation) {
		locMap.put(vehicleID, newLocation);
	}
}
