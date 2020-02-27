/**
 * 
 */
package com.tofek.Wishlist.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tofek.Wishlist.model.Wish;

/**
 * @author tkhan26
 *
 */
@Service
public class WishlistService {

	@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	@Value("${db.wishlist.endpoint}")
	private String DB_ENDPOINT;

	public List<Wish> getWishList() {
		System.out.println("Test ");
		return restTemplate.getForObject("http://localhost:8091/wishlist", List.class);
	}
	
	public void addWish(Wish wish) {
		System.out.println("Inside add wish ");
		try {
			URI uri = new URI("http://localhost:8091/addWish");
			restTemplate.postForObject(uri, wish, Wish.class);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//restTemplate.exchange("http://localhost:8091/addWish", "POST", null, null);
	}
	
	public void updateWish(Wish wish) {
		System.out.println("Inside update wish ");
		try {
			URI uri = new URI("http://localhost:8091/addWish");
			restTemplate.postForObject(uri, wish, Wish.class);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		//restTemplate.exchange("http://localhost:8091/addWish", "POST", null, null);
	}
	
	public void deleteWish(Integer wishId) {
		System.out.println("Inside delete wish ");
		restTemplate.delete("http://localhost:8091/deleteWish/"+wishId);
	}

}
