/**
 * 
 */
package com.tofek.Wishlist.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tofek.Wishlist.model.Wish;
import com.tofek.Wishlist.service.WishlistService;

/**
 * @author tkhan26
 *
 */
@RestController
public class WishController {
	
	//@Autowired
	WishlistService wishListService = new  WishlistService();
	
	@GetMapping("/wishlist")
	public List<Wish> getWishList() {	
		System.out.println("Inside a controller");
		return wishListService.getWishList();		
	}

	@PostMapping(value = "/addWish", consumes = "application/json", produces = "application/json")
	public void addWish(@RequestBody Wish wish) {
		System.out.println("Inside into addWish method"+wish.getWishName());
		wishListService.addWish(wish);
	}
	
	@PutMapping(value = "/updateWish", consumes = "application/json", produces = "application/json")
	public void updateWish(@RequestBody Wish wish) {
		System.out.println("Inside into addWish method"+wish.getWishName());
		wishListService.updateWish(wish);
	}
	
	
	@DeleteMapping("/deleteWish/{wishId}")
	public void deleteWish(@PathVariable("wishId") int wishId) {
		System.out.println("Inside into deleteWish method"+wishId);
		wishListService.deleteWish(wishId);
	}
	
}
