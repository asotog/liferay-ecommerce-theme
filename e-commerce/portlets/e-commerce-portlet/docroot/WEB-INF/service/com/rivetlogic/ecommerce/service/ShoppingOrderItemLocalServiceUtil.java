/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.ecommerce.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ShoppingOrderItem. This utility wraps
 * {@link com.rivetlogic.ecommerce.service.impl.ShoppingOrderItemLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author isaiulate
 * @see ShoppingOrderItemLocalService
 * @see com.rivetlogic.ecommerce.service.base.ShoppingOrderItemLocalServiceBaseImpl
 * @see com.rivetlogic.ecommerce.service.impl.ShoppingOrderItemLocalServiceImpl
 * @generated
 */
public class ShoppingOrderItemLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.ecommerce.service.impl.ShoppingOrderItemLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the Shopping Order Item to the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem addShoppingOrderItem(
		com.rivetlogic.ecommerce.model.ShoppingOrderItem shoppingOrderItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addShoppingOrderItem(shoppingOrderItem);
	}

	/**
	* Creates a new Shopping Order Item with the primary key. Does not add the Shopping Order Item to the database.
	*
	* @param itemId the primary key for the new Shopping Order Item
	* @return the new Shopping Order Item
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem createShoppingOrderItem(
		long itemId) {
		return getService().createShoppingOrderItem(itemId);
	}

	/**
	* Deletes the Shopping Order Item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the Shopping Order Item
	* @return the Shopping Order Item that was removed
	* @throws PortalException if a Shopping Order Item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem deleteShoppingOrderItem(
		long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteShoppingOrderItem(itemId);
	}

	/**
	* Deletes the Shopping Order Item from the database. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem deleteShoppingOrderItem(
		com.rivetlogic.ecommerce.model.ShoppingOrderItem shoppingOrderItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteShoppingOrderItem(shoppingOrderItem);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem fetchShoppingOrderItem(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchShoppingOrderItem(itemId);
	}

	/**
	* Returns the Shopping Order Item with the primary key.
	*
	* @param itemId the primary key of the Shopping Order Item
	* @return the Shopping Order Item
	* @throws PortalException if a Shopping Order Item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem getShoppingOrderItem(
		long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getShoppingOrderItem(itemId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Shopping Order Items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ecommerce.model.impl.ShoppingOrderItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Shopping Order Items
	* @param end the upper bound of the range of Shopping Order Items (not inclusive)
	* @return the range of Shopping Order Items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.ecommerce.model.ShoppingOrderItem> getShoppingOrderItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getShoppingOrderItems(start, end);
	}

	/**
	* Returns the number of Shopping Order Items.
	*
	* @return the number of Shopping Order Items
	* @throws SystemException if a system exception occurred
	*/
	public static int getShoppingOrderItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getShoppingOrderItemsCount();
	}

	/**
	* Updates the Shopping Order Item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shoppingOrderItem the Shopping Order Item
	* @return the Shopping Order Item that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem updateShoppingOrderItem(
		com.rivetlogic.ecommerce.model.ShoppingOrderItem shoppingOrderItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateShoppingOrderItem(shoppingOrderItem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.rivetlogic.ecommerce.model.ShoppingOrderItem> findByOrderId(
		long orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByOrderId(orderId);
	}

	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem findByOrderAndProductId(
		long orderId, java.lang.String productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByOrderAndProductId(orderId, productId);
	}

	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem createOrderItem(
		long orderId) {
		return getService().createOrderItem(orderId);
	}

	public static com.rivetlogic.ecommerce.model.ShoppingOrderItem updateOrderItem(
		com.rivetlogic.ecommerce.model.ShoppingOrderItem shoppingOrderItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOrderItem(shoppingOrderItem);
	}

	public static void saveOrderItemsByProductId(
		java.util.List<java.lang.String> productIdsList,
		com.rivetlogic.ecommerce.model.ShoppingOrder shoppingOrder)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().saveOrderItemsByProductId(productIdsList, shoppingOrder);
	}

	public static void clearService() {
		_service = null;
	}

	public static ShoppingOrderItemLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ShoppingOrderItemLocalService.class.getName());

			if (invokableLocalService instanceof ShoppingOrderItemLocalService) {
				_service = (ShoppingOrderItemLocalService)invokableLocalService;
			}
			else {
				_service = new ShoppingOrderItemLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ShoppingOrderItemLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ShoppingOrderItemLocalService service) {
	}

	private static ShoppingOrderItemLocalService _service;
}