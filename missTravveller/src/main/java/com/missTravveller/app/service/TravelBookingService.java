package com.missTravveller.app.service;

import com.missTravveller.app.model.TravelBooking;

public interface TravelBookingService {

	TravelBooking create
	PurchaseHasProducts createOrderHasProduct(PurchaseHasProducts purchaseHasProduct);
	Iterable<PurchaseHasProducts> getPurchaseHasProducts();	
	PurchaseHasProducts getPurchaseHasProductByCompositeId(Long purchaseId, Long productId);	
	Iterable<PurchaseHasProducts> getPurchaseHasProductsByPurchaseId(Long purchaseId);		
	PurchaseHasProducts updatePurchaseHasProductByCompositeId(PurchaseHasProducts purchaseHasProduct, long purchaseId, long productId);
	void deletePurchaseHasProductByCompositeId(Long purchaseId, Long productId);
}
