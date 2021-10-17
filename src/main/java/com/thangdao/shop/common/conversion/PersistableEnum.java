package com.thangdao.shop.common.conversion;

/**
 * The interface of all persistable enums.<br/>
 * Ref:
 * https://stackoverflow.com/questions/23564506/is-it-possible-to-write-a-generic-enum-converter-for-jpa
 * 
 *
 * @param <T>
 */
public interface PersistableEnum<T> {
	T getId();
}
