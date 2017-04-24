package whr.main;

/**
 * Immutable Object （不可变对象）模式
 * 
 * @author superCynthia
 *
 */
/*
 * 角色模式：Immutable Object不可变对象，final
 * 通过坐标的形式标识vehicle的位置信息
 */
public final class Location {

	public final double x;
	public final double y;

	public Location(double x, double y) {
		this.x = x;
		this.y = y;
	}
}
