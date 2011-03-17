/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;
import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLinkModel;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the DDMStorageLink service. Represents a row in the &quot;DDMStorageLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portlet.dynamicdatamapping.model.DDMStorageLinkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DDMStorageLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStorageLinkImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink
 * @see com.liferay.portlet.dynamicdatamapping.model.DDMStorageLinkModel
 * @generated
 */
public class DDMStorageLinkModelImpl extends BaseModelImpl<DDMStorageLink>
	implements DDMStorageLinkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a d d m storage link model instance should use the {@link com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink} interface instead.
	 */
	public static final String TABLE_NAME = "DDMStorageLink";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "storageLinkId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table DDMStorageLink (uuid_ VARCHAR(75) null,storageLinkId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table DDMStorageLink";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink"));

	public DDMStorageLinkModelImpl() {
	}

	public long getPrimaryKey() {
		return _storageLinkId;
	}

	public void setPrimaryKey(long pk) {
		setStorageLinkId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_storageLinkId);
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStorageLinkId() {
		return _storageLinkId;
	}

	public void setStorageLinkId(long storageLinkId) {
		_storageLinkId = storageLinkId;
	}

	public DDMStorageLink toEscapedModel() {
		if (isEscapedModel()) {
			return (DDMStorageLink)this;
		}
		else {
			return (DDMStorageLink)Proxy.newProxyInstance(DDMStorageLink.class.getClassLoader(),
				new Class[] { DDMStorageLink.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					DDMStorageLink.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		DDMStorageLinkImpl ddmStorageLinkImpl = new DDMStorageLinkImpl();

		ddmStorageLinkImpl.setUuid(getUuid());

		ddmStorageLinkImpl.setStorageLinkId(getStorageLinkId());

		return ddmStorageLinkImpl;
	}

	public int compareTo(DDMStorageLink ddmStorageLink) {
		long pk = ddmStorageLink.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DDMStorageLink ddmStorageLink = null;

		try {
			ddmStorageLink = (DDMStorageLink)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = ddmStorageLink.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", storageLinkId=");
		sb.append(getStorageLinkId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>storageLinkId</column-name><column-value><![CDATA[");
		sb.append(getStorageLinkId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _storageLinkId;
	private transient ExpandoBridge _expandoBridge;
}