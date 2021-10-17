package com.thangdao.shop.common;

import com.thangdao.shop.common.conversion.AbstractEnumConverter;
import com.thangdao.shop.common.conversion.PersistableEnum;

public class EnumConstants {

	public enum ApplicationState implements PersistableEnum<Integer> {
		NOT_APPLIED(0), LATEST_APPLIED(1), APPLIED(2);

		private final int id;

		private ApplicationState(int id) {
			this.id = id;
		}

		public static ApplicationState getFromId(int id) {
			for (ApplicationState type : values()) {
				if (type.id == id) {
					return type;
				}
			}
			return null;
		}

		public Integer getId() {
			return this.id;
		}
	}

	public static class ApplicationStateConverter extends AbstractEnumConverter<ApplicationState, Integer> {
		public ApplicationStateConverter() {
			super(ApplicationState.class);
		}
	}

	public enum MonitoringType implements PersistableEnum<Integer> {
		INSPECTION(0), MAINTENANCE(1), OVERHAUL(2), NEW(3);

		private final int id;

		private MonitoringType(int id) {
			this.id = id;
		}

		public static MonitoringType getFromId(int id) {
			for (MonitoringType type : values()) {
				if (type.id == id) {
					return type;
				}
			}
			return null;
		}

		public Integer getId() {
			return this.id;
		}
	}

	public static class MonitoringTypeConverter extends AbstractEnumConverter<MonitoringType, Integer> {
		public MonitoringTypeConverter() {
			super(MonitoringType.class);
		}
	}

}

